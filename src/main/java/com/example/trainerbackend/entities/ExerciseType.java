package com.example.trainerbackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExerciseType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int _id;

    private String exerciseTypeName;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getExerciseTypeName() {
        return exerciseTypeName;
    }

    public void setExerciseTypeName(String exerciseTypeName) {
        this.exerciseTypeName = exerciseTypeName;
    }
}
