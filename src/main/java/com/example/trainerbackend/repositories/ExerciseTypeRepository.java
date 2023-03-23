package com.example.trainerbackend.repositories;

import com.example.trainerbackend.entities.ExerciseType;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ExerciseTypeRepository extends CrudRepository<ExerciseType, UUID> {
}
