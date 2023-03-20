package com.example.trainerbackend.entities;

import jakarta.persistence.*;

@Entity
public class ExerciseSet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int _id;

    private int reps;
    private float weight;
    @ManyToOne
    private Exercise exerciseId;

    public ExerciseSet() {}
}
