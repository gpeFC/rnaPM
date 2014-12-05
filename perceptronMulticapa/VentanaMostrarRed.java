/******************************************************************************
 * UAEM, Facultad de Ciencias
 * Seminario de Programacion II
 * Emanuel GP
 *
 * Proyecto: Red Neuronal Artificial: Perceptron Multicapa con Retropropagacion
 ******************************************************************************/

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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

	private JPanel panelVacioJP0;
	private JPanel panelVacioJP1;
	private JPanel panelVacioJP2;
	private JPanel panelVacioJP3;
	private JPanel panelRedesJP;
	private JPanel panelDatosRedJP;

	public VentanaMostrarRed(){
		super("Mostrar Red");
		setLayout(new FlowLayout());

		datosRedJL = new JLabel("Datos de la Red");
		redMostrarJL = new JLabel(" Red a mostar: ");

		salirJB = new JButton("Salir");

		redesJCB = new JComboBox();
		redesJCB.setPreferredSize(new Dimension(150,20));
		redesJCB.setMaximumRowCount(3);

		panelVacioJP0 = new JPanel();
		panelVacioJP0.setPreferredSize(new Dimension(350,5));

		panelVacioJP1 = new JPanel();
		panelVacioJP1.setPreferredSize(new Dimension(350,5));

		panelVacioJP2 = new JPanel();
		panelVacioJP2.setPreferredSize(new Dimension(350,5));

		panelVacioJP3 = new JPanel();
		panelVacioJP3.setPreferredSize(new Dimension(350,5));

		panelRedesJP = new JPanel();
		panelRedesJP.setPreferredSize(new Dimension(300,20));
		panelRedesJP.setLayout(new GridLayout(1,2));

		panelDatosRedJP = new JPanel();
		panelDatosRedJP.setPreferredSize(new Dimension(300,250));

		panelRedesJP.add(redMostrarJL);
		panelRedesJP.add(redesJCB);

		add(panelVacioJP0);
		add(panelRedesJP);
		add(panelVacioJP1);
		add(datosRedJL);
		add(new JScrollPane(panelDatosRedJP));
		add(panelVacioJP2);
		add(salirJB);
		add(panelVacioJP3);
	}
}