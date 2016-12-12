package com.viewBeans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.model.Course;
import com.model.CourseSession;
import com.model.Location;

@ManagedBean
@SessionScoped
public class SessionListWiew {
	

	private boolean courseCodeFilterSelected = false;
	private String courseCodeFilter = "";
	
	private boolean courseTitleFilterSelected = false;
	private String courseTiteleFilter = "";
	
	private boolean dateMiniSeleted = false;
	private Date dateMini = new Date();
	
	private boolean dateMaxiSeleted = false;
	private Date dateMaxi = new Date();
	
	private boolean locationFilterSelected = false;
	private List<Location > selectedLocations;
	
	private List<Location> locationList;
	
	private List<CourseSession> courseSessionList;
	private List<CourseSession> selectedCourseSessionList;
	
	@SuppressWarnings("deprecation")
	public SessionListWiew() {
		locationList = new ArrayList<>();
		Location belfort = 	new Location(1, "Belfort");
		Location hell = new Location(2, "L'Enfer");
		Location paris = new Location(3, "Paris");
		Location lyons = new Location(4, "Lyons");
		
		selectedLocations = new ArrayList<>(locationList);
		
		locationList.add(belfort);
		locationList.add(hell);
		locationList.add(paris);
		locationList.add(lyons);
		
		courseSessionList = new ArrayList<>();
		courseSessionList.add(new CourseSession(1, new Course("LO54", "Framework Java"), belfort, new Date(2016-1900, 11, 12), new Date(2016-1900, 11, 15)));
		courseSessionList.add(new CourseSession(2, new Course("BD51", "Caca"), hell, new Date(2016-1900, 11, 15), new Date(2016-1900, 11, 18)));
		courseSessionList.add(new CourseSession(3, new Course("YOLOOOO", "C Cool"), belfort, new Date(2016-1900, 11, 12), new Date(2016-1900, 11, 20)));
		
		
		selectedCourseSessionList = new ArrayList<>(courseSessionList);
		
	}
	
	public void computFilter(){
		
		selectedCourseSessionList.clear();
		
		
		for (CourseSession courseSession : courseSessionList) {
			if(
					(!courseCodeFilterSelected || courseSession.getCourse().getCode().toLowerCase().contains(courseCodeFilter.toLowerCase()))
					&&
					(!courseTitleFilterSelected || courseSession.getCourse().getTitle().toLowerCase().contains(courseTiteleFilter.toLowerCase()))
					&&
					(!dateMiniSeleted || dateMini.compareTo(courseSession.getStartDate())<=0)
					&&
					(!dateMaxiSeleted || dateMaxi.compareTo(courseSession.getEndDate())>=0)
					&&
					(!locationFilterSelected || selectedLocations.contains(courseSession.getLocation()))
					){
				selectedCourseSessionList.add(courseSession);
			}
		}
	}

	public boolean isCourseCodeFilterSelected() {
		return courseCodeFilterSelected;
	}

	public void setCourseCodeFilterSelected(boolean courseCodeFilterSelected) {
		this.courseCodeFilterSelected = courseCodeFilterSelected;
	}

	public String getCourseCodeFilter() {
		return courseCodeFilter;
	}

	public void setCourseCodeFilter(String courseCodeFilter) {
		this.courseCodeFilter = courseCodeFilter;
	}

	public boolean isCourseTitleFilterSelected() {
		return courseTitleFilterSelected;
	}

	public void setCourseTitleFilterSelected(boolean courseTitleFilterSelected) {
		this.courseTitleFilterSelected = courseTitleFilterSelected;
	}

	public String getCourseTiteleFilter() {
		return courseTiteleFilter;
	}

	public void setCourseTiteleFilter(String courseTiteleFilter) {
		this.courseTiteleFilter = courseTiteleFilter;
	}

	public boolean isDateMiniSeleted() {
		return dateMiniSeleted;
	}

	public void setDateMiniSeleted(boolean dateMiniSeleted) {
		this.dateMiniSeleted = dateMiniSeleted;
	}

	public Date getDateMini() {
		return dateMini;
	}

	public void setDateMini(Date dateMini) {
		this.dateMini = dateMini;
	}

	public boolean isDateMaxiSeleted() {
		return dateMaxiSeleted;
	}

	public void setDateMaxiSeleted(boolean dateMaxiSeleted) {
		this.dateMaxiSeleted = dateMaxiSeleted;
	}

	public Date getDateMaxi() {
		return dateMaxi;
	}

	public void setDateMaxi(Date dateMaxi) {
		this.dateMaxi = dateMaxi;
	}

	public List<CourseSession> getCourseSessionList() {
		return courseSessionList;
	}

	public void setCourseSessionList(List<CourseSession> courseSessionList) {
		this.courseSessionList = courseSessionList;
	}

	public List<CourseSession> getSelectedCourseSessionList() {
		this.computFilter();
		
		return selectedCourseSessionList;
	}

	public void setSelectedCourseSessionList(List<CourseSession> selectedCourseSessionList) {
		this.selectedCourseSessionList = selectedCourseSessionList;
	}

	public boolean isLocationFilterSelected() {
		return locationFilterSelected;
	}

	public void setLocationFilterSelected(boolean locationFilterSelected) {
		this.locationFilterSelected = locationFilterSelected;
	}

	public List<Location> getSelectedLocations() {
		return selectedLocations;
	}

	public void setSelectedLocations(List<Location> selectedLocations) {
		this.selectedLocations = selectedLocations;
	}

	public List<Location> getLocationList() {
		return locationList;
	}

	public void setLocationList(List<Location> locationList) {
		this.locationList = locationList;
	}


	@Override
	public String toString() {
		return "SessionListWiew [courseCodeFilterSelected=" + courseCodeFilterSelected + ", courseCodeFilter="
				+ courseCodeFilter + ", courseTitleFilterSelected=" + courseTitleFilterSelected
				+ ", courseTiteleFilter=" + courseTiteleFilter + ", dateMiniSeleted=" + dateMiniSeleted + ", dateMini="
				+ dateMini + ", dateMaxiSeleted=" + dateMaxiSeleted + ", dateMaxi=" + dateMaxi
				+ ", locationFilterSelected=" + locationFilterSelected + ", selectedLocations=" + selectedLocations
				+ ", locationList=" + locationList + ", courseSessionList=" + courseSessionList
				+ ", selectedCourseSessionList=" + selectedCourseSessionList + "]";
	}

	
	
	

	
	
	
	
	
	
	
	
	
}
