package com.example.trainerbackend.repositories;

import com.example.trainerbackend.entities.Workout;
import org.springframework.data.repository.CrudRepository;

public interface WorkoutRepository extends CrudRepository<Workout, Integer> {
}
