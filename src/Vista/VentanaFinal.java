package Vista;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class VentanaFinal extends JFrame {
	VentanaRegistro vr;
	ImageIcon fondoimagen;
	JLabel enunciado;
	JTextArea informacion;
	private ImageIcon icono;

	public VentanaFinal() {

		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoClinica.png")).getImage());
		setTitle("CUIDADOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 550, 450);
		setLocationRelativeTo(null);
		icono = new ImageIcon(getClass().getResource("/Imagenes/logoclinica.png"));
		ImageIcon newImage = new ImageIcon(icono.getImage().getScaledInstance(90, 100, Image.SCALE_SMOOTH));
		JLabel iconoJLabel = new JLabel(newImage);

		fondoimagen = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
		JLabel fondo = new JLabel(fondoimagen);
		enunciado = new JLabel(".: ESTOS SON LOS CUIDADOS QUE DEBERAN SER PRESTADOS AL PACIENTE :.");
		informacion = new JTextArea();
		informacion.setOpaque(false);
		informacion.setEnabled(true);
		informacion.setEditable(false);
		informacion.setBorder(null);
		informacion.setText("NOMBRE PACIENTE:\n\nEDAD PACIENTE: ");
		add(enunciado).setBounds(10, 0, 500, 50);
		add(informacion).setBounds(10, 50, 520, 350);
		add(iconoJLabel).setBounds(450, 10, 90, 100);
		add(fondo).setBounds(0, 0, 550, 450);

		setVisible(true);

	}

}
