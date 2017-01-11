package com.utbm.lo54.controllers;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.utbm.lo54.formation_app.core.entities.Client;
import com.utbm.lo54.formation_app.core.entities.CourseSession;
import com.utbm.lo54.formation_app.core.service.impl.ClientServiceImpl;
import com.utbm.lo54.formation_app.core.service.impl.CourseSessionServiceImpl;
import com.utbm.lo54.formation_app.core.service.interfaces.ClientService;
import com.utbm.lo54.formation_app.core.service.interfaces.CourseSessionService;

@SessionScoped
@ManagedBean (name = "subscriptionController")
public class SubscriptionController {
	
//	@Inject
//	private NavigationController navigationController;
	
	private Integer sessionId;
	
	private Client client;
	
	public SubscriptionController() {
	}

	@PostConstruct
	private void init(){
	}
	
	public String updateSubscriptionSession(Integer sessionId) {
		this.sessionId = sessionId;
		this.client = new Client();
		CourseSessionService sessionService = new CourseSessionServiceImpl();
		CourseSession session = sessionService.findById(sessionId);
		this.client.setCourseSession(session);
//		navigationController.setCurrentPage(2);
		return "inscription?faces-redirect=true";
	}

	public String askValidation(){
		System.out.println("Redirecting to validation...");
//		navigationController.setCurrentPage(3);
		return "validation?faces-redirect=true";
	}
	
	
	public void validateSub(){
		System.out.println("Persistence call...");
		String message = "Erreur.";
//		String redirect = "errors/error.xhtml";
		try {
			persistSub();
			message = "Inscription réalisée avec succès !";
//			redirect = "sessions?faces-redirect=true";
		} catch(Exception e){
			message = "Erreur lors de l'inscription. Veuillez vérifier les données saisies.";
//			redirect = "sessions?faces-redirect=true";
		}
		addMessage(message);
//		return redirect;
    }
     
    private void persistSub() {
    	ClientService clientService = new ClientServiceImpl();
		clientService.persist(client);
	}

	public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

	public Integer getSessionId() {
		return sessionId;
	}

	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
