package tdd;

import org.junit.Test;
import org.junit.Assert;

public class DocenteTest {
	@Test
	public void verifyGetEdad() {
		Docente docente = new Docente();
		int expected = 20;
		docente.setFechaNac(1998);
		int actual = docente.getEdad();
		Assert.assertEquals("Error mal calculado", expected, actual);
	}

	@Test
	public void verifySortNota() {
		Estudiante a = new Estudiante();
		a.setNombre("Bernardo");
		Estudiante b = new Estudiante();
		b.setNombre("Alejandro");
		Estudiante[] expected = new Estudiante[2];
		expected[0] = a;
		expected[1] = b;

		Nota nc = new Nota();
		nc.setNota1(100);
		nc.setNota2(100);
		nc.setNota3(100);
		Estudiante c = new Estudiante();
		c.setNombre("Bernardo");
		c.setNota(nc);
		Nota nd = new Nota();
		nd.setNota1(100);
		nd.setNota2(100);
		nd.setNota3(99);
		Estudiante d = new Estudiante();
		d.setNombre("Alejandro");
		d.setNota(nd);
		Estudiante[] add = new Estudiante[2];
		add[0] = d;
		add[1] = c;
		Docente doc = new Docente();
		doc.setEstudiantes(add);
		doc.sortNota();
		Estudiante[] actual = doc.getEstudiantes();

		for (int i = 0; i < expected.length; i++) {
			Assert.assertEquals("Error no son el mismo", expected[i].getNombre(), actual[i].getNombre());
		}
	}

	@Test
	public void verifySortNombre() {
		Estudiante a = new Estudiante();
		a.setNombre("Bernardo");
		Estudiante b = new Estudiante();
		b.setNombre("Alejandro");
		Estudiante[] expected = new Estudiante[2];
		expected[0] = b;
		expected[1] = a;

		Estudiante c = new Estudiante();
		c.setNombre("Bernardo");
		Estudiante d = new Estudiante();
		d.setNombre("Alejandro");
		Estudiante[] add = new Estudiante[2];
		add[0] = c;
		add[1] = d;
		Docente doc = new Docente();
		doc.setEstudiantes(add);
		doc.sortNombre();
		Estudiante[] actual = doc.getEstudiantes();

		for (int i = 0; i < expected.length; i++) {
			Assert.assertEquals("Error no son el mismo", expected[i].getNombre(), actual[i].getNombre());
		}
	}
}
