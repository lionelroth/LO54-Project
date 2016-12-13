package com.utbm.lo54.formation_app.core.service.impl;

import java.util.List;

import com.utbm.lo54.formation_app.core.dao.CourseDAO;
import com.utbm.lo54.formation_app.core.entities.Course;
import com.utbm.lo54.formation_app.core.service.interfaces.CourseService;

/**
 * Service implementation used to manage courses.
 */
public class CourseServiceImpl implements CourseService{

	/**
	 * DAO used by the service to interact with the DB
	 */
	private CourseDAO courseDAO;
	
	
	public CourseServiceImpl() {
		this.courseDAO = new CourseDAO();
	}


	public void persist(Course course) {
		courseDAO.create(course);
	}

	public void update(Course course) {
		courseDAO.update(course);
	}

	public Course findById(String code) {
		return courseDAO.findById(code);
	}

	public List<Course> findAll() {
		return courseDAO.findAll();
	}

	public CourseDAO getCourseDAO() {
		return courseDAO;
	}

}
