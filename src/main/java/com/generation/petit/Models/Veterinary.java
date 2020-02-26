package com.generation.petit.Models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
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
    @OneToMany(mappedBy = "veterinary")
    private List<Pet> pets;    

    @OneToOne(mappedBy = "veterinary")
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

    


}