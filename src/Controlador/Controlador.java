package Controlador;

import Vista.VentanaBienvenida;
import modelo.Mundo;

public class Controlador {
	private Mundo m;
	private  VentanaBienvenida v;
	public Controlador() {
		m = new Mundo();
		v = new VentanaBienvenida();
	}

}
