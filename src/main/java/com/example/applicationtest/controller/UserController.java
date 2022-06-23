package com.example.applicationtest.controller;


import com.example.applicationtest.model.userModel;
import com.example.applicationtest.service.UserServiceInterface;
import com.sun.xml.bind.v2.schemagen.xmlschema.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin("*")
@RestController
@RequestMapping(value ="/api/v1")
public class UserController {
    private final UserServiceInterface userServiceInterface;
    @Autowired
    public UserController(UserServiceInterface userServiceInterface) {
        this.userServiceInterface = userServiceInterface;
    }

    @GetMapping("/users")
    public ResponseEntity<List<userModel>> getAllUsers(){
        List<userModel> users= userServiceInterface.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    @PostMapping("/users")
    public ResponseEntity<userModel> createUser(@RequestBody userModel userAdd){
        userModel user=userServiceInterface.AddUser(userAdd);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }
    @GetMapping("/users/{id}")
    public ResponseEntity<userModel> getUserById(@PathVariable Long id){
        userModel user =userServiceInterface.findUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);

    }
    @PutMapping("/users/{id}")

    public ResponseEntity<userModel> updateUser(@PathVariable Long id, @RequestBody userModel userDetails){
        userModel t1=userServiceInterface.updateUser(id,userDetails);
        return   new ResponseEntity<>(t1,HttpStatus.OK);
    }
    @DeleteMapping("/users/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteUser(@PathVariable Long id){
        Map<String,Boolean> response=userServiceInterface.deleteUser(id);
        return  ResponseEntity.ok(response);
    }
    @GetMapping("users1/{id}")
    public ResponseEntity<String> getStatusById(@PathVariable Long id){
        String status= userServiceInterface.getStatusOfUser(id);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
    @GetMapping("users2/{id}")
    public ResponseEntity<Any> updateStatus(@PathVariable Long id, String status){
        userServiceInterface.updateStatusOfUser(id,status);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
