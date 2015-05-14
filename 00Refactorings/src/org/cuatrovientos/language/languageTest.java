package org.cuatrovientos.language;
import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Bad Taste 
 * test class for language, you got it?
 * you're testing language. It's brilliant
 */
public class languageTest {

	@Test
	public void testGreetMethod() {
		language language = new language();

		String expected = "hola";
		String target = language.greets(0, 1);
		assertEquals("Testing spanish greet once", expected, target);

		expected = "hellohello";
		target = language.greets(1, 2);
		assertEquals("Testing english greet twice", expected, target);

		expected = "kaixokaixokaixokaixo";
		target = language.greets(2, 4);
		assertEquals("Testing basque greet four times", expected, target);

	}

}
