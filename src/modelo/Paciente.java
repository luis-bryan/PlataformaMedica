package modelo;

public class Paciente {
	private String nombre;
	private int edad;
	private String identificacion;
	private String 
	private int gradoDeCuidado;
	
	public Paciente(String nombre, int edad, String identificacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.identificacion = identificacion;
	}
	public void evaluarEdad() {
		if(edad>=0&&edad<=15) {
			
		}
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public int getGradoDeCuidado() {
		return gradoDeCuidado;
	}
	public void setGradoDeCuidado(int gradoDeCuidado) {
		this.gradoDeCuidado = gradoDeCuidado;
	}



}
