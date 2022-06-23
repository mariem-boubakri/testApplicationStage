package com.example.applicationtest.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type",length=8)

public abstract class userModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")

    private Long id;
    private String FirstName;
    private String LastName;
    //private String requester;
    private String Email;
    private String status;
    private String password;

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getStatus() {
        return status;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setStatus(String stat) {
        status = stat;
    }


    public void setPassword(String password) {
        this.password = password;
    }
}
