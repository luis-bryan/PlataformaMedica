package Vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTitulo extends JPanel {
	private ImageIcon titulo;

	public PanelTitulo() {

		titulo = new ImageIcon(getClass().getResource("/Imagenes/clinicueb.png"));
		JLabel titu = new JLabel(titulo);
		add(titu);
		setVisible(true);

	}

}
