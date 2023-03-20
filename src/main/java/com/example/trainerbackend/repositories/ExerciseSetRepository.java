package com.example.trainerbackend.repositories;

import com.example.trainerbackend.entities.ExerciseSet;
import org.springframework.data.repository.CrudRepository;

public interface ExerciseSetRepository extends CrudRepository<ExerciseSet, Integer> {
}
