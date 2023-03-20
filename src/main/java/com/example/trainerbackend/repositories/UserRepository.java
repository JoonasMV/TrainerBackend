package com.example.trainerbackend.repositories;

import com.example.trainerbackend.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
