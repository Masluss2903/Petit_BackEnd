package com.generation.petit.Models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
 
@Entity
@Table(name = "pet_has_vaccines")
public class PetVaccines {
    private long id;
    private Pet pet;
    private Vaccines vaccines;
     
    private Date date;

    
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_vaccines_id")
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pet_pet_id")
    @JsonIgnore 
    public Pet getPet() {
        return pet;
    }
 
    public void setPet(Pet pet) {
        this.pet = pet;
    }
 
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vaccines_vaccine_id")
    public Vaccines getVaccines() {
        return vaccines;
    }
 
    public void setVaccines(Vaccines vaccines) {
        this.vaccines = vaccines;
    }
 
    @Column(name = "pet_vac_date")
    @Temporal(TemporalType.DATE)
    public Date getDate() {
        return date;
    }
 
    public void setDate(Date date) {
        this.date = date;
    }

    public PetVaccines() {
    }

    public PetVaccines(Vaccines vaccines, Date date) {
        this.vaccines = vaccines;
        this.date = date;
    }
}