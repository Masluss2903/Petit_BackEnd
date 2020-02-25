package com.generation.petit.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "veterinary")
public class Veterinary{
    
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private int veterinary_id;

    @Column(nullable = false)
    private String veterinary_name;

    @Column(nullable = false)
    private String veterinary_address;

    @Column
    private String veterinary_phone;

    @Column
    private String veterinary_photo;

    @Column
    private String veterinary_rating;

    public Veterinary() {
    }

    public Veterinary(int veterinary_id, String veterinary_name, String veterinary_address, String veterinary_phone,
            String veterinary_photo, String veterinary_rating) {
        this.veterinary_id = veterinary_id;
        this.veterinary_name = veterinary_name;
        this.veterinary_address = veterinary_address;
        this.veterinary_phone = veterinary_phone;
        this.veterinary_photo = veterinary_photo;
        this.veterinary_rating = veterinary_rating;
    }

    public int getVeterinary_id() {
        return veterinary_id;
    }

    public void setVeterinary_id(int veterinary_id) {
        this.veterinary_id = veterinary_id;
    }

    public String getVeterinary_name() {
        return veterinary_name;
    }

    public void setVeterinary_name(String veterinary_name) {
        this.veterinary_name = veterinary_name;
    }

    public String getVeterinary_address() {
        return veterinary_address;
    }

    public void setVeterinary_address(String veterinary_address) {
        this.veterinary_address = veterinary_address;
    }

    public String getVeterinary_phone() {
        return veterinary_phone;
    }

    public void setVeterinary_phone(String veterinary_phone) {
        this.veterinary_phone = veterinary_phone;
    }

    public String getVeterinary_photo() {
        return veterinary_photo;
    }

    public void setVeterinary_photo(String veterinary_photo) {
        this.veterinary_photo = veterinary_photo;
    }

    public String getVeterinary_rating() {
        return veterinary_rating;
    }

    public void setVeterinary_rating(String veterinary_rating) {
        this.veterinary_rating = veterinary_rating;
    }


    


}