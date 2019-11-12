package Vista;

import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class VentanaRegistro extends JFrame {
	JButton registrar;
	ImageIcon fondoimagen;
	JLabel nombre;
	JTextField nombre_;
	JLabel identificacion;
	JTextField identificacion_;
	JLabel edad;
	JTextField edad_;
	JLabel genero;
	JComboBox<String> genero_;

	public VentanaRegistro() {
		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoClinica.png")).getImage());
		setTitle("REGISTRO PACIENTE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 400, 350);
		setLocationRelativeTo(null);
		fondoimagen = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
		JLabel fondo = new JLabel(fondoimagen);
		nombre = new JLabel("NOMBRE PACIENTE:");
		identificacion = new JLabel("IDENTIFICACIÓN PACIENTE:");
		edad = new JLabel("EDAD PACIENTE:");
		nombre_ = new JTextField(100);
		identificacion_ = new JTextField(100);
		edad_ = new JTextField(100);
		genero = new JLabel("GENERO PACIENTE:");
		genero_ = new JComboBox<String>();
		registrar = new JButton("REGISTRAR PACIENTE");
		registrar.setActionCommand("registrar");

		add(nombre).setBounds(10, 10, 200, 50);
		add(nombre_).setBounds(130, 20, 250, 30);
		add(identificacion).setBounds(10, 70, 200, 50);
		add(identificacion_).setBounds(170, 80, 208, 30);
		add(edad).setBounds(10, 130, 200, 50);
		add(edad_).setBounds(110, 140, 200, 30);
		add(genero).setBounds(10, 190, 200, 50);
		genero_.addItem("MASCULINO");
		genero_.addItem("FEMENINO");
		genero_.addItem("OTRO");
		add(genero_).setBounds(140, 200, 200, 30);
		add(registrar).setBounds(95, 260, 200, 30);
		add(fondo).setBounds(0, 0, 400, 350);

		setVisible(false);

	}

	public JButton getRegistrar() {
		return registrar;
	}

	public void setRegistrar(JButton registrar) {
		this.registrar = registrar;
	}

	public ImageIcon getFondoimagen() {
		return fondoimagen;
	}

	public void setFondoimagen(ImageIcon fondoimagen) {
		this.fondoimagen = fondoimagen;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JTextField getNombre_() {
		return nombre_;
	}

	public void setNombre_(JTextField nombre_) {
		this.nombre_ = nombre_;
	}

	public JLabel getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(JLabel identificacion) {
		this.identificacion = identificacion;
	}

	public JTextField getIdentificacion_() {
		return identificacion_;
	}

	public void setIdentificacion_(JTextField identificacion_) {
		this.identificacion_ = identificacion_;
	}

	public JLabel getEdad() {
		return edad;
	}

	public void setEdad(JLabel edad) {
		this.edad = edad;
	}

	public JTextField getEdad_() {
		return edad_;
	}

	public void setEdad_(JTextField edad_) {
		this.edad_ = edad_;
	}

	public JLabel getGenero() {
		return genero;
	}

	public void setGenero(JLabel genero) {
		this.genero = genero;
	}

	public JComboBox<String> getGenero_() {
		return genero_;
	}

	public void setGenero_(JComboBox<String> genero_) {
		this.genero_ = genero_;
	}

}
