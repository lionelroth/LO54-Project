package com.utbm.lo54.formation_app.core.service.impl;

import java.util.List;

import com.utbm.lo54.formation_app.core.dao.LocationDAO;
import com.utbm.lo54.formation_app.core.entities.Location;
import com.utbm.lo54.formation_app.core.service.interfaces.LocationService;

/**
 * Service implementation used to manage locations.
 */
public class LocationServiceImpl implements LocationService{

	/**
	 * DAO used by the service to interact with the DB
	 */
	private LocationDAO locationDAO;
	
	
	public LocationServiceImpl() {
		this.locationDAO = new LocationDAO();
	}


	public void persist(Location location) {
		locationDAO.create(location);
	}

	public void update(Location location) {
		locationDAO.update(location);
	}

	public Location findById(Integer id) {
		return locationDAO.findById(id);
	}

	public List<Location> findAll() {
		return locationDAO.findAll();
	}

	public LocationDAO getLocationDAO() {
		return locationDAO;
	}

}
