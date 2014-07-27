package com.fitnessTracker.repository;

import java.util.List;

import com.fitnessTracker.model.Goal;
import com.fitnessTracker.model.GoalReport;

public interface GoalRepository {
	Goal save(Goal goal);

	List<Goal> loadAll();

	List<GoalReport> findAllGoalReports();
}
