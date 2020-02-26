package com.generation.petit.Models;

import java.util.Date;
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
@Table(name = "client")
public class Client{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id", nullable = false)
    private int clientId;

    @Column(name = "client_name", nullable = false)
    private String clientName;

    @Column(name = "client_birthday")
    private Date clientBirthday;

    @Column(name = "client_address")
    private String clientAddress;

    @Column(name = "client_phone")
    private String clientPhone;

// mappedBy hace referencia al atributo client en la clase pet
    @OneToMany(mappedBy = "client")
    private List<Pet> pets;

// mappedBy hace referencia al atributo client en la clase user  
    @OneToOne(mappedBy = "client")
    private User user;

    public Client() {
    }

    public Client(String clientName, Date clientBirthday, String clientAddress, String clientPhone, List<Pet> pets,
            User user) {
        this.clientName = clientName;
        this.clientBirthday = clientBirthday;
        this.clientAddress = clientAddress;
        this.clientPhone = clientPhone;
        this.pets = pets;
        this.user = user;
    }


}