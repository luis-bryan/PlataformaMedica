package Vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controlador.Controlador;

public class VentanaBienvenida extends JFrame {

	PanelTitulo pt;
	VentanaHistorial vh;
	VentanaRegistro vr;
	VentanaEnfermedades ve;
	VentanaNeuroCognitivo vnc;

	public VentanaBienvenida(Controlador c) {

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
		

		pt.getHistorial().addActionListener(c);
		vh.pb.buscar.addActionListener(c);
		pt.getNuevopaciente().addActionListener(c);
		vr.getRegistrar().addActionListener(c);
		ve.getSiguiente().addActionListener(c);
		ve.enfermedad1_si.addActionListener(c);
		ve.enfermedad1_no.addActionListener(c);
	}

	public PanelTitulo getPt() {
		return pt;
	}

	public void setPt(PanelTitulo pt) {
		this.pt = pt;
	}

	public VentanaHistorial getVh() {
		return vh;
	}

	public void setVh(VentanaHistorial vh) {
		this.vh = vh;
	}

	public VentanaRegistro getVr() {
		return vr;
	}

	public void setVr(VentanaRegistro vr) {
		this.vr = vr;
	}

	public VentanaEnfermedades getVe() {
		return ve;
	}

	public void setVe(VentanaEnfermedades ve) {
		this.ve = ve;
	}

	public VentanaNeuroCognitivo getVnc() {
		return vnc;
	}

	public void setVnc(VentanaNeuroCognitivo vnc) {
		this.vnc = vnc;
	}

}
