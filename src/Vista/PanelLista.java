package Vista;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelLista extends JPanel {

	JList<String> listaVehiculos;
	DefaultListModel<String> modeloLista;

	public PanelLista() {
		setLayout(null);
		setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new TitledBorder("LISTA PACIENTES:")));
		listaVehiculos = new JList<String>();
		modeloLista = new DefaultListModel<String>();
		listaVehiculos.setModel(modeloLista);
		listaVehiculos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane desplazamientolista = new JScrollPane(listaVehiculos);
		desplazamientolista.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(desplazamientolista).setBounds(20, 30, 380, 550);

	}

}
