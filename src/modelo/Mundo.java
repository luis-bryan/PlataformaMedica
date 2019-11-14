package modelo;

import java.util.ArrayList;

import javax.swing.JComboBox;

public class Mundo {

	private Paciente pa;
	private Cuidados cu;
	private ArrayList<Paciente> pacientes;

	public Mundo() {
		pa = new Paciente();
		cu = new Cuidados();
		pacientes = new ArrayList<Paciente>();
	}

	public Paciente buscar(String cedula) {
		Paciente p = null;
		if (!pacientes.isEmpty()) {
			for (int i = 0; i < pacientes.size(); i++) {
				if (pacientes.get(i).getIdentificacion().equals(cedula)) {
					p = pacientes.get(i);
				}
			}
		}
		return p;
	}

	public void agregar(String nombre, int edad, String cedula, String genero, String clasificacion) {
		Paciente nuevo = buscar(cedula);
		if (nuevo == null) {
			nuevo = new Paciente(nombre, cedula, edad, genero,clasificacion);
			pacientes.add(nuevo);
		}
	}

	public void eliminar(String cedula) {
		Paciente eliminar = buscar(cedula);
		if (eliminar != null) {
			pacientes.remove(eliminar);
		}
	}

	public String historial() {
		String r = "";
		for (int i = 0; i < pacientes.size(); i++) {
			r = r + pacientes.toString() + "\n";
		}
		return r;
	}
	

	public Cuidados getCu() {
		return cu;
	}

	public void setCu(Cuidados cu) {
		this.cu = cu;
	}

	public Paciente getPa() {
		return pa;
	}

	public void setPa(Paciente pa) {
		this.pa = pa;
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
}
