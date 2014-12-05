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
import javax.swing.BorderFactory;

public class VentanaEliminarRed extends JFrame{

	private JLabel redEliminarJL;

	private JButton eliminarJB;
	private JButton salirJB;

	private JComboBox redesJCB;

	private JPanel panelVacioJP;
	private JPanel panelBotonesAccionJP;

	public VentanaEliminarRed(){
		super("Eliminar Red");
		setLayout(new FlowLayout());

		redEliminarJL = new JLabel("Red a eliminar: ");

		eliminarJB = new JButton("Eliminar");
		salirJB = new JButton("Salir");

		redesJCB = new JComboBox();
		redesJCB.setPreferredSize(new Dimension(150,20));
		redesJCB.setMaximumRowCount(3);

		panelVacioJP = new JPanel();
		panelVacioJP.setPreferredSize(new Dimension(350,10));

		panelBotonesAccionJP = new JPanel();
		panelBotonesAccionJP.setPreferredSize(new Dimension(350,25));
		panelBotonesAccionJP.setLayout(new GridLayout(1,2,70,20));

		panelBotonesAccionJP.add(eliminarJB);
		panelBotonesAccionJP.add(salirJB);

		add(redEliminarJL);
		add(redesJCB);
		add(panelVacioJP);
		add(panelBotonesAccionJP);
	}
}