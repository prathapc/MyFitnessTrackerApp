package com.fitnessTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fitnessTracker.model.Goal;
import com.fitnessTracker.model.GoalReport;
import com.fitnessTracker.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;
	
	@Transactional
	public Goal save(Goal goal) {
		// TODO Auto-generated method stub
		return goalRepository.save(goal);
	}

	public List<Goal> findAllGoals() {
		// TODO Auto-generated method stub
		return goalRepository.loadAll();
	}

	public List<GoalReport> findAllGoalReports() {
		// TODO Auto-generated method stub
		return goalRepository.findAllGoalReports();
	}

}
