package com.utbm.lo54.formation_app.core.service.interfaces;

import java.util.List;

import com.utbm.lo54.formation_app.core.entities.CourseSession;

public interface CourseSessionService {
	
	/**
	 * Asks the DAO to persist a CourseSession in the DB
	 * @param session
	 */
	public void persist(CourseSession session);
	
	/**
	 * Asks the DAO to update a CourseSession in the DB
	 * @param session
	 */
	public void update(CourseSession session);
	
	/**
	 * Asks the DAO to find a CourseSession by Id in the DB
	 * @param id
	 */
	public CourseSession findById(Integer id);
	
	/**
	 * Asks the DAO to find all sessions in the DB
	 * @param session
	 */
	public List<CourseSession> findAll();
	
}
