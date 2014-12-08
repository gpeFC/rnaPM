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
import javax.swing.JComboBox;

public class VentanaEliminarRed extends JFrame{

	private JLabel redEliminarJL;

	private JButton eliminarJB;
	private JButton salirJB;

	private JComboBox redesJCB;

	private JPanel panelVacioJP0;
	private JPanel panelVacioJP1;
	private JPanel panelVacioJP2;
	private JPanel panelRedesJP;
	private JPanel panelBotonesAccionJP;

	public VentanaEliminarRed(){
		super("Eliminar Red");
		setLayout(new FlowLayout());

		redEliminarJL = new JLabel(" Red a eliminar: ");

		eliminarJB = new JButton("Eliminar");
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

		panelRedesJP = new JPanel();
		panelRedesJP.setPreferredSize(new Dimension(330,20));
		panelRedesJP.setLayout(new GridLayout(1,2));

		panelBotonesAccionJP = new JPanel();
		panelBotonesAccionJP.setPreferredSize(new Dimension(330,25));
		panelBotonesAccionJP.setLayout(new GridLayout(1,2,50,20));

		panelRedesJP.add(redEliminarJL);
		panelRedesJP.add(redesJCB);

		panelBotonesAccionJP.add(eliminarJB);
		panelBotonesAccionJP.add(salirJB);

		add(panelVacioJP0);
		add(panelRedesJP);
		add(panelVacioJP1);
		add(panelBotonesAccionJP);
		add(panelVacioJP2);
	}
}