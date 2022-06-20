package com.example.applicationtest.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("Pharamcien")
public class pharamacienModel extends userModel {
    private Long Num_Pharm;
    private String Nom_Pharm;
    private String addresse_Pharm;
    private Long Num_Tel;
    @OneToMany
    private List<ordonnanceModel> ordonnance;

    public Long getNum_Pharm() {
        return Num_Pharm;
    }

    public void setNum_Pharm(Long num_Pharm) {
        Num_Pharm = num_Pharm;
    }

    public String getNom_Pharm() {
        return Nom_Pharm;
    }

    public void setNom_Pharm(String nom_Pharm) {
        Nom_Pharm = nom_Pharm;
    }

    public String getAddresse_Pharm() {
        return addresse_Pharm;
    }

    public void setAddresse_Pharm(String addresse_Pharm) {
        this.addresse_Pharm = addresse_Pharm;
    }

    public Long getNum_Tel() {
        return Num_Tel;
    }

    public void setNum_Tel(Long num_Tel) {
        Num_Tel = num_Tel;
    }
}
