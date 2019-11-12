package modelo;

import javax.swing.JComboBox;

public class Paciente {
	private String nombre;
	private String identificacion;
	private int edad;
	private String genero;
	private String clasificacion;

	public Paciente() {
		// TODO Auto-generated constructor stub
	}

	public Paciente(String nombre, String identificacion, int edad, String  genero,String clasificacion) {
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.edad = edad;
		this.genero = genero;
		this.clasificacion = clasificacion;
		clasificarPaciente();
	}

	public String clasificarPaciente() {
		if (edad >= 0 && edad <= 12) {
			clasificacion = "NIÑO";
		} else if (edad >= 13 && edad <= 25) {
			clasificacion = "JOVEN";
		} else if (edad >= 25) {
			clasificacion = "ADULTO";
		}
		return clasificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Paciente\n" + "Nombre= " + nombre + "\nIdentificacion= " + identificacion + "\nEdad= " + edad
				+ "\n Genero= " + genero + "\nClasificacion=" + clasificacion;
	}
}
