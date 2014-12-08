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

public class VentanaConfiguracionTdA extends JFrame{

	private JButton aceptarJB;
	private JButton cancelarJB;

	private JRadioButton tasaRedJRB;
	private JRadioButton tasaCapaJRB;
	private JRadioButton tasaNeuronaJRB;

	private ButtonGroup opcionesTasaBG;

	private JPanel panelVacioJP0;
	private JPanel panelVacioJP1;
	private JPanel panelVacioJP2;
	private JPanel panelBotonesAccionJP;
	private JPanel panelBotonesSeleccionJP;

	public VentanaConfiguracionTdA(){
		super("Configuracion TdA");
		setLayout(new FlowLayout());

		aceptarJB = new JButton("Aceptar");
		cancelarJB = new JButton("Cancelar");

		tasaRedJRB = new JRadioButton("TdA/Red");
		tasaCapaJRB = new JRadioButton("TdA/Capa");
		tasaNeuronaJRB = new JRadioButton("TdA/Neurona");

		opcionesTasaBG = new ButtonGroup();
		opcionesTasaBG.add(tasaRedJRB);
		opcionesTasaBG.add(tasaCapaJRB);
		opcionesTasaBG.add(tasaNeuronaJRB);

		panelVacioJP0 = new JPanel();
		panelVacioJP0.setPreferredSize(new Dimension(230,5));

		panelVacioJP1 = new JPanel();
		panelVacioJP1.setPreferredSize(new Dimension(230,5));

		panelVacioJP2 = new JPanel();
		panelVacioJP2.setPreferredSize(new Dimension(230,5));

		panelBotonesAccionJP = new JPanel();
		panelBotonesAccionJP.setPreferredSize(new Dimension(230,25));
		panelBotonesAccionJP.setLayout(new GridLayout(1,2,30,20));

		panelBotonesSeleccionJP = new JPanel();
		panelBotonesSeleccionJP.setLayout(new GridLayout(3,1));
		panelBotonesSeleccionJP.setPreferredSize(new Dimension(220,100));

		panelBotonesAccionJP.add(aceptarJB);
		panelBotonesAccionJP.add(cancelarJB);

		panelBotonesSeleccionJP.add(tasaRedJRB);
		panelBotonesSeleccionJP.add(tasaCapaJRB);
		panelBotonesSeleccionJP.add(tasaNeuronaJRB);
		panelBotonesSeleccionJP.setBorder(BorderFactory.createTitledBorder("Tasa de Aprendizaje"));

		add(panelVacioJP0);
		add(panelBotonesSeleccionJP);
		add(panelVacioJP1);
		add(panelBotonesAccionJP);
		add(panelVacioJP2);
	}
}