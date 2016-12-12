package com.model;

import java.util.HashSet;
import java.util.Set;

public class Location implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private int id;
	private String city;
	private Set<CourseSession> courseSessions = new HashSet<CourseSession>(0);

	public Location() {
	}

	public Location(int id, String city) {
		this.id = id;
		this.city = city;
	}

	public Location(int id, String city, Set<CourseSession> courseSessions) {
		this.id = id;
		this.city = city;
		this.courseSessions = courseSessions;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<CourseSession> getCourseSessions() {
		return this.courseSessions;
	}

	public void setCourseSessions(Set<CourseSession> courseSessions) {
		this.courseSessions = courseSessions;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", city=" + city + ", courseSessions=" + courseSessions + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((courseSessions == null) ? 0 : courseSessions.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (courseSessions == null) {
			if (other.courseSessions != null)
				return false;
		} else if (!courseSessions.equals(other.courseSessions))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	

	

}
