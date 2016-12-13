package com.utbm.lo54.formation_app.core.service.interfaces;

import java.util.List;

import com.utbm.lo54.formation_app.core.entities.Client;

public interface ClientService {
	
	/**
	 * Asks the DAO to persist a Client in the DB
	 * @param client
	 */
	public void persist(Client client);
	
	/**
	 * Asks the DAO to update a Client in the DB
	 * @param client
	 */
	public void update(Client client);
	
	/**
	 * Asks the DAO to find a Client by Id in the DB
	 * @param id
	 */
	public Client findById(Integer id);
	
	/**
	 * Asks the DAO to find all clients in the DB
	 * @param client
	 */
	public List<Client> findAll();
	
}
