package com.fitnessTracker.service;

import java.util.List;

import com.fitnessTracker.model.Goal;
import com.fitnessTracker.model.GoalReport;

public interface GoalService {
	Goal save(Goal goal);

	List<Goal> findAllGoals();

	List<GoalReport> findAllGoalReports();
}
