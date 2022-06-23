package com.example.applicationtest.controller;

import com.example.applicationtest.model.ordonnanceModel;
import com.example.applicationtest.model.userModel;
import com.example.applicationtest.service.OrdonnanceServiceInterface;
import com.sun.xml.bind.v2.schemagen.xmlschema.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@CrossOrigin("*")
@RestController
@RequestMapping(value ="/api/v1")
public class OrdonnanceController {
    private final OrdonnanceServiceInterface ordonnanceServiceInterface;

    @Autowired
    public OrdonnanceController(OrdonnanceServiceInterface ordonnanceServiceInterface) {
        this.ordonnanceServiceInterface = ordonnanceServiceInterface;
    }
    @GetMapping("/ordonnances")
    public ResponseEntity<List<ordonnanceModel>> getAllOrdonnances(){
        List<ordonnanceModel> ords= ordonnanceServiceInterface.findAllOrdonnaces();
        return new ResponseEntity<>(ords, HttpStatus.OK);
    }
    @PostMapping("/ordonnances")
    public ResponseEntity<userModel> createOrdonnance(@RequestBody ordonnanceModel ordAdd){
        ordonnanceModel ord1=ordonnanceServiceInterface.AddOrdonnance(ordAdd);
        return new ResponseEntity(ord1,HttpStatus.OK);//<>
    }
    @GetMapping("/ordonnances/{id}")
    public ResponseEntity<ordonnanceModel> getOrdonnanceById(@PathVariable Long id){
        ordonnanceModel ord =ordonnanceServiceInterface.findOrdonnanceById(id);
        return new ResponseEntity<>(ord, HttpStatus.OK);

    }
    @PutMapping("/ordonnances/{id}")

    public ResponseEntity<ordonnanceModel> updateOrdonnance(@PathVariable Long id, @RequestBody ordonnanceModel ordDetails){
        ordonnanceModel t1=ordonnanceServiceInterface.updateOrdonnance(id,ordDetails);
        return   new ResponseEntity<>(t1,HttpStatus.OK);
    }
    @DeleteMapping("/ordonnances/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteOrdonnance(@PathVariable Long id){
        Map<String,Boolean> response=ordonnanceServiceInterface.deleteOrdonnance(id);
        return  ResponseEntity.ok(response);
    }
    @GetMapping("ordonnances1/{id}")
    public ResponseEntity<Date> getDateById(@PathVariable Long id){
        Date date= ordonnanceServiceInterface.getDateOfOrdonnace(id);
        return new ResponseEntity<>(date, HttpStatus.OK);
    }
    @GetMapping("ordonnances2/{id}")
    public ResponseEntity<Any> getTitleById(@PathVariable Long id){
        ordonnanceServiceInterface.getTitleOfOrdonnace(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
