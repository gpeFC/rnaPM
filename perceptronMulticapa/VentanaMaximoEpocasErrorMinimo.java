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

public class VentanaMaximoEpocasErrorMinimo extends JFrame{

	private JLabel maxEpocasJL;
	private JLabel errorMinimoJL;

	private JButton aceptarJB;

	private JTextField maxEpocasJTF;
	private JTextField errorMinimoJTF;

	private JPanel panelVacioJP0;
	private JPanel panelVacioJP1;
	private JPanel panelVacioJP2;
	private JPanel panelDatosJP;

	public VentanaMaximoEpocasErrorMinimo(){
		super("MaximoEpocas / ErrorMinimo");
		setLayout(new FlowLayout());

		maxEpocasJL = new JLabel("Maximo de epocas: ");
		errorMinimoJL = new JLabel("Error minimo: ");

		aceptarJB = new JButton("Aceptar");

		maxEpocasJTF = new JTextField(15);
		errorMinimoJTF = new JTextField(15);

		panelVacioJP0 = new JPanel();
		panelVacioJP0.setPreferredSize(new Dimension(350,5));

		panelVacioJP1 = new JPanel();
		panelVacioJP1.setPreferredSize(new Dimension(350,5));

		panelVacioJP2 = new JPanel();
		panelVacioJP2.setPreferredSize(new Dimension(350,5));

		panelDatosJP = new JPanel();
		panelDatosJP.setPreferredSize(new Dimension(350,50));
		panelDatosJP.setLayout(new GridLayout(2,2,5,2));

		panelDatosJP.add(maxEpocasJL);
		panelDatosJP.add(maxEpocasJTF);
		panelDatosJP.add(errorMinimoJL);
		panelDatosJP.add(errorMinimoJTF);

		add(panelVacioJP0);
		add(panelDatosJP);
		add(panelVacioJP1);
		add(aceptarJB);
		add(panelVacioJP2);
	}
}