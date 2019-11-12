package Vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaBienvenida extends JFrame implements ActionListener {

	PanelTitulo pt;
	VentanaHistorial vh;
	VentanaRegistro vr;
	VentanaEnfermedades ve;
	VentanaNeuroCognitivo vnc;

	public VentanaBienvenida() {
		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoClinica.png")).getImage());
		setTitle("CLINIC UEB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 710, 630);
		setLocationRelativeTo(null);

		pt = new PanelTitulo();
		vh = new VentanaHistorial();
		vr = new VentanaRegistro();
		ve = new VentanaEnfermedades();
		vnc = new VentanaNeuroCognitivo();

		getContentPane().add(pt).setBounds(4, 1, 710, 630);

		pt.setBackground(Color.white);
		setVisible(true);

		pt.getHistorial().addActionListener(this);
		pt.getNuevopaciente().addActionListener(this);
		vr.getRegistrar().addActionListener(this);
		ve.getSiguiente().addActionListener(this);
		ve.enfermedad1_si.addActionListener(this);
		ve.enfermedad1_no.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("historial")) {
			vh.setVisible(true);
		} else if (e.getActionCommand().equals("nuevopaciente")) {
			vr.setVisible(true);
		} else if (e.getActionCommand().equals("registrar")) {
			vr.setVisible(false);
			ve.setVisible(true);
		} else if (e.getActionCommand().equals("siguiente")) {
			if (ve.getEnfermedad1_si().isSelected() == true) {
				vnc.setVisible(true);
				ve.setVisible(false);
			}
		}
	}

}
