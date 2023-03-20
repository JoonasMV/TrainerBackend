package com.example.trainerbackend.repositories;

import com.example.trainerbackend.entities.ExerciseType;
import org.springframework.data.repository.CrudRepository;

public interface ExerciseTypeRepository extends CrudRepository<ExerciseType, Integer> {
}
