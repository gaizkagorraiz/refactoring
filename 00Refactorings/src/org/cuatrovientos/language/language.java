package org.cuatrovientos.language;
/**
 * 
 */

/**
 * @author Bad Taste
 * greetz in different languages
 */
public class language {

	/**
	 * Greets 
	 * @param language chosen language
	 * @param repeats how many times repeat greet
	 * @return a String with the greeting
	 */
	public String greets (int language, int repeats) {
		String add = "";
		String text = "";
		
		switch (language) {
			case 0 : text = "hola";
					 break;
			case 1 : text = "hello";
					 break;
			case 2 : text = "kaixo";
			 		 break;
			 default:
				 	 break;	
		 }
		
		// Repeat greet rep times
		for (int i=0;i<repeats;i++) {
			add += text;
		}
		
		return add;
	}
}
