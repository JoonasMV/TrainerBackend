package com.example.trainerbackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class ExerciseType {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID _id;

    private String exerciseTypeName;

    public ExerciseType() {
    }

    public ExerciseType(String exerciseTypeName) {
        this.exerciseTypeName = exerciseTypeName;
    }

    public UUID get_id() {
        return _id;
    }

    public void set_id(UUID _id) {
        this._id = _id;
    }

    public String getExerciseTypeName() {
        return exerciseTypeName;
    }

    public void setExerciseTypeName(String exerciseTypeName) {
        this.exerciseTypeName = exerciseTypeName;
    }
}
