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
	private JLabel opcionAltoJL;
	private JLabel opcionAlgoritmoJL;

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

	private JPanel panelEntrenamientoJP;
	private JPanel panelBotonesSeleccionAltoJP;
	private JPanel panelBotonesSeleccionAlgoritmoJP;
	private JPanel panelBotonesAccionJP;

	public VentanaEntrenarRed(){
		super("Entrenar Red");
		setLayout(new FlowLayout());

		redEntrenarJL = new JLabel("Red a entrenar: ");
		opcionAltoJL = new JLabel("Condicion de alto del entrenamiento");
		opcionAlgoritmoJL = new JLabel("Algoritmo de entrenamiento");

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

		panelEntrenamientoJP = new JPanel();
		panelEntrenamientoJP.setPreferredSize(new Dimension(350,150));

		panelBotonesSeleccionAltoJP = new JPanel();
		panelBotonesSeleccionAltoJP.setLayout(new GridLayout(3,1));
		panelBotonesSeleccionAltoJP.setPreferredSize(new Dimension(350,70));

		panelBotonesSeleccionAlgoritmoJP = new JPanel();
		panelBotonesSeleccionAlgoritmoJP.setLayout(new GridLayout(3,1));
		panelBotonesSeleccionAlgoritmoJP.setPreferredSize(new Dimension(350,70));
		
		panelBotonesAccionJP = new JPanel();
		panelBotonesAccionJP.setPreferredSize(new Dimension(350,25));
		panelBotonesAccionJP.setLayout(new GridLayout(1,2,100,1));

		panelEntrenamientoJP.add(datosEntrenarJTA);
		panelEntrenamientoJP.setBorder(BorderFactory.createTitledBorder("Patrones de Entrenamiento"));

		panelBotonesSeleccionAltoJP.add(opcionAltoJL);
		panelBotonesSeleccionAltoJP.add(maxEpocasJRB);
		panelBotonesSeleccionAltoJP.add(minErrorMaxEpocasJRB);

		panelBotonesSeleccionAlgoritmoJP.add(opcionAlgoritmoJL);
		panelBotonesSeleccionAlgoritmoJP.add(retropropagacionJRB);
		panelBotonesSeleccionAlgoritmoJP.add(retropropagacionMomentoJRB);

		panelBotonesAccionJP.add(entrenarJB);
		panelBotonesAccionJP.add(salirJB);

		add(redEntrenarJL);
		add(redesJCB);
		add(panelEntrenamientoJP);
		add(panelBotonesSeleccionAltoJP);
		add(panelBotonesSeleccionAlgoritmoJP);
		add(panelBotonesAccionJP);
	}
}