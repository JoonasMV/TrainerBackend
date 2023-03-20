package com.example.trainerbackend.entities;

import jakarta.persistence.*;

@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int _id;

    @ManyToOne
    private Workout workoutId;
    @OneToOne
    private ExerciseType exerciseTypeId;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
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
