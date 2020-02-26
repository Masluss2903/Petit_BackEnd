package com.generation.petit.Models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Table(name = "user")
public class User{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private int userId;

    @Column(nullable = false)
    private String password;

    @Column(name = "register_date", nullable = false)
    private Date registerDate;

    @Column(nullable = false)
    private String email;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "client_client_id",referencedColumnName = "client_id")
    private Client client;
    
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "veterinary_vet_id",referencedColumnName = "vet_id")
    private Veterinary veterinary;
    


    public User() {
    }

    public User(String password, Date registerDate, String email, Client client, Veterinary veterinary) {
        this.password = password;
        this.registerDate = registerDate;
        this.email = email;
        this.client = client;
        this.veterinary = veterinary;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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



}