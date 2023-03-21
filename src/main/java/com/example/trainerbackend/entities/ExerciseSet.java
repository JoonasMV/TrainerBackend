package com.example.trainerbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@JsonIgnoreProperties("_id")
public class ExerciseSet {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID _id;

    private int reps;
    private float weight;
    @ManyToOne
    private Exercise exerciseId;

    public ExerciseSet() {}
}
