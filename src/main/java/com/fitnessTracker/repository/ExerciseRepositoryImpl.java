package com.fitnessTracker.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.fitnessTracker.model.Exercise;

@Repository("exerciseRepository")
public class ExerciseRepositoryImpl implements ExerciseRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	public Exercise save(Exercise exercise) {
		// TODO Auto-generated method stub
		em.persist(exercise);
		em.flush();
		return exercise;
	}

}
