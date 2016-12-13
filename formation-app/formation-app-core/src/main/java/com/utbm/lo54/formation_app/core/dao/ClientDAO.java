package com.utbm.lo54.formation_app.core.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.utbm.lo54.formation_app.core.common.DaoException;
import com.utbm.lo54.formation_app.core.entities.Client;

public class ClientDAO extends GenericDAO {
	
	    public ClientDAO() {
	        super();
	    }

	    /**
	     * Insert a new Client into the database.
	     * @param client
	     */
	    public void create(Client client) throws DaoException {
	        super.saveOrUpdate(client);
	    }


	    /**
	     * Delete a Client from the database.
	     * @param client
	     */
	    public void delete(Client client) throws DaoException {
	        super.delete(client);
	    }

	    /**
	     * Find an Client by its primary key.
	     * @param id - Integer
	     * @return
	     */
	    public Client findById(Integer id) throws DaoException {
	        return (Client) super.findById(Client.class, id);
	    }

	    /**
	     * Updates the state of a Client.
	     *
	     * @param client
	     */
	    public void update(Client client) throws DaoException {
	        super.saveOrUpdate(client);
	    }

	    /**
	     * Finds all Clients in the database.
	     * @return
	     */
	    @SuppressWarnings("unchecked")
		public List<Client> findAll() throws DaoException{
	    	List<?> objectsFound = super.findAll(Client.class);
	    	List<Client> clients = new ArrayList<Client>();
	    	
	        try {
	        	clients.addAll((Collection<? extends Client>) objectsFound);
	        } catch (Exception e) {
				throw new IllegalStateException("The objects found in the table were not of type Client.");
			}
			return clients;
	    }

}
