package com.generation.petit.Models;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "pet")
public class Pet{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_id", nullable = false)
    private int petId;

    @Column(name = "pet_name", nullable = false)
    private String petName;

    @Column(name = "pet_breed")
    private String petBreed;

    @Column(name = "pet_gender", nullable = false)
    private String petGender;

    @Column(name = "pet_color")
    private String petColor;

    @Column(name = "pet_birthday", nullable = false)
    private Date petBirthday;

    @Column(name = "pet_weight")
    private int petWeight;

    @Column(name = "pet_bloodtype")
    private String petBloodtype;

    @Column(name = "pet_signal")
    private String petSignal;

    @Column(name = "pet_photo")
    private String petPhoto;

    //en la anotacion join column del atributo name hace referencia al nombre de la columna de la tabla
    @ManyToOne
    @JoinColumn(name = "client_client_id")
    private Client client;

    // relacion de veterinary
    @ManyToOne
    @JoinColumn(name = "veterinary_vet_id")
    private Veterinary veterinary;


    @ManyToMany
    @JoinTable(
        name = "pet_has_vaccines",
        joinColumns =  @JoinColumn(name = "pet_pet_id"),
        inverseJoinColumns = @JoinColumn(name = "vaccines_vaccine_id"))
    List<Vaccines> petVaccines;

    public Pet() {

    }

    public Pet(String petName, String petBreed, String petGender, String petColor, Date petBirthday, int petWeight,
            String petBloodtype, String petSignal, String petPhoto, Client client, Veterinary veterinary) {
        this.petName = petName;
        this.petBreed = petBreed;
        this.petGender = petGender;
        this.petColor = petColor;
        this.petBirthday = petBirthday;
        this.petWeight = petWeight;
        this.petBloodtype = petBloodtype;
        this.petSignal = petSignal;
        this.petPhoto = petPhoto;
        this.client = client;
        this.veterinary = veterinary;
    
    }

    public List<Vaccines> getPetVaccines() {
        return petVaccines;
    }

    public void setPetVaccines(List<Vaccines> petVaccines) {
        this.petVaccines = petVaccines;
    }


}