package modelo;

import javax.swing.JComboBox;

public class Paciente {
	private String nombre;
	private String identificacion;
	private int edad;
	private String genero;
	private String clasificacion;
	private boolean enfermedad1;
	private boolean enfermedad2;
	private boolean enfermedad3;
	private String cuidados;
	private int sumaNC;
	private int sumaND;


	public int getSumaNC() {
		return sumaNC;
	}

	public void setSumaNC(int sumaNC) {
		this.sumaNC = sumaNC;
	}

	public int getSumaND() {
		return sumaND;
	}

	public void setSumaND(int sumaND) {
		this.sumaND = sumaND;
	}

	public String getCuidados() {
		return cuidados;
	}

	public void setCuidados(String cuidados) {
		this.cuidados = cuidados;
	}

	public boolean isEnfermedad1() {
		return enfermedad1;
	}

	public void setEnfermedad1(boolean enfermedad1) {
		this.enfermedad1 = enfermedad1;
	}

	public boolean isEnfermedad2() {
		return enfermedad2;
	}

	public void setEnfermedad2(boolean enfermedad2) {
		this.enfermedad2 = enfermedad2;
	}

	public boolean isEnfermedad3() {
		return enfermedad3;
	}

	public void setEnfermedad3(boolean enfermedad3) {
		this.enfermedad3 = enfermedad3;
	}

	public Paciente() {
		sumaNC = 0;
		sumaNC = 0;
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
		return "PACIENTE\n" + "Nombre= " + nombre + "\nIdentificacion= " + identificacion + "\nEdad= " + edad
				+ "\nGenero= " + genero + "\nClasificacion=" + clasificacion+"\n.:Cuidados:."+"\n"+cuidados;
	}
}
