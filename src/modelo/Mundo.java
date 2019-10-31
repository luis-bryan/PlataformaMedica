package modelo;

import java.util.ArrayList;

public class Mundo {
	
	private Paciente pa;
	private ArrayList<Paciente> pacientes;
	
	public Mundo() {
		pa = new Paciente();
	}
	
	public Paciente buscar(String cedula)
	{
		Paciente p = null;
		if(!pacientes.isEmpty())
		{
			for (int i = 0; i < pacientes.size(); i++)
			{
				if(pacientes.get(i).getIdentificacion().equals(cedula))
				{
					p = pacientes.get(i);
				}
			}
		}
		return p;
	}
	
	public void agregar(String nombre, int edad, String cedula)
	{
		Paciente nuevo = buscar(cedula);
		if(nuevo==null)
		{
			nuevo = new Paciente(nombre, cedula, edad);
			pacientes.add(nuevo);
		}
	}
	
	public void eliminar(String cedula)
	{
		Paciente eliminar = buscar(cedula);
		if(eliminar!=null)
		{
			pacientes.remove(eliminar);
		}
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
