
package com.dbms.pro.entities;

import java.security.Timestamp;


public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String address;
    private String profile;
    private Timestamp dateTime;
    
    //constructer

    public User(int id, String name, String email, String password, String address, String profile, Timestamp dateTime) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.profile = profile;
        this.dateTime = dateTime;
    }

    public User(String name, String email, String password, String address, String profile) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.profile = profile;
    }

    public User() {
    }
    
    //getter and setter

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }
    
    
}
