package com.jontxu.FitnessTrackingSys.data;

public record Workout(int id, WorkoutType workoutType, int duration, Goal goal) {
}
