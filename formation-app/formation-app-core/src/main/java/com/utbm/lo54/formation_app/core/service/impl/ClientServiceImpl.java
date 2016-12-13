package com.utbm.lo54.formation_app.core.service.impl;

import java.util.List;

import com.utbm.lo54.formation_app.core.dao.ClientDAO;
import com.utbm.lo54.formation_app.core.entities.Client;
import com.utbm.lo54.formation_app.core.service.interfaces.ClientService;

/**
 * Service implementation used to manage clients.
 */
public class ClientServiceImpl implements ClientService{

	/**
	 * DAO used by the service to interact with the DB
	 */
	private ClientDAO clientDAO;
	
	
	public ClientServiceImpl() {
		this.clientDAO = new ClientDAO();
	}


	public void persist(Client client) {
		clientDAO.create(client);
	}

	public void update(Client client) {
		clientDAO.update(client);
	}

	public Client findById(Integer id) {
		return clientDAO.findById(id);
	}

	public List<Client> findAll() {
		return clientDAO.findAll();
	}

	public ClientDAO getClientDAO() {
		return clientDAO;
	}

}
