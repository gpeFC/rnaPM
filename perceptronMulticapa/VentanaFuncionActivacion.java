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

public class VentanaFuncionActivacion extends JFrame{

	private JLabel configuracionJL;

	private JButton aceptarJB;

	private JPanel panelVacioJP0;
	private JPanel panelVacioJP1;
	private JPanel panelVacioJP2;
	private JPanel panelConfigFncnActvcnJP;

	public VentanaFuncionActivacion(){
		super("Funcion de Activacion");
		setLayout(new FlowLayout());

		configuracionJL = new JLabel("Establecer configuracion");

		aceptarJB = new JButton("Aceptar");

		panelVacioJP0 = new JPanel();
		panelVacioJP0.setPreferredSize(new Dimension(250,5));

		panelVacioJP1 = new JPanel();
		panelVacioJP1.setPreferredSize(new Dimension(250,5));

		panelVacioJP2 = new JPanel();
		panelVacioJP2.setPreferredSize(new Dimension(250,5));

		panelConfigFncnActvcnJP = new JPanel();
		panelConfigFncnActvcnJP.setPreferredSize(new Dimension(250,160));

		add(panelVacioJP0);
		add(configuracionJL);
		add(new JScrollPane(panelConfigFncnActvcnJP));
		add(panelVacioJP1);
		add(aceptarJB);
		add(panelVacioJP2);
	}
}