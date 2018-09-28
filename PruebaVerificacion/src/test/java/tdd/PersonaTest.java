package tdd;

import org.junit.Test;

import org.junit.Assert;

public class PersonaTest {

	@Test
	public void verifyTheAgeMethod() {
		Persona persona = new Persona();
		int expectedResult = 20;
		int actualResult = persona.getEdad();
		Assert.assertEquals("Error edad calculada incorrectamente", expectedResult, actualResult);
	}
}
