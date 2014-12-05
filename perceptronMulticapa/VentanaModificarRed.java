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
	private JLabel modificarParametroJL;

	private JButton modificarJB;
	private JButton salirJB;

	private JRadioButton nombreRedJRB;
	private JRadioButton configuracionTdAJRB;
	private JRadioButton configuracionFdAJRB;

	private ButtonGroup opcionesModificarBG;

	private JComboBox redesJCB;

	private JPanel panelBotonesAccionJP;
	private JPanel panelBotonesSeleccionJP;

	public VentanaModificarRed(){
		super("Modificar Red");
		setLayout(new FlowLayout());

		redModificarJL = new JLabel("Red a modificar: ");
		modificarParametroJL = new JLabel("Parametro a modificar");

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

		panelBotonesAccionJP = new JPanel();
		panelBotonesAccionJP.setPreferredSize(new Dimension(280,25));
		panelBotonesAccionJP.setLayout(new GridLayout(1,2,70,20));

		panelBotonesSeleccionJP = new JPanel();
		panelBotonesSeleccionJP.setLayout(new GridLayout(4,1));
		panelBotonesSeleccionJP.setPreferredSize(new Dimension(270,100));

		panelBotonesAccionJP.add(modificarJB);
		panelBotonesAccionJP.add(salirJB);

		panelBotonesSeleccionJP.add(modificarParametroJL);
		panelBotonesSeleccionJP.add(nombreRedJRB);
		panelBotonesSeleccionJP.add(configuracionTdAJRB);
		panelBotonesSeleccionJP.add(configuracionFdAJRB);

		add(redModificarJL);
		add(redesJCB);
		add(panelBotonesSeleccionJP);
		add(panelBotonesAccionJP);
	}
}