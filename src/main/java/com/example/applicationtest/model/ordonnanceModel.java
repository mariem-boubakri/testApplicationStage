package com.example.applicationtest.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ordonnance")
public class ordonnanceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String body;
    //private String requester;
    private Date date;
    private String logo;
@OneToOne
private patientModel patient;

@OneToOne
private medecinModel medecin;

@OneToOne
private pharamacienModel phamacien;

    public ordonnanceModel() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }




}
