package com.generation.petit.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "user")
public class User{
    
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private int user_id;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Date register_date;

    @Column(nullable = false)
    private String email;

    @Column
    private String client_phone;

    
    public User(int user_id, String password, Date register_date, String email, String client_phone) {
        this.user_id = user_id;
        this.password = password;
        this.register_date = register_date;
        this.email = email;
        this.client_phone = client_phone;
    }

    public User() {
    }
    


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegister_date() {
        return register_date;
    }

    public void setRegister_date(Date register_date) {
        this.register_date = register_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClient_phone() {
        return client_phone;
    }

    public void setClient_phone(String client_phone) {
        this.client_phone = client_phone;
    }




    

}