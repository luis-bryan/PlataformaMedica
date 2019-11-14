package Vista;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VentanaEsquizofrenia extends JFrame {
	ImageIcon fondoimagen;
	JLabel enunciado;
	JLabel deficitaprendizaje;
	JLabel imperactividad;
	JLabel deficitatencion;
	JComboBox<String> valores_evaluoDeficitAprendizaje;
	JComboBox<String> valores_evaluoImperactividad;
	JComboBox<String> valores_evaluoDeficitAtencion;
	JButton siguiente;

	public VentanaEsquizofrenia() {

		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoClinica.png")).getImage());
		setTitle("SINTOMAS ESQUIZOFRENIA");
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
		deficitaprendizaje = new JLabel("DELIRIOS:");
		deficitatencion = new JLabel("ALUCINACIONES:");
		imperactividad = new JLabel("PENSAMIENTOS Y HABLA DESORGANIZADA:");
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
		siguiente.setActionCommand("siguientefinalnc");

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

}
