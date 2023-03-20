package com.example.trainerbackend.repositories;

import com.example.trainerbackend.entities.Exercise;
import org.springframework.data.repository.CrudRepository;

public interface ExerciseRepository extends CrudRepository<Exercise, Integer> {
}
