package com.generation.petit.Models;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
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
    @GeneratedValue
    @Column(nullable = false)
    private int pet_id;

    @Column(nullable = false)
    private String pet_name;

    @Column
    private String pet_breed;

    @Column(nullable = false)
    private String pet_gender;

    @Column
    private String pet_color;

    @Column(nullable = false)
    private Date pet_birthday;

    @Column
    private int pet_weight;

    @Column
    private String pet_bloodtype;

    @Column
    private String pet_signal;

    @Column
    private String pet_photo;

    //en la anotacion join column del atributo name hace referencia al nombre de la columna de la tabla
    @ManyToOne
    @JoinColumn(name = "client_client_id")
    private Client client;



    public Pet() {

    }

    public Pet(int pet_id, String pet_name, String pet_breed, String pet_gender, String pet_color, Date pet_birthday,
    int pet_weight, String pet_bloodtype, String pet_signal, String pet_photo) {
        this.pet_id = pet_id;
        this.pet_name = pet_name;
        this.pet_breed = pet_breed;
        this.pet_gender = pet_gender;
        this.pet_color = pet_color;
        this.pet_birthday = pet_birthday;
        this.pet_weight = pet_weight;
        this.pet_bloodtype = pet_bloodtype;
        this.pet_signal = pet_signal;
        this.pet_photo = pet_photo;
    }

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
    }

    public String getPet_name() {
        return pet_name;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public String getPet_breed() {
        return pet_breed;
    }

    public void setPet_breed(String pet_breed) {
        this.pet_breed = pet_breed;
    }

    public String getPet_gender() {
        return pet_gender;
    }

    public void setPet_gender(String pet_gender) {
        this.pet_gender = pet_gender;
    }

    public String getPet_color() {
        return pet_color;
    }

    public void setPet_color(String pet_color) {
        this.pet_color = pet_color;
    }

    public Date getPet_birthday() {
        return pet_birthday;
    }

    public void setPet_birthday(Date pet_birthday) {
        this.pet_birthday = pet_birthday;
    }

    public int getPet_weight() {
        return pet_weight;
    }

    public void setPet_weight(int pet_weight) {
        this.pet_weight = pet_weight;
    }

    public String getPet_bloodtype() {
        return pet_bloodtype;
    }

    public void setPet_bloodtype(String pet_bloodtype) {
        this.pet_bloodtype = pet_bloodtype;
    }

    public String getPet_signal() {
        return pet_signal;
    }

    public void setPet_signals(String pet_signal) {
        this.pet_signal = pet_signal;
    }

    public String getPet_photo() {
        return pet_photo;
    }

    public void setPet_photo(String pet_photo) {
        this.pet_photo = pet_photo;
    }

}