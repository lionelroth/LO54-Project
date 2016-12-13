package com.utbm.lo54.formation_app.core;

import java.util.List;

import com.utbm.lo54.formation_app.core.dao.ClientDAO;
import com.utbm.lo54.formation_app.core.dao.CourseDAO;
import com.utbm.lo54.formation_app.core.dao.CourseSessionDAO;
import com.utbm.lo54.formation_app.core.dao.LocationDAO;
import com.utbm.lo54.formation_app.core.entities.Client;
import com.utbm.lo54.formation_app.core.entities.Course;
import com.utbm.lo54.formation_app.core.entities.CourseSession;
import com.utbm.lo54.formation_app.core.entities.Location;


public class App
{
    public static void main( String[] args )
    {
    	/* INSERTING/DELETING/UPDATING STUFF INTO THE DB */    	
    	
//    	Location location = new Location(65432, "ville");
//    	Course course = new Course("BD51", "WOUHOUUUUUU");
//    	Date startDate = new Date();
//    	Date endDate = new Date();
//    	CourseSession courseSession = new CourseSession(68795, course, location, startDate, endDate );
//    	Client client = new Client(12346, courseSession , "lastname", "firstname", "address", "phone", "email");
//    	
//    	ClientDAO clientDao = new ClientDAO();
//    	clientDao.create(client);
    	
    	/* SEARCHING */
    	
    	LocationDAO locationDAO = new LocationDAO();
    	List<Location> locations = locationDAO.findAll();
    	System.out.println("Listing all locations known in the DB : ");
    	for (Location loc : locations){
    		System.out.println("\t- "+loc.toString());
    	}
    	
    	ClientDAO clientDAO = new ClientDAO();
    	List<Client> clients = clientDAO.findAll();
    	System.out.println("Listing all clients known in the DB : ");
    	for (Client cli : clients){
    		System.out.println("\t- "+cli.toString());
    	}
    	
    	CourseDAO courseDAO = new CourseDAO();
    	List<Course> courses = courseDAO.findAll();
    	System.out.println("Listing all courses known in the DB : ");
    	for (Course course : courses){
    		System.out.println("\t- "+course.toString());
    	}
    	
    	CourseSessionDAO courseSessionDAO = new CourseSessionDAO();
    	List<CourseSession> sessions = courseSessionDAO.findAll();
    	System.out.println("Listing all sessions known in the DB : ");
    	for (CourseSession session: sessions){
    		System.out.println("\t- "+session.toString());
    	}
    	
    }
}
