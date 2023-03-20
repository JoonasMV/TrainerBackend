package com.example.trainerbackend.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer _id;
    private String workoutName;
    private Date workoutStarted;
    private Date workoutEnded;
    private boolean isPreset;
    @OneToOne
    private User userId;

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public Date getWorkoutStarted() {
        return workoutStarted;
    }

    public void setWorkoutStarted(Date workoutStarted) {
        this.workoutStarted = workoutStarted;
    }

    public Date getWorkoutEnded() {
        return workoutEnded;
    }

    public void setWorkoutEnded(Date workoutEnded) {
        this.workoutEnded = workoutEnded;
    }

    public boolean isPreset() {
        return isPreset;
    }

    public void setPreset(boolean preset) {
        isPreset = preset;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}
