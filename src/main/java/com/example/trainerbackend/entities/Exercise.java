package com.example.trainerbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@JsonIgnoreProperties("_id")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID _id;

    @ManyToOne
    private Workout workoutId;
    @OneToOne
    private ExerciseType exerciseTypeId;

    public UUID get_id() {
        return _id;
    }

    public void set_id(UUID _id) {
        this._id = _id;
    }

    public Workout getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(Workout workoutId) {
        this.workoutId = workoutId;
    }

    public ExerciseType getExerciseTypeId() {
        return exerciseTypeId;
    }

    public void setExerciseTypeId(ExerciseType exerciseTypeId) {
        this.exerciseTypeId = exerciseTypeId;
    }
}
