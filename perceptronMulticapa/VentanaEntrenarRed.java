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
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;

public class VentanaEntrenarRed extends JFrame{

	private JLabel redEntrenarJL;

	private JButton entrenarJB;
	private JButton salirJB;

	private JRadioButton maxEpocasJRB;
	private JRadioButton minErrorMaxEpocasJRB;
	private JRadioButton retropropagacionJRB;
	private JRadioButton retropropagacionMomentoJRB;

	private ButtonGroup opcionesAltoBG;
	private ButtonGroup opcionesAlgoritmoBG;

	private JComboBox redesJCB;

	private JTextArea datosEntrenarJTA;

	private JPanel panelVacioJP0;
	private JPanel panelVacioJP1;
	private JPanel panelVacioJP2;
	private JPanel panelVacioJP3;
	private JPanel panelVacioJP4;
	private JPanel panelVacioJP5;
	private JPanel panelRedesJP;
	private JPanel panelEntrenamientoJP;
	private JPanel panelBotonesSeleccionAltoJP;
	private JPanel panelBotonesSeleccionAlgoritmoJP;
	private JPanel panelBotonesAccionJP;

	public VentanaEntrenarRed(){
		super("Entrenar Red");
		setLayout(new FlowLayout());

		redEntrenarJL = new JLabel(" Red a entrenar: ");

		entrenarJB = new JButton("Entrenar");
		salirJB = new JButton("Salir");

		maxEpocasJRB = new JRadioButton("Epocas de entrenamiento");
		minErrorMaxEpocasJRB = new JRadioButton("EpocasEntrenamiento / ErrorMinimo");

		retropropagacionJRB = new JRadioButton("Algoritmo Retropropagacion");
		retropropagacionMomentoJRB = new JRadioButton("Algoritmo Retropropagacion/Momento");

		opcionesAltoBG = new ButtonGroup();
		opcionesAltoBG.add(maxEpocasJRB);
		opcionesAltoBG.add(minErrorMaxEpocasJRB);

		opcionesAlgoritmoBG = new ButtonGroup();
		opcionesAlgoritmoBG.add(retropropagacionJRB);
		opcionesAlgoritmoBG.add(retropropagacionMomentoJRB);

		redesJCB = new JComboBox();
		redesJCB.setPreferredSize(new Dimension(150,20));
		redesJCB.setMaximumRowCount(3);

		datosEntrenarJTA = new JTextArea(8,30);

		panelVacioJP0 = new JPanel();
		panelVacioJP0.setPreferredSize(new Dimension(250,5));

		panelVacioJP1 = new JPanel();
		panelVacioJP1.setPreferredSize(new Dimension(250,5));

		panelVacioJP2 = new JPanel();
		panelVacioJP2.setPreferredSize(new Dimension(250,5));

		panelVacioJP3 = new JPanel();
		panelVacioJP3.setPreferredSize(new Dimension(250,5));

		panelVacioJP4 = new JPanel();
		panelVacioJP4.setPreferredSize(new Dimension(250,5));

		panelVacioJP5 = new JPanel();
		panelVacioJP5.setPreferredSize(new Dimension(250,5));

		panelRedesJP = new JPanel();
		panelRedesJP.setPreferredSize(new Dimension(350,20));
		panelRedesJP.setLayout(new GridLayout(1,2));

		panelEntrenamientoJP = new JPanel();
		panelEntrenamientoJP.setPreferredSize(new Dimension(350,150));

		panelBotonesSeleccionAltoJP = new JPanel();
		panelBotonesSeleccionAltoJP.setLayout(new GridLayout(2,1));
		panelBotonesSeleccionAltoJP.setPreferredSize(new Dimension(350,70));

		panelBotonesSeleccionAlgoritmoJP = new JPanel();
		panelBotonesSeleccionAlgoritmoJP.setLayout(new GridLayout(2,1));
		panelBotonesSeleccionAlgoritmoJP.setPreferredSize(new Dimension(350,70));
		
		panelBotonesAccionJP = new JPanel();
		panelBotonesAccionJP.setPreferredSize(new Dimension(350,25));
		panelBotonesAccionJP.setLayout(new GridLayout(1,2,100,1));

		panelEntrenamientoJP.add(datosEntrenarJTA);
		panelEntrenamientoJP.setBorder(BorderFactory.createTitledBorder("Patrones de Entrenamiento"));

		panelRedesJP.add(redEntrenarJL);
		panelRedesJP.add(redesJCB);

		panelBotonesSeleccionAltoJP.add(maxEpocasJRB);
		panelBotonesSeleccionAltoJP.add(minErrorMaxEpocasJRB);
		panelBotonesSeleccionAltoJP.setBorder(BorderFactory.createTitledBorder("Condicion de alto del entrenamiento"));

		panelBotonesSeleccionAlgoritmoJP.add(retropropagacionJRB);
		panelBotonesSeleccionAlgoritmoJP.add(retropropagacionMomentoJRB);
		panelBotonesSeleccionAlgoritmoJP.setBorder(BorderFactory.createTitledBorder("Algoritmo de entrenamiento"));

		panelBotonesAccionJP.add(entrenarJB);
		panelBotonesAccionJP.add(salirJB);

		add(panelVacioJP0);
		add(panelRedesJP);
		add(panelVacioJP1);
		add(panelEntrenamientoJP);
		add(panelVacioJP2);
		add(panelBotonesSeleccionAltoJP);
		add(panelVacioJP3);
		add(panelBotonesSeleccionAlgoritmoJP);
		add(panelVacioJP4);
		add(panelBotonesAccionJP);
		add(panelVacioJP5);
	}
}