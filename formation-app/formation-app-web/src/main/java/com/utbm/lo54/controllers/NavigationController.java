package com.utbm.lo54.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean (name = "navigationController")
public class NavigationController {

	private int currentPage; //first page = 0
	private List<String> pageLabels;
	private List<String> pageUrls;
	
	public NavigationController() {
	}

	@PostConstruct
	public void init(){
		currentPage = 0;
		pageLabels = new ArrayList<String>();
		pageUrls = new ArrayList<String>();
		pageLabels.add("Accueil");
		pageLabels.add("Liste des sessions");
		pageLabels.add("Inscription");
		pageLabels.add("Validation");
		
		pageUrls.add("index.xhtml");
		pageUrls.add("sessions.xhtml");
		pageUrls.add("inscription.xhtml");
		pageUrls.add("validation.xhtml");
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public List<String> getPageLabels() {
		return pageLabels;
	}
	public void setPageLabels(List<String> pageLabels) {
		this.pageLabels = pageLabels;
	}
	public List<String> getPageUrls() {
		return pageUrls;
	}
	public void setPageUrls(List<String> pageUrls) {
		this.pageUrls = pageUrls;
	}
	
	
	
}
