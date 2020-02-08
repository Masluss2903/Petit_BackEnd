package com.generation.petit;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "pet")
public class Pet{

    @Id
    @GeneratedValue
    @Column(name = "pet_id", nullable = false)
    private int id;

    @Column(name = "pet_name", nullable = false)
    private String name;

    @Column(name = "pet_breed", nullable = false)
    private String breed;

    @Column(name = "pet_gender", nullable = false)
    private String gender;

    @Column(name = "pet_color", nullable = false)
    private String color;

    @Column(name = "pet_birthday", nullable = false)
    private Date birthday;

    @Column(name = "pet_weight", nullable = false)
    private int weight;

    @Column(name = "pet_bloodtype", nullable = false)
    private String bloodtype;

    @Column(name = "pet_signals", nullable = true)
    private String signals;

    
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getSignals() {
        return signals;
    }

    public void setSignals(String signals) {
        this.signals = signals;
    }

    public Pet() {
    }

    public Pet(int id) {
        this.id = id;
    }

    public Pet(int id, String name, String breed, String gender, String color, Date birthday, int weight,
            String bloodtype) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.birthday = birthday;
        this.weight = weight;
        this.bloodtype = bloodtype;
    }

    

    




    
    
 

    

    

}