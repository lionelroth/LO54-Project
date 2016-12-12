package com.converters;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import com.model.Location;

@FacesConverter("locationConverter")
public class LocationConverter implements Converter{
	
	
	
	
	
	
	@Override
    public Object getAsObject(FacesContext context, UIComponent component, String newValue) {
		
		
		// TODO : lien avec la BDD pour retrouver la location a partir du nom
		
		List<Location> locationList = new ArrayList<>();
		Location belfort = 	new Location(1, "Belfort");
		Location hell = new Location(2, "L'Enfer");
		Location paris = new Location(3, "Paris");
		Location lyons = new Location(4, "Lyons");

		locationList.add(belfort);
		locationList.add(hell);
		locationList.add(paris);
		locationList.add(lyons);
		
		for (Location location : locationList) {
			if(location.getCity().equals(newValue)){
				return location;
			}
		}
		
		// --------------------------
		
		
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
