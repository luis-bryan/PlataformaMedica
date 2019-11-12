package Vista;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTitulo extends JPanel {
	private ImageIcon titulo;
	private JButton historial;
	private JButton nuevopaciente;

	public PanelTitulo() {
		setLayout(null);
		titulo = new ImageIcon(getClass().getResource("/Imagenes/clinicueb.png"));
		JLabel titu = new JLabel(titulo);
		historial = new JButton("HISTORIAL DE PACIENTES");
		historial.setActionCommand("historial");
		nuevopaciente = new JButton("NUEVO PACIENTE");
		nuevopaciente.setActionCommand("nuevopaciente");
		setBackground(Color.white);

		add(nuevopaciente).setBounds(420, 480, 200, 80);
		add(historial).setBounds(70, 480, 200, 80);
		add(titu).setBounds(0, 0, 695, 600);

		setVisible(true);

	}

	public ImageIcon getTitulo() {
		return titulo;
	}

	public void setTitulo(ImageIcon titulo) {
		this.titulo = titulo;
	}

	public JButton getHistorial() {
		return historial;
	}

	public void setHistorial(JButton historial) {
		this.historial = historial;
	}

	public JButton getNuevopaciente() {
		return nuevopaciente;
	}

	public void setNuevopaciente(JButton nuevopaciente) {
		this.nuevopaciente = nuevopaciente;
	}

}
