package com.utbm.lo54.formation_app.core.service.interfaces;

import java.util.List;

import com.utbm.lo54.formation_app.core.entities.Course;

public interface CourseService {
	
	/**
	 * Asks the DAO to persist a Course in the DB
	 * @param course
	 */
	public void persist(Course course);
	
	/**
	 * Asks the DAO to update a Course in the DB
	 * @param course
	 */
	public void update(Course course);
	
	/**
	 * Asks the DAO to find a Course by code in the DB
	 * @param code
	 */
	public Course findById(String code);
	
	/**
	 * Asks the DAO to find all courses in the DB
	 * @param course
	 */
	public List<Course> findAll();
	
}
