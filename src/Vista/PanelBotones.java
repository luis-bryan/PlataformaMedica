package Vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelBotones extends JPanel {
	JButton eliminar;
	JButton buscar;

	public PanelBotones() {
		setLayout(null);
		setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new TitledBorder("FUNCIONES:")));

		eliminar = new JButton("ELIMINAR PACIENTE");
		eliminar.setActionCommand("eliminar");
		buscar = new JButton("BUSCAR PACIENTE");
		buscar.setActionCommand("buscar");

		add(buscar).setBounds(20, 100, 220, 100);
		add(eliminar).setBounds(20, 400, 220, 100);
	}

}
