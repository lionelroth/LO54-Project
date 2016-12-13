package com.utbm.lo54.formation_app.core.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.utbm.lo54.formation_app.core.common.DaoException;
import com.utbm.lo54.formation_app.core.entities.Location;

public class LocationDAO extends GenericDAO {
	
	    public LocationDAO() {
	        super();
	    }

	    /**
	     * Insert a new Location into the database.
	     * @param location
	     */
	    public void create(Location location) throws DaoException {
	        super.saveOrUpdate(location);
	    }


	    /**
	     * Delete a Location from the database.
	     * @param location
	     */
	    public void delete(Location location) throws DaoException {
	        super.delete(location);
	    }

	    /**
	     * Find an Location by its primary key.
	     * @param id - Integer
	     * @return
	     */
	    public Location findById(Integer id) throws DaoException {
	        return (Location) super.findById(Location.class, id);
	    }

	    /**
	     * Updates the state of a Location.
	     *
	     * @param location
	     */
	    public void update(Location location) throws DaoException {
	        super.saveOrUpdate(location);
	    }

	    /**
	     * Finds all Locations in the database.
	     * @return
	     */
	    @SuppressWarnings("unchecked")
		public List<Location> findAll() throws DaoException{
	    	List<Location> locations = new ArrayList<Location>();
	    	List<?> objectsFound = super.findAll(Location.class);
	    	
	        try {
	        	locations.addAll((Collection<? extends Location>) objectsFound);
	        } catch (Exception e) {
				throw new IllegalStateException("The objects found in the table were not of type Location.");
			}
			return locations;
	    }

}
