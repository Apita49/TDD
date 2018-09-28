package tdd;

public class Persona {
	private String nombre;
	private int fechaNac;

	public Persona() {
	}

	public int getEdad() {
		return 2018 - fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaNac(int fechaNac) {
		this.fechaNac = fechaNac;
	}
}
