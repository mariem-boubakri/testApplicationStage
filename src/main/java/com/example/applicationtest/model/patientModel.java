package com.example.applicationtest.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("Patient")
public class patientModel extends userModel {
    private Long Num_CNSS;
    private Date dateNaiss;


    public Long getNum_CNSS() {
        return Num_CNSS;
    }

    public void setNum_CNSS(Long num_CNSS) {
        Num_CNSS = num_CNSS;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
    @OneToMany
    private List <ordonnanceModel> ordonnance;
}
