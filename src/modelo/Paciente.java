package modelo;

public class Paciente {
	private String nombre;
	private String identificacion;
	private int edad;
	private String clasificacion;
	public Paciente() {
		// TODO Auto-generated constructor stub
	}
	
	public Paciente(String nombre, String identificacion, int edad) {
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.edad = edad;
	}
	
	public void clasificarPaciente() {
		if (edad>=0&&edad<=12) {
			clasificacion="NIÑO";
		}else if (edad>=13&&edad<=25) {
			clasificacion="JOVEN";
		}else if(edad>=25) {
			clasificacion="ADULTO";
		} 
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
	

	
}
