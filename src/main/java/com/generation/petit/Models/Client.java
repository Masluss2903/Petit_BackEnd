package com.generation.petit.Models;

import java.util.Date;
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
    @OneToMany
    @JoinColumn(name = "client_client_id")
    @JsonIgnoreProperties("client")
    private List<Pet> pets;

// mappedBy hace referencia al atributo client en la clase user  
    @OneToOne(mappedBy = "client")
    @JsonIgnore
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

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Date getClientBirthday() {
        return clientBirthday;
    }

    public void setClientBirthday(Date clientBirthday) {
        this.clientBirthday = clientBirthday;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
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