package Vista;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VentanaNeuroDesarrollo extends JFrame {
	ImageIcon fondoimagen;
	JLabel enunciado;
	JLabel deficitaprendizaje;
	JLabel imperactividad;
	JLabel deficitatencion;
	JComboBox<String> valores_evaluoDeficitAprendizaje;
	JComboBox<String> valores_evaluoImperactividad;
	JComboBox<String> valores_evaluoDeficitAtencion;
	JButton siguiente;

	 public VentanaNeuroDesarrollo() {
		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoClinica.png")).getImage());
		setTitle("SINTOMAS NERODESARROLLOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 550, 450);
		setLocationRelativeTo(null);
		fondoimagen = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
		JLabel fondo = new JLabel(fondoimagen);
		enunciado = new JLabel("<html><body>.: SELECCIONE LA GRAVEDAD CON LA QUE EL PACIENTE PRESENTA ESTOS SINTOMAS:."
				+ "<br><br> TENIENDO EN CUENTA LOS SIGUIENTES VALORES:" + "<br>1 = NUNCA" + "<br>2 = BAJA"
				+ "<br>3 = MODERADO" + "<br>4 = MEDIO" + "<br>5 = ALTO</body></html>");
		deficitaprendizaje = new JLabel("NIVEL DEFICIT DE APRENDIZAJE:");
		deficitatencion = new JLabel("NIVEL DE DEFICIT DE ATENCI�N:");
		imperactividad = new JLabel("NIVEL DE IMPERACTIVIDAD:");
		valores_evaluoDeficitAprendizaje = new JComboBox<String>();
		valores_evaluoDeficitAprendizaje.addItem("1");
		valores_evaluoDeficitAprendizaje.addItem("2");
		valores_evaluoDeficitAprendizaje.addItem("3");
		valores_evaluoDeficitAprendizaje.addItem("4");
		valores_evaluoDeficitAprendizaje.addItem("5");
		((JLabel) valores_evaluoDeficitAprendizaje.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		valores_evaluoDeficitAtencion = new JComboBox<String>();
		valores_evaluoDeficitAtencion.addItem("1");
		valores_evaluoDeficitAtencion.addItem("2");
		valores_evaluoDeficitAtencion.addItem("3");
		valores_evaluoDeficitAtencion.addItem("4");
		valores_evaluoDeficitAtencion.addItem("5");
		((JLabel) valores_evaluoDeficitAtencion.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		valores_evaluoImperactividad = new JComboBox<String>();
		valores_evaluoImperactividad.addItem("1");
		valores_evaluoImperactividad.addItem("2");
		valores_evaluoImperactividad.addItem("3");
		valores_evaluoImperactividad.addItem("4");
		valores_evaluoImperactividad.addItem("5");
		((JLabel) valores_evaluoImperactividad.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

		siguiente = new JButton("SIGUIENTE");
		siguiente.setActionCommand("siguienteND");

		add(enunciado).setBounds(10, 10, 600, 150);
		add(deficitaprendizaje).setBounds(40, 165, 200, 80);
		add(valores_evaluoDeficitAprendizaje).setBounds(280, 190, 100, 30);
		add(deficitatencion).setBounds(40, 210, 200, 80);
		add(valores_evaluoDeficitAtencion).setBounds(280, 235, 100, 30);
		add(imperactividad).setBounds(40, 255, 200, 80);
		add(valores_evaluoImperactividad).setBounds(280, 280, 100, 30);
		add(siguiente).setBounds(195, 340, 150, 50);
		add(fondo).setBounds(0, 0, 550, 450);

		setVisible(false);

	}

	public ImageIcon getFondoimagen() {
		return fondoimagen;
	}

	public void setFondoimagen(ImageIcon fondoimagen) {
		this.fondoimagen = fondoimagen;
	}

	public JLabel getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(JLabel enunciado) {
		this.enunciado = enunciado;
	}

	public JLabel getDeficitaprendizaje() {
		return deficitaprendizaje;
	}

	public void setDeficitaprendizaje(JLabel deficitaprendizaje) {
		this.deficitaprendizaje = deficitaprendizaje;
	}

	public JLabel getImperactividad() {
		return imperactividad;
	}

	public void setImperactividad(JLabel imperactividad) {
		this.imperactividad = imperactividad;
	}

	public JLabel getDeficitatencion() {
		return deficitatencion;
	}

	public void setDeficitatencion(JLabel deficitatencion) {
		this.deficitatencion = deficitatencion;
	}

	public JComboBox<String> getValores_evaluoDeficitAprendizaje() {
		return valores_evaluoDeficitAprendizaje;
	}

	public void setValores_evaluoDeficitAprendizaje(JComboBox<String> valores_evaluoDeficitAprendizaje) {
		this.valores_evaluoDeficitAprendizaje = valores_evaluoDeficitAprendizaje;
	}

	public JComboBox<String> getValores_evaluoImperactividad() {
		return valores_evaluoImperactividad;
	}

	public void setValores_evaluoImperactividad(JComboBox<String> valores_evaluoImperactividad) {
		this.valores_evaluoImperactividad = valores_evaluoImperactividad;
	}

	public JComboBox<String> getValores_evaluoDeficitAtencion() {
		return valores_evaluoDeficitAtencion;
	}

	public void setValores_evaluoDeficitAtencion(JComboBox<String> valores_evaluoDeficitAtencion) {
		this.valores_evaluoDeficitAtencion = valores_evaluoDeficitAtencion;
	}

	public JButton getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(JButton siguiente) {
		this.siguiente = siguiente;
	}


}
