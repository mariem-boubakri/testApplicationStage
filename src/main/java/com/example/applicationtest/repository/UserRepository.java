package com.example.applicationtest.repository;

import com.example.applicationtest.model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<userModel,Long> {

}
