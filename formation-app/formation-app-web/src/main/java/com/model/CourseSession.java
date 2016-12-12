package com.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class CourseSession implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Course course;
	private Location location;
	private Date startDate;
	private Date endDate;
	private Set<Client> clients = new HashSet<Client>(0);

	public CourseSession() {
	}

	public CourseSession(int id, Course course, Location location, Date startDate, Date endDate) {
		this.id = id;
		this.course = course;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public CourseSession(int id, Course course, Location location, Date startDate, Date endDate, Set<Client> clients) {
		this.id = id;
		this.course = course;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.clients = clients;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Set<Client> getClients() {
		return this.clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

}
