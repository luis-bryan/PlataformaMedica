package Vista;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;

public class VentanaEnfermedades extends JFrame {
	ImageIcon fondoimagen;
	JLabel pregunta;
	JLabel paciente;
	JLabel matriz;
	JLabel enfermedad1;
	JLabel enfermedad2;
	JLabel enfermedad3;
	ButtonGroup e1;
	ButtonGroup e2;
	ButtonGroup e3;
	JRadioButton enfermedad1_si;
	JRadioButton enfermedad1_no;
	JRadioButton enfermedad2_si;
	JRadioButton enfermedad2_no;
	JRadioButton enfermedad3_si;
	JRadioButton enfermedad3_no;

	JButton siguiente;

	public VentanaEnfermedades() {
		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoClinica.png")).getImage());
		setTitle("ENFERMEDADES PACIENTE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 400, 350);
		setLocationRelativeTo(null);
		fondoimagen = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
		JLabel fondo = new JLabel(fondoimagen);
		paciente = new JLabel("MANEJO PACIENTE:");
		matriz = new JLabel("           ");
		pregunta = new JLabel(".: SELECCIONE LAS ENFERMEDADES QUE PADECE EL PACIENTE :.");
		enfermedad1 = new JLabel("NEUROCOGNITIVO");
		enfermedad2 = new JLabel("NEURODESARROLLO");
		enfermedad3 = new JLabel("ALZHEIMER");
		ButtonGroup e1 = new ButtonGroup();
		enfermedad1_si = new JRadioButton("APLICA", false);
		enfermedad1_no = new JRadioButton("NO APLICA", false);
		e1.add(enfermedad1_si);
		e1.add(enfermedad1_no);
		ButtonGroup e2 = new ButtonGroup();
		enfermedad2_si = new JRadioButton("APLICA", false);
		enfermedad2_no = new JRadioButton("NO APLICA", false);
		e2.add(enfermedad2_si);
		e2.add(enfermedad2_no);
		ButtonGroup e3 = new ButtonGroup();
		enfermedad3_si = new JRadioButton("APLICA", false);
		enfermedad3_no = new JRadioButton("NO APLICA", false);
		e3.add(enfermedad3_si);
		e3.add(enfermedad3_no);

		siguiente = new JButton("SIGUIENTE");
		siguiente.setActionCommand("siguiente");

		add(paciente).setBounds(10, 10, 200, 50);
		add(matriz).setBounds(130, 10, 200, 50);
		add(pregunta).setBounds(10, 50, 400, 30);
		add(enfermedad1).setBounds(10, 85, 200, 50);
		add(enfermedad1_si).setBounds(150, 95, 100, 30);
		add(enfermedad1_no).setBounds(250, 95, 100, 30);
		add(enfermedad2).setBounds(10, 135, 200, 50);
		add(enfermedad2_si).setBounds(150, 145, 100, 30);
		add(enfermedad2_no).setBounds(250, 145, 100, 30);
		add(enfermedad3).setBounds(10, 185, 200, 50);
		add(enfermedad3_si).setBounds(150, 195, 100, 30);
		add(enfermedad3_no).setBounds(250, 195, 100, 30);
		add(siguiente).setBounds(95, 260, 200, 30);
		add(fondo).setBounds(0, 0, 400, 350);

		setVisible(false);

	}

	public ImageIcon getFondoimagen() {
		return fondoimagen;
	}

	public void setFondoimagen(ImageIcon fondoimagen) {
		this.fondoimagen = fondoimagen;
	}

	public JLabel getPregunta() {
		return pregunta;
	}

	public void setPregunta(JLabel pregunta) {
		this.pregunta = pregunta;
	}

	public JLabel getPaciente() {
		return paciente;
	}

	public void setPaciente(JLabel paciente) {
		this.paciente = paciente;
	}

	public JLabel getMatriz() {
		return matriz;
	}

	public void setMatriz(JLabel matriz) {
		this.matriz = matriz;
	}

	public JLabel getEnfermedad1() {
		return enfermedad1;
	}

	public void setEnfermedad1(JLabel enfermedad1) {
		this.enfermedad1 = enfermedad1;
	}

	public JLabel getEnfermedad2() {
		return enfermedad2;
	}

	public void setEnfermedad2(JLabel enfermedad2) {
		this.enfermedad2 = enfermedad2;
	}

	public JLabel getEnfermedad3() {
		return enfermedad3;
	}

	public void setEnfermedad3(JLabel enfermedad3) {
		this.enfermedad3 = enfermedad3;
	}

	public ButtonGroup getE1() {
		return e1;
	}

	public void setE1(ButtonGroup e1) {
		this.e1 = e1;
	}

	public ButtonGroup getE2() {
		return e2;
	}

	public void setE2(ButtonGroup e2) {
		this.e2 = e2;
	}

	public ButtonGroup getE3() {
		return e3;
	}

	public void setE3(ButtonGroup e3) {
		this.e3 = e3;
	}

	public JRadioButton getEnfermedad1_si() {
		return enfermedad1_si;
	}

	public void setEnfermedad1_si(JRadioButton enfermedad1_si) {
		this.enfermedad1_si = enfermedad1_si;
	}

	public JRadioButton getEnfermedad1_no() {
		return enfermedad1_no;
	}

	public void setEnfermedad1_no(JRadioButton enfermedad1_no) {
		this.enfermedad1_no = enfermedad1_no;
	}

	public JRadioButton getEnfermedad2_si() {
		return enfermedad2_si;
	}

	public void setEnfermedad2_si(JRadioButton enfermedad2_si) {
		this.enfermedad2_si = enfermedad2_si;
	}

	public JRadioButton getEnfermedad2_no() {
		return enfermedad2_no;
	}

	public void setEnfermedad2_no(JRadioButton enfermedad2_no) {
		this.enfermedad2_no = enfermedad2_no;
	}

	public JRadioButton getEnfermedad3_si() {
		return enfermedad3_si;
	}

	public void setEnfermedad3_si(JRadioButton enfermedad3_si) {
		this.enfermedad3_si = enfermedad3_si;
	}

	public JRadioButton getEnfermedad3_no() {
		return enfermedad3_no;
	}

	public void setEnfermedad3_no(JRadioButton enfermedad3_no) {
		this.enfermedad3_no = enfermedad3_no;
	}

	public JButton getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(JButton siguiente) {
		this.siguiente = siguiente;
	}
	

}
