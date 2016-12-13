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
    	
//    	Location location1 = new Location(1, "Fangene");
//    	Location location2 = new Location(2, "Sharrachbergheinm");
//    	Location location3 = new Location(3, "Bordeaux");
//    	Location location4 = new Location(4, "Eckwersheime");
//    	Location location5 = new Location(5, "Reichstett");
//    	Location location6 = new Location(6, "Mundolsheim");
//    	
//    	Course course1 = new Course("IN54", "No comment");
//    	Course course2 = new Course("LO54", "Le meilleur cours du monde");
//    	Course course3 = new Course("BI07", "Biathlon : Natation / Javascript");
//    	Course course4 = new Course("LO51", "Marathon Base de donnée");
//    	Course course5 = new Course("AB01", "Alphabet niveau débutant");
//    	Course course6 = new Course("VI50", "Oculus Rift et sa garniture de mal de mer");
//    	Course course7 = new Course("IN52", "Mal de tête");
//    	
//    	CourseSession courseSession1 = new CourseSession(1, course1, location3, new Date(2016-1900, 9, 12), new Date(2016-1900, 11, 15) );
//    	CourseSession courseSession2 = new CourseSession(2, course2, location1, new Date(2016-1900, 11, 1), new Date(2017-1900, 3, 20) );
//    	CourseSession courseSession3 = new CourseSession(3, course2, location5, new Date(2016-1900, 2, 12), new Date(2016-1900, 10, 24) );
//    	CourseSession courseSession4 = new CourseSession(4, course3, location2, new Date(2017-1900, 4, 1), new Date(2017-1900, 6, 15) );
//    	CourseSession courseSession5 = new CourseSession(5, course4, location6, new Date(2016-1900, 9, 12), new Date(2017-1900, 11, 15) );
//    	CourseSession courseSession6 = new CourseSession(6, course4, location2, new Date(2016-1900, 11, 3), new Date(2017-1900, 5, 6) );
//    	CourseSession courseSession7 = new CourseSession(7, course5, location3, new Date(2017-1900, 9, 12), new Date(2017-1900, 11, 15) );
//    	CourseSession courseSession8 = new CourseSession(8, course6, location3, new Date(2017-1900, 5, 20), new Date(2017-1900, 6, 15) );
//    	CourseSession courseSession9 = new CourseSession(9, course6, location3, new Date(2017-1900, 0, 18), new Date(2018-1900, 0, 15) );
//    	CourseSession courseSession10 = new CourseSession(10, course7, location3, new Date(2016-1900, 9, 12), new Date(2016-1900, 11, 13) );
//    	
//    	
//    	Client client1 = new Client(1, courseSession3 , "Cartier", "Faustin", "5, rue Grande Fusterie 69500 BRON", "0438802613", "FaustinCartier@dayrep.com");
//    	Client client2 = new Client(2, courseSession6 , "Chartré", "Hardouin", "83, Chemin Des Bateliers 16000 ANGOULÊME", "0520069206", "HardouinChartre@jourrapide.com");
//    	
//    	LocationDAO locationDAO = new LocationDAO();
//    	locationDAO.create(location1);
//    	locationDAO.create(location2);
//    	locationDAO.create(location3);
//    	locationDAO.create(location4);
//    	locationDAO.create(location5);
//    	locationDAO.create(location6);
//    	
//    	CourseDAO courseDAO = new CourseDAO();
//    	courseDAO.create(course1);
//    	courseDAO.create(course2);
//    	courseDAO.create(course3);
//    	courseDAO.create(course4);
//    	courseDAO.create(course5);
//    	courseDAO.create(course6);
//    	courseDAO.create(course7);
//    	
//    	CourseSessionDAO courseSessionDAO = new CourseSessionDAO();
//    	courseSessionDAO.create(courseSession1);
//    	courseSessionDAO.create(courseSession2);
//    	courseSessionDAO.create(courseSession3);
//    	courseSessionDAO.create(courseSession4);
//    	courseSessionDAO.create(courseSession5);
//    	courseSessionDAO.create(courseSession6);
//    	courseSessionDAO.create(courseSession7);
//    	courseSessionDAO.create(courseSession8);
//    	courseSessionDAO.create(courseSession9);
//    	courseSessionDAO.create(courseSession10);
//    	
//    	ClientDAO clientDao = new ClientDAO();
//    	clientDao.create(client1);
//    	clientDao.create(client2);
    	
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
