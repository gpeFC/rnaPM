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
import javax.swing.JTextField;
import javax.swing.JLabel;

public class VentanaMaximoEpocas extends JFrame{

	private JLabel maxEpocasJL;

	private JButton aceptarJB;

	private JTextField maxEpocasJTF;

	private JPanel panelVacioJP0;
	private JPanel panelVacioJP1;
	private JPanel panelVacioJP2;
	private JPanel panelDatosJP;

	public VentanaMaximoEpocas(){
		super("Maximo de Epocas");
		setLayout(new FlowLayout());

		maxEpocasJL = new JLabel("Maximo de epocas: ");

		aceptarJB = new JButton("Aceptar");

		maxEpocasJTF = new JTextField(15);

		panelDatosJP = new JPanel();
		panelDatosJP.setPreferredSize(new Dimension(350,25));
		panelDatosJP.setLayout(new GridLayout(1,2));

		panelVacioJP0 = new JPanel();
		panelVacioJP0.setPreferredSize(new Dimension(350,5));

		panelVacioJP1 = new JPanel();
		panelVacioJP1.setPreferredSize(new Dimension(350,5));

		panelVacioJP2 = new JPanel();
		panelVacioJP2.setPreferredSize(new Dimension(350,5));

		panelDatosJP.add(maxEpocasJL);
		panelDatosJP.add(maxEpocasJTF);

		add(panelVacioJP0);
		add(panelDatosJP);
		add(panelVacioJP1);
		add(aceptarJB);
		add(panelVacioJP2);
	}
}