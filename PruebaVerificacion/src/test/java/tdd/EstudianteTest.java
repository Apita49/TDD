package tdd;

import org.junit.Assert;
import org.junit.Test;

public class EstudianteTest {
	@Test
	public void verifyGetEdad() {
		Estudiante estudiante = new Estudiante();
		int expected = 20;
		estudiante.setFechaNac(1998);
		int actual = estudiante.getEdad();
		Assert.assertEquals("Error mal calculado", expected, actual);
	}

	@Test
	public void verifyAprobed() {
		boolean exp = true;

		Nota n = new Nota();
		n.setNota1(60);
		n.setNota2(70);
		n.setNota3(80);
		Estudiante e = new Estudiante();
		e.setNota(n);
		boolean act = e.isAprobed();
		Assert.assertEquals("Error no es el mismo", exp, act);
	}

	@Test
	public void verifyAprobedFalse() {
		boolean exp = false;

		Nota n = new Nota();
		n.setNota1(69);
		n.setNota2(70);
		n.setNota3(70);
		Estudiante e = new Estudiante();
		e.setNota(n);
		boolean act = e.isAprobed();
		Assert.assertEquals("Error no es el mismo", exp, act);
	}
}
