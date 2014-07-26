package com.pluralsight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Goal;
import com.pluralsight.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;
	
	public Goal save(Goal goal) {
		// TODO Auto-generated method stub
		return goalRepository.save(goal);
	}

}
