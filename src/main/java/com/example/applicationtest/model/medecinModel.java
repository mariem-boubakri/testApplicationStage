package com.example.applicationtest.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("Medecin")
public class medecinModel extends userModel {
    private Long CIN;
    private Date dateNaiss;


    public Long getCIN() {
        return CIN;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }
    @OneToMany
    private List<ordonnanceModel> ordonnance;

    public void setCIN(Long CIN) {
        this.CIN = CIN;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
}
