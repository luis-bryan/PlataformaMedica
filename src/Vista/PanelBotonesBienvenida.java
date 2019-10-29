package Vista;

import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelBotonesBienvenida extends JPanel {

	JButton historial;
	JButton nuevopaciente;

	public PanelBotonesBienvenida() {
		setLayout(null);
		setBounds(0, 470, 1000, 300);
		historial = new JButton("HISTORIAL DE PACIENTES");
		historial.setActionCommand("historial");
		nuevopaciente = new JButton("NUEVO PACIENTE");
		nuevopaciente.setActionCommand("nuevopaciente");

		add(historial).setBounds(40, 25, 220, 80);
		add(nuevopaciente).setBounds(450, 25, 220, 80);

	}

}
