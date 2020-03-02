package com.generation.petit.Models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name = "vaccines")
public class Vaccines{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="vaccine_id", nullable = false)
    private int vaccineId;

    @Column(name = "vaccine_name", nullable = false)
    private String vaccineName;

    @Column(name = "vaccine_description", nullable = false)
    private String vaccineDescription;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "vaccines", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<PetVaccines> petVaccines = new HashSet<>();

    public Vaccines() {
    }

    public Vaccines(int vaccineId) {
        this.vaccineId = vaccineId;
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

    public Set<PetVaccines> getPetVaccines() {
        return petVaccines;
    }
 
    public void setPetVaccines(Set<PetVaccines> petVaccines) {
        this.petVaccines = petVaccines;
    }
     
    public void addPetVaccines(PetVaccines petVaccines) {
        this.petVaccines.add(petVaccines);
    }

    public String getVaccineDescription() {
        return vaccineDescription;
    }

    public void setVaccineDescription(String vaccineDescription) {
        this.vaccineDescription = vaccineDescription;
    }
}