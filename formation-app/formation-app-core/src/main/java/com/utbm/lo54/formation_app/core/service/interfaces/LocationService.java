package com.utbm.lo54.formation_app.core.service.interfaces;

import java.util.List;

import com.utbm.lo54.formation_app.core.entities.Location;

public interface LocationService {
	
	/**
	 * Asks the DAO to persist a Location in the DB
	 * @param location
	 */
	public void persist(Location location);
	
	/**
	 * Asks the DAO to update a Location in the DB
	 * @param location
	 */
	public void update(Location location);
	
	/**
	 * Asks the DAO to find a Location by Id in the DB
	 * @param id
	 */
	public Location findById(Integer id);
	
	/**
	 * Asks the DAO to find all locations in the DB
	 * @param location
	 */
	public List<Location> findAll();
	
}
