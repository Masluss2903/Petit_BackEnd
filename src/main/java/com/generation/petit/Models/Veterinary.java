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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Table(name = "veterinary")
public class Veterinary{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vet_id", nullable = false)
    private int vetId;

    @Column(name = "vet_name", nullable = false)
    private String vetName;

    @Column(name = "vet_address", nullable = false)
    private String vetAddress;

    @Column(name = "vet_phone")
    private String vetPhone;

    @Column(name = "vet_photo")
    private String vetPhoto;

    @Column(name = "vet_rating")
    private String vetRating;

// mappedBy hace referencia al atributo veterinary en la clase pet
    @OneToMany
    @JoinColumn(name = "veterinary_vet_id")
    @JsonIgnoreProperties("veterinary")
    private List<Pet> pets;    

    @OneToOne(mappedBy = "veterinary")
    @JsonIgnore
    private User user;

    
    public Veterinary() {
    }

    public Veterinary(String vetName, String vetAddress, String vetPhone, String vetPhoto, String vetRating,
            List<Pet> pets, User user) {
        this.vetName = vetName;
        this.vetAddress = vetAddress;
        this.vetPhone = vetPhone;
        this.vetPhoto = vetPhoto;
        this.vetRating = vetRating;
        this.pets = pets;
        this.user = user;
    }

    public int getVetId() {
        return vetId;
    }

    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

    public String getVetName() {
        return vetName;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }

    public String getVetAddress() {
        return vetAddress;
    }

    public void setVetAddress(String vetAddress) {
        this.vetAddress = vetAddress;
    }

    public String getVetPhone() {
        return vetPhone;
    }

    public void setVetPhone(String vetPhone) {
        this.vetPhone = vetPhone;
    }

    public String getVetPhoto() {
        return vetPhoto;
    }

    public void setVetPhoto(String vetPhoto) {
        this.vetPhoto = vetPhoto;
    }

    public String getVetRating() {
        return vetRating;
    }

    public void setVetRating(String vetRating) {
        this.vetRating = vetRating;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    


}