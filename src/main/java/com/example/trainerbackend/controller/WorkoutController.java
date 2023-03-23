package com.example.trainerbackend.controller;

import com.example.trainerbackend.entities.Workout;
import com.example.trainerbackend.repositories.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
public class WorkoutController {

    @Autowired
    private WorkoutRepository workoutRepository;

    @GetMapping("/workouts")
    @ResponseBody
    public Iterable<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }

    @GetMapping("workouts/{id}")
    @ResponseBody
    public Optional<Workout> getUserById(@PathVariable UUID id) {
        System.out.println(id);
        return workoutRepository.findById(id);
    }

    @PostMapping("/workouts")
    public Workout createUser(@RequestBody Workout newWorkout) {
        System.out.println(newWorkout);
        return workoutRepository.save(newWorkout);
    }
}
