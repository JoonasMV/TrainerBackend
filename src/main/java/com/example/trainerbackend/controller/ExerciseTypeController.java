package com.example.trainerbackend.controller;

import com.example.trainerbackend.entities.ExerciseType;
import com.example.trainerbackend.repositories.ExerciseTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
public class ExerciseTypeController {

    @Autowired
    private ExerciseTypeRepository exerciseTypeRepository;

    @GetMapping("/exerciseTypes")
    @ResponseBody
    public Iterable<ExerciseType> getAllExerciseTypes() {
        return exerciseTypeRepository.findAll();
    }

    @GetMapping("exerciseTypes/{id}")
    @ResponseBody
    public Optional<ExerciseType> getExerciseTypeById(@PathVariable UUID id) {
        System.out.println(id);
        return exerciseTypeRepository.findById(id);
    }

    @PostMapping("/exerciseTypes")
    public ExerciseType createExerciseType(@RequestBody ExerciseType newExerciseType) {
        System.out.println(newExerciseType);
        return exerciseTypeRepository.save(newExerciseType);
    }
}
