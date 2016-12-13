package com.utbm.lo54.converters;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import com.utbm.lo54.formation_app.core.dao.LocationDAO;
import com.utbm.lo54.formation_app.core.entities.Location;

@FacesConverter("locationConverter")
public class LocationConverter implements Converter{
	
	
	
	
	
	
	@Override
    public Object getAsObject(FacesContext context, UIComponent component, String newValue) {
		
		
		LocationDAO locationDAO = new LocationDAO();
    	List<Location> locations = locationDAO.findAll();
    	for (Location location : locations){
    		if(location.getCity().equals(newValue)){
				return location;
			}
    	}
		
		
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object object) {
        if (object == null) {
            return "";
        }
        if (object instanceof Location) {
        	Location loc = (Location) object;
            String name = loc.getCity();
            return name;
        } else {
            throw new ConverterException(new FacesMessage(object + " is not a valid location"));
        }
    }
}
