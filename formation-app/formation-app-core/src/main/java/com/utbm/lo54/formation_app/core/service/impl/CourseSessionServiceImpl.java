package com.utbm.lo54.formation_app.core.service.impl;

import java.util.List;

import com.utbm.lo54.formation_app.core.dao.CourseSessionDAO;
import com.utbm.lo54.formation_app.core.entities.CourseSession;
import com.utbm.lo54.formation_app.core.service.interfaces.CourseSessionService;

/**
 * Service implementation used to manage sessions.
 */
public class CourseSessionServiceImpl implements CourseSessionService{

	/**
	 * DAO used by the service to interact with the DB
	 */
	private CourseSessionDAO sessionDAO;
	
	
	public CourseSessionServiceImpl() {
		this.sessionDAO = new CourseSessionDAO();
	}


	public void persist(CourseSession session) {
		sessionDAO.create(session);
	}

	public void update(CourseSession session) {
		sessionDAO.update(session);
	}

	public CourseSession findById(Integer id) {
		return sessionDAO.findById(id);
	}

	public List<CourseSession> findAll() {
		return sessionDAO.findAll();
	}

	public CourseSessionDAO getCourseSessionDAO() {
		return sessionDAO;
	}

}
