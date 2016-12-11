package com.utbm.lo54.formation_app.core.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.utbm.lo54.formation_app.core.common.DaoException;
import com.utbm.lo54.formation_app.core.entities.CourseSession;

public class CourseSessionDAO extends GenericDAO {
	
	    public CourseSessionDAO() {
	        super();
	    }

	    /**
	     * Insert a new CourseSession into the database.
	     * @param session
	     */
	    public void create(CourseSession session) throws DaoException {
	        super.saveOrUpdate(session);
	    }


	    /**
	     * Delete a CourseSession from the database.
	     * @param session
	     */
	    public void delete(CourseSession session) throws DaoException {
	        super.delete(session);
	    }

	    /**
	     * Find a CourseSession by its primary key.
	     * @param id
	     * @return
	     */
	    public CourseSession findById(Integer id) throws DaoException {
	        return (CourseSession) super.findById(CourseSession.class, id);
	    }

	    /**
	     * Updates the state of a CourseSession.
	     *
	     * @param session
	     */
	    public void update(CourseSession session) throws DaoException {
	        super.saveOrUpdate(session);
	    }

	    /**
	     * Finds all CourseSessions in the database.
	     * @return
	     */
	    @SuppressWarnings("unchecked")
		public List<CourseSession> findAll() throws DaoException{
	    	List<CourseSession> sessions = new ArrayList<CourseSession>();
	    	List<?> objectsFound = super.findAll(CourseSession.class);
	    	
	        try {
	        	sessions.addAll((Collection<? extends CourseSession>) objectsFound);
	        } catch (Exception e) {
				throw new IllegalStateException("The objects found in the table were not of type CourseSession.");
			}
			return sessions;
	    }

}
