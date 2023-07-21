package com.jontxu.FitnessTrackingSys.data;

public class Goal {
    private final int id;
    private final GoalType goalType;
    private boolean completed = false;

    public Goal(int id, GoalType goalType) {
        this.id = id;
        this.goalType = goalType;
    }

    public int getId() {
        return id;
    }

    public GoalType getGoalType() {
        return goalType;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
