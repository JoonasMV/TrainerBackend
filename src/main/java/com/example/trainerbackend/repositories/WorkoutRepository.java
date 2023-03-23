package com.example.trainerbackend.repositories;

import com.example.trainerbackend.entities.Workout;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface WorkoutRepository extends CrudRepository<Workout, UUID> {
}
