package com.example.trainerbackend.controller;

import com.example.trainerbackend.entities.User;
import com.example.trainerbackend.repositories.UserRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("users/{id}")
    @ResponseBody
    public Optional<User> getUserById(@PathVariable int id) {
        System.out.println(id);
        return userRepository.findById(id);
    }

    @PostMapping("/users")
//    @JsonIgnore
    public User createUser(@RequestBody User newUser) {
        System.out.println(newUser);
        return userRepository.save(newUser);
    }
}
