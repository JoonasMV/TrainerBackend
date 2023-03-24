package com.example.trainerbackend.controller;

import com.example.trainerbackend.entities.ExerciseType;
import com.example.trainerbackend.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController {

    @Autowired
    ExerciseRepository exerciseRepository;
    @Autowired
    ExerciseSetRepository exerciseSetRepository;
    @Autowired
    ExerciseTypeRepository exerciseTypeRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    WorkoutRepository workoutRepository;

    @DeleteMapping("/dev/clear")
    public void clearDatabase() {
        exerciseRepository.deleteAll();
        exerciseSetRepository.deleteAll();
        exerciseTypeRepository.deleteAll();
        userRepository.deleteAll();
        workoutRepository.deleteAll();
    }

    @PostMapping("dev/initDatabase")
    public void initDatabase() {
        String[] basicExercises = {
            "squat", "front squat", "bench press", "incline bench press",
            "dumbbell press", "deadlift", "romanian deadlift", "barbell row",
            "overhead press", "barbell curl", "dumbbell curl", "tricep extension"
        };

        for (String exerciseType: basicExercises) {
            exerciseTypeRepository.save(new ExerciseType(exerciseType));
        }
    }

}
