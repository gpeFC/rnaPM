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

	private JPanel panelDatosJP;
	private JPanel panelVacioJP;

	public VentanaMaximoEpocas(){
		super("Maximo de Epocas");
		setLayout(new FlowLayout());

		maxEpocasJL = new JLabel("Maximo de epocas: ");

		aceptarJB = new JButton("Aceptar");

		maxEpocasJTF = new JTextField(15);

		panelDatosJP = new JPanel();
		panelDatosJP.setPreferredSize(new Dimension(350,25));
		panelDatosJP.setLayout(new GridLayout(1,2));

		panelVacioJP = new JPanel();
		panelVacioJP.setPreferredSize(new Dimension(350,5));

		panelDatosJP.add(maxEpocasJL);
		panelDatosJP.add(maxEpocasJTF);

		add(panelDatosJP);
		add(panelVacioJP);
		add(aceptarJB);
	}
}