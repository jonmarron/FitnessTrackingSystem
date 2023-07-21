package com.jontxu.FitnessTrackingSys.logic;

import com.jontxu.FitnessTrackingSys.data.User;
import com.jontxu.FitnessTrackingSys.data.Workout;
import com.jontxu.FitnessTrackingSys.data.WorkoutType;

import java.util.List;
import java.util.stream.Collectors;

public class FitnessTrackingSystem {
    public List<Workout> getWorkoutsByTypeCompletedByUsername(List<User> users, WorkoutType workoutType, String name){
        return users.stream()
                .filter(user -> user.username().equalsIgnoreCase(name))
                .flatMap(user -> user.workouts().stream())
                .filter(workout -> workout.workoutType().equals(workoutType) && workout.goal().isCompleted())
                .collect(Collectors.toList());
    }

    public List<Workout> getUncompletedWorkoutsMinDuration(List<User> users, int minDuration){
        return users.stream()
                .flatMap(user -> user.workouts().stream())
                .filter(workout -> workout.duration() >= minDuration && !workout.goal().isCompleted())
                .collect(Collectors.toList());
    }
}
