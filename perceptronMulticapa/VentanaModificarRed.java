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
import javax.swing.BorderFactory;

public class VentanaModificarRed extends JFrame{

	private JLabel redModificarJL;

	private JButton modificarJB;
	private JButton salirJB;

	private JRadioButton nombreRedJRB;
	private JRadioButton configuracionTdAJRB;
	private JRadioButton configuracionFdAJRB;

	private ButtonGroup opcionesModificarBG;

	private JComboBox redesJCB;

	private JPanel panelVacioJP0;
	private JPanel panelVacioJP1;
	private JPanel panelVacioJP2;
	private JPanel panelVacioJP3;
	private JPanel panelRedesJP;
	private JPanel panelBotonesAccionJP;
	private JPanel panelBotonesSeleccionJP;

	public VentanaModificarRed(){
		super("Modificar Red");
		setLayout(new FlowLayout());

		redModificarJL = new JLabel(" Red a modificar: ");

		modificarJB = new JButton("Modificar");
		salirJB = new JButton("Salir");

		nombreRedJRB = new JRadioButton("Nombre/Red");
		configuracionTdAJRB = new JRadioButton("Configuracion/TasaAprendizaje");
		configuracionFdAJRB = new JRadioButton("Configuracion/FuncionActivacion");

		opcionesModificarBG = new ButtonGroup();
		opcionesModificarBG.add(nombreRedJRB);
		opcionesModificarBG.add(configuracionTdAJRB);
		opcionesModificarBG.add(configuracionFdAJRB);

		redesJCB = new JComboBox();
		redesJCB.setPreferredSize(new Dimension(150,20));
		redesJCB.setMaximumRowCount(3);

		panelVacioJP0 = new JPanel();
		panelVacioJP0.setPreferredSize(new Dimension(300,5));

		panelVacioJP1 = new JPanel();
		panelVacioJP1.setPreferredSize(new Dimension(300,5));

		panelVacioJP2 = new JPanel();
		panelVacioJP2.setPreferredSize(new Dimension(300,5));

		panelVacioJP3 = new JPanel();
		panelVacioJP3.setPreferredSize(new Dimension(300,5));

		panelRedesJP = new JPanel();
		panelRedesJP.setPreferredSize(new Dimension(300,20));
		panelRedesJP.setLayout(new GridLayout(1,2));

		panelBotonesAccionJP = new JPanel();
		panelBotonesAccionJP.setPreferredSize(new Dimension(300,25));
		panelBotonesAccionJP.setLayout(new GridLayout(1,2,50,20));

		panelBotonesSeleccionJP = new JPanel();
		panelBotonesSeleccionJP.setLayout(new GridLayout(3,1));
		panelBotonesSeleccionJP.setPreferredSize(new Dimension(300,100));

		panelRedesJP.add(redModificarJL);
		panelRedesJP.add(redesJCB);

		panelBotonesAccionJP.add(modificarJB);
		panelBotonesAccionJP.add(salirJB);

		panelBotonesSeleccionJP.add(nombreRedJRB);
		panelBotonesSeleccionJP.add(configuracionTdAJRB);
		panelBotonesSeleccionJP.add(configuracionFdAJRB);
		panelBotonesSeleccionJP.setBorder(BorderFactory.createTitledBorder("Parametro a modificar"));

		add(panelVacioJP0);
		add(panelRedesJP);
		add(panelVacioJP1);
		add(panelBotonesSeleccionJP);
		add(panelVacioJP2);
		add(panelBotonesAccionJP);
		add(panelVacioJP3);
	}
}