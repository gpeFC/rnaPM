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

public class VentanaConfiguracionFdA extends JFrame{

	private JButton aceptarJB;
	private JButton cancelarJB;

	private JRadioButton funcionRedJRB;
	private JRadioButton funcionCapaJRB;
	private JRadioButton funcionNeuronaJRB;
	private JRadioButton funcionOcultasSalidaJRB;

	private ButtonGroup opcionesFuncionBG;

	private JPanel panelVacioJP0;
	private JPanel panelVacioJP1;
	private JPanel panelVacioJP2;
	private JPanel panelBotonesAccionJP;
	private JPanel panelBotonesSeleccionJP;

	public VentanaConfiguracionFdA(){
		super("Configuracion FdA");
		setLayout(new FlowLayout());

		aceptarJB = new JButton("Aceptar");
		cancelarJB = new JButton("Cancelar");

		funcionRedJRB = new JRadioButton("FdA/Red");
		funcionCapaJRB = new JRadioButton("FdA/Capa");
		funcionNeuronaJRB = new JRadioButton("FdA/Neurona");
		funcionOcultasSalidaJRB = new JRadioButton("FdA/OcultasSalida");

		opcionesFuncionBG = new ButtonGroup();
		opcionesFuncionBG.add(funcionRedJRB);
		opcionesFuncionBG.add(funcionCapaJRB);
		opcionesFuncionBG.add(funcionNeuronaJRB);
		opcionesFuncionBG.add(funcionOcultasSalidaJRB);

		panelVacioJP0 = new JPanel();
		panelVacioJP0.setPreferredSize(new Dimension(230,5));

		panelVacioJP1 = new JPanel();
		panelVacioJP1.setPreferredSize(new Dimension(230,5));

		panelVacioJP2 = new JPanel();
		panelVacioJP2.setPreferredSize(new Dimension(230,5));

		panelBotonesAccionJP = new JPanel();
		panelBotonesAccionJP.setPreferredSize(new Dimension(230,25));
		panelBotonesAccionJP.setLayout(new GridLayout(1,2,30,10));

		panelBotonesSeleccionJP = new JPanel();
		panelBotonesSeleccionJP.setLayout(new GridLayout(4,1));
		panelBotonesSeleccionJP.setPreferredSize(new Dimension(220,120));

		panelBotonesAccionJP.add(aceptarJB);
		panelBotonesAccionJP.add(cancelarJB);

		panelBotonesSeleccionJP.add(funcionRedJRB);
		panelBotonesSeleccionJP.add(funcionCapaJRB);
		panelBotonesSeleccionJP.add(funcionNeuronaJRB);
		panelBotonesSeleccionJP.add(funcionOcultasSalidaJRB);
		panelBotonesSeleccionJP.setBorder(BorderFactory.createTitledBorder("Funcion de Activacion"));

		add(panelVacioJP0);
		add(panelBotonesSeleccionJP);
		add(panelVacioJP1);
		add(panelBotonesAccionJP);
		add(panelVacioJP2);
	}
}