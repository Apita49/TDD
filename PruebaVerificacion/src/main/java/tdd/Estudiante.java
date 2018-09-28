package tdd;

public class Estudiante extends Persona {
	private Nota nota;

	public Estudiante() {
		super();
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}

	public boolean isAprobed() {
		return nota.getTotal() / 3 >= 70;
	}

}
