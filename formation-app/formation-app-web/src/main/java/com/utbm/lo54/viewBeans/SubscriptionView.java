package com.utbm.lo54.viewBeans;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.utbm.lo54.formation_app.core.entities.Client;
import com.utbm.lo54.formation_app.core.entities.CourseSession;
import com.utbm.lo54.formation_app.core.service.impl.ClientServiceImpl;
import com.utbm.lo54.formation_app.core.service.impl.CourseSessionServiceImpl;
import com.utbm.lo54.formation_app.core.service.interfaces.ClientService;
import com.utbm.lo54.formation_app.core.service.interfaces.CourseSessionService;

@ManagedBean (name="subscriptionView")
@SessionScoped
public class SubscriptionView {
	
	private Integer sessionId;
	
	private Client client;
	
	@PostConstruct
	public void init(){
		//TODO à virer
		sessionId = 2;
		System.out.println(sessionId);
		
		this.client = new Client();
		CourseSessionService sessionService = new CourseSessionServiceImpl();
		CourseSession session = sessionService.findById(sessionId);
		this.client.setCourseSession(session);
	}
	
	public String askValidation(){
		System.out.println("Redirecting to validation...");
		return "validation?faces-redirect=true";
	}
	
	
	public String validateSub(ActionEvent actionEvent){
		System.out.println("Persistence call...");
		ClientService clientService= new ClientServiceImpl();
		clientService.persist(client);
		addMessage("Inscription réalisée avec succés !");
		return "sessions?faces-redirect=true";
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
