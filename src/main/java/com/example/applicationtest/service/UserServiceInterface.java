package com.example.applicationtest.service;

import com.example.applicationtest.model.userModel;

import java.util.List;
import java.util.Map;

public interface UserServiceInterface {

    public List<userModel> findAllUsers();
    public userModel AddUser( userModel user);
    public userModel findUserById( Long id);
    public userModel updateUser(Long id,  userModel userDetails);
    public Map<String,Boolean> deleteUser(Long id);
    public String getStatusOfUser(Long id);
    public void updateStatusOfUser(Long id, String status);
}
