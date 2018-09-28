package tdd;

import org.junit.Test;
import org.junit.Assert;

public class NotaTest {
	@Test
	public void verifyTheCalcFinalNote() {
		Nota nota = new Nota();
		nota.setNota1(10);
		nota.setNota2(10);
		nota.setNota3(10);
		int expectedResult = 30;
		int actualResult = nota.getTotal();
		Assert.assertEquals("Error, calculo mal hecho", expectedResult, actualResult);
	}

	@Test
	public void verifyTheCalcFinalNoteZero() {
		Nota nota = new Nota();
		int expectedResult = 0;
		int actualResult = nota.getTotal();
		Assert.assertEquals("Error, calculo mal hecho", expectedResult, actualResult);
	}

	@Test
	public void verifyTheCalcFinalNoteWronInputs() {
		Nota nota = new Nota();
		nota.setNota1(200);
		nota.setNota2(10);
		nota.setNota3(10);
		int expectedResult = 20;
		int actualResult = nota.getTotal();
		Assert.assertEquals("Error, calculo mal hecho", expectedResult, actualResult);
	}
}
