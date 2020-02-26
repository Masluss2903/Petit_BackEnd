package com.generation.petit.Models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Table(name = "veterinary")
public class Veterinary{
    
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private int vet_id;

    @Column(nullable = false)
    private String vet_name;

    @Column(nullable = false)
    private String vet_address;

    @Column
    private String vet_phone;

    @Column
    private String vet_photo;

    @Column
    private String vet_rating;

// mappedBy hace referencia al atributo veterinary en la clase pet
    @OneToMany(mappedBy = "veterinary")
    private List<Pet> pets;    

    @OneToOne(mappedBy = "veterinary")
    private User user;

    
    public Veterinary() {
    }

    public Veterinary(int vet_id, String vet_name, String vet_address, String vet_phone, String vet_photo,
            String vet_rating) {
        this.vet_id = vet_id;
        this.vet_name = vet_name;
        this.vet_address = vet_address;
        this.vet_phone = vet_phone;
        this.vet_photo = vet_photo;
        this.vet_rating = vet_rating;
    }

    public int getVet_id() {
        return vet_id;
    }

    public void setVet_id(int vet_id) {
        this.vet_id = vet_id;
    }

    public String getVet_name() {
        return vet_name;
    }

    public void setVet_name(String vet_name) {
        this.vet_name = vet_name;
    }

    public String getVet_address() {
        return vet_address;
    }

    public void setVet_address(String vet_address) {
        this.vet_address = vet_address;
    }

    public String getVet_phone() {
        return vet_phone;
    }

    public void setVet_phone(String vet_phone) {
        this.vet_phone = vet_phone;
    }

    public String getVet_photo() {
        return vet_photo;
    }

    public void setVet_photo(String vet_photo) {
        this.vet_photo = vet_photo;
    }

    public String getVet_rating() {
        return vet_rating;
    }

    public void setVet_rating(String vet_rating) {
        this.vet_rating = vet_rating;
    }

}