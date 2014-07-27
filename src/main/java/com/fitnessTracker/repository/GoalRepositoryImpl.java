package com.fitnessTracker.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.fitnessTracker.model.Goal;
import com.fitnessTracker.model.GoalReport;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	public Goal save(Goal goal) {
		// TODO Auto-generated method stub
		em.persist(goal);
		em.flush();
		return goal;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Goal> loadAll() {
		// TODO Auto-generated method stub
		//Query query = em.createQuery("Select g from Goal g");
		TypedQuery<Goal> query = em.createNamedQuery(Goal.FIND_ALL_GOALS, Goal.class);
		List goals = query.getResultList();
						
		return goals;
	}

	@SuppressWarnings("unchecked")
	public List<GoalReport> findAllGoalReports() {
		// TODO Auto-generated method stub
		//Query query = em.createQuery("Select new com.fitnessTracker.model.GoalReport(g.minutes,e.minutes,e.activity)"+
		//"from Goal g, Exercise e where g.id=e.goal.id");
		TypedQuery<GoalReport> query = em.createNamedQuery(Goal.FIND_GOAL_REPORTS, GoalReport.class);				
		return query.getResultList();
	}


}
