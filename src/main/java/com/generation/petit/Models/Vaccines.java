package com.generation.petit.Models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
@Table(name = "vaccines")
public class Vaccines{
    
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private int vaccine_id;

    @Column(nullable = false)
    private String vaccine_name;


    public Vaccines(int vaccine_id, String vaccine_name) {
        this.vaccine_id = vaccine_id;
        this.vaccine_name = vaccine_name;
    }

    public int getVaccine_id() {
        return vaccine_id;
    }

    public void setVaccine_id(int vaccine_id) {
        this.vaccine_id = vaccine_id;
    }

    public String getVaccine_name() {
        return vaccine_name;
    }

    public void setVaccine_name(String vaccine_name) {
        this.vaccine_name = vaccine_name;
    }

    

}