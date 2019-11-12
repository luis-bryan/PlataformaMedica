package Vista;

import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class VentanaHistorial extends JFrame {
	PanelBotones pb;
	PanelLista pl;

	JList<String> listaVehiculos;
	DefaultListModel<String> modeloLista;

	public VentanaHistorial() {
		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoClinica.png")).getImage());
		setTitle("HISTORIAL PACIENTES");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 710, 640);
		setLocationRelativeTo(null);
		
		pb= new PanelBotones();
		pl= new PanelLista();
		
		pl.setBackground(Color.white);
		add(pl).setBounds(10, 10, 420, 600);
		pb.setBackground(Color.white);
		add(pb).setBounds(425, 10, 260, 600);

		setVisible(false);

	}

}
