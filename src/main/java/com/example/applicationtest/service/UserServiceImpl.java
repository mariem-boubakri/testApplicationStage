package com.example.applicationtest.service;

import com.example.applicationtest.exception.ResourcesNotfoundException;
import com.example.applicationtest.model.userModel;
import com.example.applicationtest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class UserServiceImpl implements UserServiceInterface {

    private UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public List<userModel> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public userModel AddUser(userModel user) {
        return userRepository.save(user);
    }

    @Override
    public userModel findUserById(Long id) {
        return userRepository.findById(id).orElseThrow(()->new ResourcesNotfoundException("user doesn't exist with this id :"+id));
    }

    @Override
    public userModel updateUser(Long id, userModel userDetails) {
        userModel user1=findUserById(id);
        user1.setFirstName(userDetails.getFirstName());
        user1.setLastName(userDetails.getLastName());
        user1.setEmail(userDetails.getEmail());
        user1.setStatus(userDetails.getStatus());

        return  userRepository.save(user1);

    }

    @Override
    public Map<String, Boolean> deleteUser(Long id) {
       userModel user1=findUserById(id);
       userRepository.delete(user1);
        Map<String,Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return response;
    }

    @Override
    public String getStatusOfUser(Long id) {
        userModel user=findUserById(id);
        return  user.getStatus();
    }

    @Override
    public void updateStatusOfUser(Long id, String status) {
        userModel user=findUserById(id);
        user.setStatus(status);
    }
}
