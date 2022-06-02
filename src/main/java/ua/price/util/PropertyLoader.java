package ua.price.util;

import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
	public String loadProperty(String name) {
		Properties property = new Properties();
		
		try {
			property.load(PropertyLoader.class.getResourceAsStream("/application.properties"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
			
		return property.getProperty(name);
	}
}
