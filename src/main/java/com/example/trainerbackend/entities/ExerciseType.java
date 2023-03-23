package com.example.trainerbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class ExerciseType {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID _id;

    private String exerciseTypeName;

    @ManyToOne
    private User userId;

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
