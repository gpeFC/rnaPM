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

	private JPanel panelDatosJP;
	private JPanel panelVacioJP;

	public VentanaMaximoEpocasErrorMinimo(){
		super("MaximoEpocas / ErrorMinimo");
		setLayout(new FlowLayout());

		maxEpocasJL = new JLabel("Maximo de epocas: ");
		errorMinimoJL = new JLabel("Error minimo: ");

		aceptarJB = new JButton("Aceptar");

		maxEpocasJTF = new JTextField(15);
		errorMinimoJTF = new JTextField(15);

		panelDatosJP = new JPanel();
		panelDatosJP.setPreferredSize(new Dimension(350,50));
		panelDatosJP.setLayout(new GridLayout(2,2));

		panelVacioJP = new JPanel();
		panelVacioJP.setPreferredSize(new Dimension(350,5));

		panelDatosJP.add(maxEpocasJL);
		panelDatosJP.add(maxEpocasJTF);
		panelDatosJP.add(errorMinimoJL);
		panelDatosJP.add(errorMinimoJTF);

		add(panelDatosJP);
		add(panelVacioJP);
		add(aceptarJB);
	}
}