package com.jontxu.FitnessTrackingSys.data;

import java.util.List;

public record User(String username, String password, String email, List<Workout> workouts) {
}
