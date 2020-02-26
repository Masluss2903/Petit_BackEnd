package com.generation.petit.Models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
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
    List<Pet> pets;

    public Vaccines() {
    }

    public Vaccines(String vaccineName, List<Pet> pets) {
        this.vaccineName = vaccineName;
        this.pets = pets;
    }


 
    

}