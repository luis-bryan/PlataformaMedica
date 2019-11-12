package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import Vista.VentanaBienvenida;
import modelo.Mundo;

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
			vb.getVr().setVisible(true);

		} else if (e.getActionCommand().equals("registrar")) {
			if(vb.getVr().getEdad_().getText().length()==0&&vb.getVr().getNombre_().getText().length()==0) {
				JOptionPane.showMessageDialog(null, "Ingrese Todos los datos");
			}else {
			m.agregar(vb.getVr().getNombre_().getText(), Integer.parseInt(vb.getVr().getEdad_().getText()),
					vb.getVr().getIdentificacion_().getText(), vb.getVr().getGenero_().getSelectedItem().toString(),m.getPa().clasificarPaciente());
			vb.getVh().getPl().getModeloLista().addElement(vb.getVr().getNombre_().getText());
			
			vb.getVr().setVisible(false);
			vb.getVr().getEdad_().setText("");
			vb.getVr().getNombre_().setText("");
			vb.getVr().getIdentificacion_().setText("");
			vb.getVe().setVisible(true);
			}
		
		} else if (e.getActionCommand().equals("siguiente")) {
			if (vb.getVe().getEnfermedad1_si().isSelected() == true) {
				vb.getVnc().setVisible(true);
				vb.getVe().setVisible(false);
			}
		}else if(e.getActionCommand().equals("buscar")) {
			JOptionPane.showMessageDialog(null, (m.buscar(JOptionPane.showInputDialog("Digite cedula del paciente")).toString()));
			
		}
	}

}
