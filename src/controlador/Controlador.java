package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import Vista.VentanaBienvenida;
import modelo.Mundo;
import modelo.Paciente;

public class Controlador implements ActionListener {
	private Mundo m;
	private VentanaBienvenida vb;

	public Controlador() {
		m = new Mundo();
		vb = new VentanaBienvenida(this);

	}

	public Mundo getM() {
		return m;
	}

	public void setM(Mundo m) {
		this.m = m;
	}

	public VentanaBienvenida getV() {
		return vb;
	}

	public void setV(VentanaBienvenida vb) {
		this.vb = vb;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("historial")) {
			vb.getVh().setVisible(true);
		} else if (e.getActionCommand().equals("nuevopaciente")) {
			vb.getVr().getNombre_().setText("");
			vb.getVr().getIdentificacion_().setText("");
			vb.getVr().getEdad_().setText("");
			vb.getVr().setVisible(true);

		} else if (e.getActionCommand().equals("registrar")) {

			if (vb.getVr().getEdad_().getText().length() == 0 && vb.getVr().getNombre_().getText().length() == 0) {
				JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS DATOS \n POR FAVOR");
			} else {
				m.agregar(vb.getVr().getNombre_().getText(), Integer.parseInt(vb.getVr().getEdad_().getText()),
						vb.getVr().getIdentificacion_().getText(), vb.getVr().getGenero_().getSelectedItem().toString(),
						m.getPa().clasificarPaciente());
				vb.getVh().getPl().getModeloLista().addElement(vb.getVr().getNombre_().getText());

				vb.getVr().setVisible(false);
				vb.getVr().getEdad_().setText("");
				vb.getVr().getNombre_().setText("");
				vb.getVr().getIdentificacion_().setText("");

				if (vb.getVr().getEdad_().getText().length() == 0 && vb.getVr().getNombre_().getText().length() == 0) {

					JOptionPane.showMessageDialog(null, "Ingrese Todos los datos");

				} else {

					m.agregar(vb.getVr().getNombre_().getText(), Integer.parseInt(vb.getVr().getEdad_().getText()),
							vb.getVr().getIdentificacion_().getText(),
							vb.getVr().getGenero_().getSelectedItem().toString(), m.getPa().clasificarPaciente());
					vb.getVh().getPl().getModeloLista().addElement(vb.getVr().getNombre_().getText());

					vb.getVr().setVisible(false);

					vb.getVe().setVisible(true);
				}

			}
		} else if (e.getActionCommand().equals("siguiente")) {

			if (vb.getVe().getEnfermedad1_si().isSelected() == true) {
				m.getPa();
				Paciente p1 = m.buscar(vb.getVr().getIdentificacion_().getText());
				p1.setEnfermedad1(true);
				vb.getVnc().setVisible(true);
				vb.getVe().setVisible(false);

			}

		} else if (e.getActionCommand().equals("buscar")) {
			JOptionPane.showMessageDialog(null,
					(m.buscar(JOptionPane.showInputDialog("Digite cedula del paciente")).toString()));

		}
		if (vb.getVe().getEnfermedad2_si().isSelected() == true) {
			m.getPa();
			Paciente p1 = m.buscar(vb.getVr().getIdentificacion_().getText());
			p1.setEnfermedad2(true);
			if (p1.isEnfermedad1() != true) {
				vb.getVnd().setVisible(true);
				vb.getVe().setVisible(false);
			}
		}
		if (vb.getVe().getEnfermedad3_si().isSelected() == true) {
			m.getPa();
			Paciente p1 = m.buscar(vb.getVr().getIdentificacion_().getText());
			p1.setEnfermedad3(true);
			if ((p1.isEnfermedad1() && p1.isEnfermedad2() && p1.isEnfermedad3()) == true) {
				vb.getVnc().setVisible(false);
				vb.getVnd().setVisible(false);
				p1.setCuidados(m.getCu().clasificarMatriz(p1.getClasificacion(), 15, 15));
				JOptionPane.showMessageDialog(null, p1.getCuidados());
			}
		}

		else if (e.getActionCommand().equals("buscar")) {
			JOptionPane.showMessageDialog(null,
					(m.buscar(JOptionPane.showInputDialog("Digite cedula del paciente")).toString()));

		} else if (e.getActionCommand().equals("siguienteNC")) {
			m.getPa();
			Paciente p1 = m.buscar(vb.getVr().getIdentificacion_().getText());
			p1.setSumaNC(m.getCu().sumatoriaNeurocognitivo(
					Integer.parseInt(vb.getVnc().getValores_evaluoDeficitAprendizaje().getSelectedItem().toString()),
					Integer.parseInt(vb.getVnc().getValores_evaluoDeficitAtencion().getSelectedItem().toString()),
					Integer.parseInt(vb.getVnc().getValores_evaluoImperactividad().getSelectedItem().toString())));
			vb.getVnc().setVisible(false);
			if (p1.isEnfermedad2() == true) {
				vb.getVnd().setVisible(true);
			} else {
				p1.setCuidados(m.getCu().clasificarMatriz(p1.getClasificacion(), p1.getSumaNC(), p1.getSumaND()));
				JOptionPane.showMessageDialog(null, p1.getCuidados());
			}

		} else if (e.getActionCommand().equals("siguienteND")) {
			m.getPa();
			Paciente p1 = m.buscar(vb.getVr().getIdentificacion_().getText());
			p1.setSumaND(m.getCu().sumatoriaNeurocognitivo(
					Integer.parseInt(vb.getVnc().getValores_evaluoDeficitAprendizaje().getSelectedItem().toString()),
					Integer.parseInt(vb.getVnc().getValores_evaluoDeficitAtencion().getSelectedItem().toString()),
					Integer.parseInt(vb.getVnc().getValores_evaluoImperactividad().getSelectedItem().toString())));
			vb.getVnd().setVisible(false);
			p1.setCuidados(m.getCu().clasificarMatriz(p1.getClasificacion(), p1.getSumaNC(), p1.getSumaND()));
			JOptionPane.showMessageDialog(null, p1.getCuidados());
		}
	}
}
