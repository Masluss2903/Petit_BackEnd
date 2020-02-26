package com.generation.petit.Models;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
    @JsonIgnoreProperties("pets")
    private Client client;

    // relacion de veterinary
    @ManyToOne
    @JoinColumn(name = "veterinary_vet_id")
    @JsonIgnoreProperties("pets")
    private Veterinary veterinary;


    @ManyToMany
    @JoinTable(
        name = "pet_has_vaccines",
        joinColumns =  @JoinColumn(name = "pet_pet_id"),
        inverseJoinColumns = @JoinColumn(name = "vaccines_vaccine_id"))
    @JsonIgnoreProperties("pets")
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

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public String getPetGender() {
        return petGender;
    }

    public void setPetGender(String petGender) {
        this.petGender = petGender;
    }

    public String getPetColor() {
        return petColor;
    }

    public void setPetColor(String petColor) {
        this.petColor = petColor;
    }

    public Date getPetBirthday() {
        return petBirthday;
    }

    public void setPetBirthday(Date petBirthday) {
        this.petBirthday = petBirthday;
    }

    public int getPetWeight() {
        return petWeight;
    }

    public void setPetWeight(int petWeight) {
        this.petWeight = petWeight;
    }

    public String getPetBloodtype() {
        return petBloodtype;
    }

    public void setPetBloodtype(String petBloodtype) {
        this.petBloodtype = petBloodtype;
    }

    public String getPetSignal() {
        return petSignal;
    }

    public void setPetSignal(String petSignal) {
        this.petSignal = petSignal;
    }

    public String getPetPhoto() {
        return petPhoto;
    }

    public void setPetPhoto(String petPhoto) {
        this.petPhoto = petPhoto;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Veterinary getVeterinary() {
        return veterinary;
    }

    public void setVeterinary(Veterinary veterinary) {
        this.veterinary = veterinary;
    }

    public List<Vaccines> getPetVaccines() {
        return petVaccines;
    }

    public void setPetVaccines(List<Vaccines> petVaccines) {
        this.petVaccines = petVaccines;
    }

    


}