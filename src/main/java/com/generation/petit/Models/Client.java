package com.generation.petit.Models;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Table(name = "client")
public class Client{
    
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private int client_id;

    @Column(nullable = false)
    private String client_name;

    @Column
    private Date client_birthday;

    @Column
    private String client_address;

    @Column
    private String client_phone;

// mappedBy hace referencia al atributo client en la clase pet
    @OneToMany(mappedBy = "client")
    private List<Pet> pets;


    public Client() {
    }

    public Client(int client_id, String client_name, Date client_birthday, String client_address, String client_phone) {
        this.client_id = client_id;
        this.client_name = client_name;
        this.client_birthday = client_birthday;
        this.client_address = client_address;
        this.client_phone = client_phone;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public Date getClient_birthday() {
        return client_birthday;
    }

    public void setClient_birthday(Date client_birthday) {
        this.client_birthday = client_birthday;
    }

    public String getClient_address() {
        return client_address;
    }

    public void setClient_address(String client_address) {
        this.client_address = client_address;
    }

    public String getClient_phone() {
        return client_phone;
    }

    public void setClient_phone(String client_phone) {
        this.client_phone = client_phone;
    }

    

    
}