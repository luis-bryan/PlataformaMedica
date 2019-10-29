package Vista;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaBienvenida extends JFrame {

	PanelTitulo pt;
	PanelBotonesBienvenida pbb;

	public VentanaBienvenida() {
		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoClinica.png")).getImage());
		setTitle("CLINIC UEB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setBounds(0, 0, 710, 640);
		setLocationRelativeTo(null);

		pt = new PanelTitulo();
		pbb = new PanelBotonesBienvenida();
		
		pt.setBackground(Color.white);
		
		add(pt).setBounds(5, 5, 694, 600);
		add(pbb);
		setVisible(true);

	}

}
