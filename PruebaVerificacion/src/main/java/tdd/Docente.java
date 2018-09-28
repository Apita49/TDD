package tdd;

public class Docente extends Persona {
	private Estudiante[] estudiantes;

	public Estudiante[] getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Docente() {
		super();
	}

	public void sortNota() {
		for (int i = 1; i < estudiantes.length; i++) {
			int index = i;
			while (index > 0 && estudiantes[index].getNota().getTotal() > estudiantes[index - 1].getNota().getTotal()) {
				Estudiante add = estudiantes[index];
				estudiantes[index] = estudiantes[index - 1];
				estudiantes[index - 1] = add;
				index--;
			}
		}
	}

	public void sortNombre() {
		for (int i = 1; i < estudiantes.length; i++) {
			int index = i;
			while (index > 0 && compareNamesFirstLessSecond(estudiantes[index].getNombre(),
					estudiantes[index - 1].getNombre())) {
				Estudiante add = estudiantes[index];
				estudiantes[index] = estudiantes[index - 1];
				estudiantes[index - 1] = add;
				index--;
			}
		}
	}

	private boolean compareNamesFirstLessSecond(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		int charAt = 0;
		while (charAt < a.length() && charAt < b.length() && a.charAt(charAt) == b.charAt(charAt)) {
			charAt++;
		}
		if (charAt == a.length()) {
			return true;
		} else if (charAt == b.length()) {
			return false;
		} else if (a.charAt(charAt) < b.charAt(charAt)) {
			return true;
		} else {
			return false;
		}
	}
}
