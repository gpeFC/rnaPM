/******************************************************************************
 * UAEM, Facultad de Ciencias
 * Seminario de Programacion II
 * Emanuel GP
 *
 * Proyecto: Red Neuronal Artificial: Perceptron Multicapa con Retropropagacion
 ******************************************************************************/

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;

public class VentanaMostrarRed extends JFrame{

	private JLabel datosRedJL;
	private JLabel redMostrarJL;

	private JButton salirJB;

	private JComboBox redesJCB;

	private JPanel panelDatosRedJP;

	public VentanaMostrarRed(){
		super("Mostrar Red");
		setLayout(new FlowLayout());

		datosRedJL = new JLabel("Datos de la Red");
		redMostrarJL = new JLabel("Red a mostar: ");

		salirJB = new JButton("Salir");

		redesJCB = new JComboBox();
		redesJCB.setPreferredSize(new Dimension(150,20));
		redesJCB.setMaximumRowCount(3);

		panelDatosRedJP = new JPanel();
		panelDatosRedJP.setPreferredSize(new Dimension(300,250));

		add(redMostrarJL);
		add(redesJCB);
		add(datosRedJL);
		add(new JScrollPane(panelDatosRedJP));
		add(salirJB);
	}
}