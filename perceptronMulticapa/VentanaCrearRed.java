/******************************************************************************
 * UAEM, Facultad de Ciencias
 * Seminario de Programacion II
 * Emanuel GP
 *
 * Proyecto: Red Neuronal Artificial: Perceptron Multicapa con Retropropagacion
 ******************************************************************************/

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class VentanaCrearRed extends JFrame{

	private JLabel nombreRedJL;
	private JLabel numeroCapasJL;

	private JButton crearJB;
	private JButton salirJB;

	private JRadioButton tdaRedJRB;
	private JRadioButton tdaCapaJRB;
	private JRadioButton tdaNeuronaJRB;
	private JRadioButton fdaRedJRB;
	private JRadioButton fdaCapaJRB;
	private JRadioButton fdaNeuronaJRB;
	private JRadioButton fdaOcultasSalidaJRB;

	private ButtonGroup tsaOpcionesBG;
	private ButtonGroup fdaOpcionesBG;

	private JTextField nombreRedJTF;
	private JTextField numeroCapasJTF;

	private JPanel panelVacioJP0;
	private JPanel panelVacioJP1;
	private JPanel panelVacioJP2;
	private JPanel panelVacioJP3;
	private JPanel panelDatosTextoJP;
	private JPanel panelBotonesTasaJP;
	private JPanel panelBotonesAccionJP;
	private JPanel panelBotonesFuncionJP;

	public VentanaCrearRed(){
		super("Crear Red");
		setLayout(new FlowLayout());

		nombreRedJL = new JLabel("  Nombre/Red:");
		numeroCapasJL = new JLabel("  Numero/Capas:");

		crearJB = new JButton("Crear");
		salirJB = new JButton("Salir");

		tdaRedJRB = new JRadioButton("TdA/Red", false);
		tdaCapaJRB = new JRadioButton("Tda/Capa", false);
		tdaNeuronaJRB = new JRadioButton("TdA/Neurona", false);

		tsaOpcionesBG = new ButtonGroup();
		tsaOpcionesBG.add(tdaRedJRB);
		tsaOpcionesBG.add(tdaCapaJRB);
		tsaOpcionesBG.add(tdaNeuronaJRB);

		fdaRedJRB = new JRadioButton("FdA/Red", false);
		fdaCapaJRB = new JRadioButton("FdA/Capa", false);
		fdaNeuronaJRB = new JRadioButton("FdA/Neurona", false);
		fdaOcultasSalidaJRB = new JRadioButton("Fda/OcultasSalida", false);

		fdaOpcionesBG = new ButtonGroup();
		fdaOpcionesBG.add(fdaRedJRB);
		fdaOpcionesBG.add(fdaCapaJRB);
		fdaOpcionesBG.add(fdaNeuronaJRB);
		fdaOpcionesBG.add(fdaOcultasSalidaJRB);

		nombreRedJTF = new JTextField();
		numeroCapasJTF = new JTextField();

		panelVacioJP0 = new JPanel();
		panelVacioJP0.setPreferredSize(new Dimension(250,5));

		panelVacioJP1 = new JPanel();
		panelVacioJP1.setPreferredSize(new Dimension(250,5));

		panelVacioJP2 = new JPanel();
		panelVacioJP2.setPreferredSize(new Dimension(250,5));

		panelVacioJP3 = new JPanel();
		panelVacioJP3.setPreferredSize(new Dimension(250,5));

		panelDatosTextoJP = new JPanel();
		panelDatosTextoJP.setPreferredSize(new Dimension(250,50));
		panelDatosTextoJP.setLayout(new GridLayout(2,2,5,2));

		panelBotonesTasaJP = new JPanel();
		panelBotonesTasaJP.setPreferredSize(new Dimension(250,80));
		panelBotonesTasaJP.setLayout(new GridLayout(3,1));

		panelBotonesAccionJP = new JPanel();
		panelBotonesAccionJP.setPreferredSize(new Dimension(250,25));
		panelBotonesAccionJP.setLayout(new GridLayout(1,2,70,1));

		panelBotonesFuncionJP = new JPanel();
		panelBotonesFuncionJP.setPreferredSize(new Dimension(250,90));
		panelBotonesFuncionJP.setLayout(new GridLayout(4,1));

		panelDatosTextoJP.add(nombreRedJL);
		panelDatosTextoJP.add(nombreRedJTF);
		panelDatosTextoJP.add(numeroCapasJL);
		panelDatosTextoJP.add(numeroCapasJTF);

		panelBotonesTasaJP.add(tdaRedJRB);
		panelBotonesTasaJP.add(tdaCapaJRB);
		panelBotonesTasaJP.add(tdaNeuronaJRB);
		panelBotonesTasaJP.setBorder(BorderFactory.createTitledBorder("Tasa de Aprendizaje"));

		panelBotonesAccionJP.add(crearJB);
		panelBotonesAccionJP.add(salirJB);

		panelBotonesFuncionJP.add(fdaRedJRB);
		panelBotonesFuncionJP.add(fdaCapaJRB);
		panelBotonesFuncionJP.add(fdaNeuronaJRB);
		panelBotonesFuncionJP.add(fdaOcultasSalidaJRB);
		panelBotonesFuncionJP.setBorder(BorderFactory.createTitledBorder("Funcion de Activacion"));

		add(panelVacioJP0);
		add(panelDatosTextoJP);
		add(panelVacioJP1);
		add(panelBotonesTasaJP);
		add(panelVacioJP2);
		add(panelBotonesFuncionJP);
		add(panelVacioJP3);
		add(panelBotonesAccionJP);
	}
}