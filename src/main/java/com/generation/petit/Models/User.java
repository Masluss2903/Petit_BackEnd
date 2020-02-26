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



}