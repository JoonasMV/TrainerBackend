package com.example.trainerbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
@JsonIgnoreProperties("_id")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID _id;
    private String username;

    public User() {}
    public User(String username) {
        this.username = username;
    }
    public UUID get_id() {
        return _id;
    }

    public void set_id(UUID _id) {
        this._id = _id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}

