package com.generation.petit.Models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
@Table(name = "vaccines")
public class Vaccines{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="vaccine_id", nullable = false)
    private int vaccineId;

    @Column(name = "vaccine_name", nullable = false)
    private String vaccineName;


    @ManyToMany(mappedBy = "petVaccines")
    @JsonIgnoreProperties("petVaccines")
    List<Pet> pets;

    public Vaccines() {
    }

    public Vaccines(String vaccineName, List<Pet> pets) {
        this.vaccineName = vaccineName;
        this.pets = pets;
    }

    public int getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(int vaccineId) {
        this.vaccineId = vaccineId;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }


 
    

}