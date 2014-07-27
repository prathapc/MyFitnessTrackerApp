package com.fitnessTracker.service;

import java.util.List;

import com.fitnessTracker.model.Activity;
import com.fitnessTracker.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}