package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Goal;
import com.pluralsight.service.GoalService;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalService {
	
	@PersistenceContext
	private EntityManager em;
	
	public Goal save(Goal goal) {
		// TODO Auto-generated method stub
		em.persist(goal);
		return goal;
	}

}
