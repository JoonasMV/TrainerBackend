package com.example.trainerbackend.controller;

import com.example.trainerbackend.entities.User;
import com.example.trainerbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    @ResponseBody
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("users/id/{id}")
    @ResponseBody
    public Optional<User> getUserById(@PathVariable UUID id) {
        return userRepository.findById(id);
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }
}
