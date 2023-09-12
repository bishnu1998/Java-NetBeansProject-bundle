
package com.tech.blog.entities;

import java.sql.Timestamp;


public class User {
    private int id;
    private String name;
    private String password;
    private String email;
    private String profile;
    private Timestamp dateTime;

    public User(int id, String name, String password, String email, String profile, Timestamp dateTime) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.profile = profile;
        this.dateTime = dateTime;
    }

    public User() {
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
