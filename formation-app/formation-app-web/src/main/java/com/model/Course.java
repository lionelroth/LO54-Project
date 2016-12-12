package com.model;

import java.util.HashSet;
import java.util.Set;

public class Course implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	private String title;
	private Set<CourseSession> courseSessions = new HashSet<CourseSession>(0);

	public Course() {
	}

	public Course(String code, String title) {
		this.code = code;
		this.title = title;
	}

	public Course(String code, String title, Set<CourseSession> courseSessions) {
		this.code = code;
		this.title = title;
		this.courseSessions = courseSessions;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<CourseSession> getCourseSessions() {
		return this.courseSessions;
	}

	public void setCourseSessions(Set<CourseSession> courseSessions) {
		this.courseSessions = courseSessions;
	}

}
