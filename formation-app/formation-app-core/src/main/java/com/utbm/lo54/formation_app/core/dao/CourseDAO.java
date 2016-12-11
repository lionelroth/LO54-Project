package com.utbm.lo54.formation_app.core.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.utbm.lo54.formation_app.core.common.DaoException;
import com.utbm.lo54.formation_app.core.entities.Course;

public class CourseDAO extends GenericDAO {
	
	    public CourseDAO() {
	        super();
	    }

	    /**
	     * Insert a new Course into the database.
	     * @param course
	     */
	    public void create(Course course) throws DaoException {
	        super.saveOrUpdate(course);
	    }


	    /**
	     * Delete a Course from the database.
	     * @param course
	     */
	    public void delete(Course course) throws DaoException {
	        super.delete(course);
	    }

	    /**
	     * Find a Course by its primary key (CODE)
	     * @param code - String
	     * @return
	     */
	    public Course findById(String code) throws DaoException {
	        return (Course) super.findById(Course.class, code);
	    }

	    /**
	     * Updates the state of a Course.
	     *
	     * @param course
	     */
	    public void update(Course course) throws DaoException {
	        super.saveOrUpdate(course);
	    }

	    /**
	     * Finds all Courses in the database.
	     * @return
	     */
	    @SuppressWarnings("unchecked")
		public List<Course> findAll() throws DaoException{
	    	List<Course> courses = new ArrayList<Course>();
	    	List<?> objectsFound = super.findAll(Course.class);
	    	
	        try {
	        	courses.addAll((Collection<? extends Course>) objectsFound);
	        } catch (Exception e) {
				throw new IllegalStateException("The objects found in the table were not of type Course.");
			}
			return courses;
	    }

}
