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
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class VentanaCrearRed extends JFrame{

	private JLabel nombreRedJL;
	private JLabel numeroCapasJL;
	private JLabel tasaApndzjeJL;
	private JLabel funcionActvcnJL;

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

	private JPanel panelNombreRedJP;
	private JPanel panelCapasRedJP;
	private JPanel panelDatosTextoJP;
	private JPanel panelBotonesTasaJP;
	private JPanel panelBotonesAccionJP;
	private JPanel panelBotonesFuncionJP;
	//private JPanel panelAreaBotonesDatosJP;

	public VentanaCrearRed(){
		super("Crear Red");
		setLayout(new FlowLayout());

		nombreRedJL = new JLabel("  Nombre/Red:");
		numeroCapasJL = new JLabel("  Numero/Capas:");
		tasaApndzjeJL = new JLabel("  Tasa de Aprendizaje");
		funcionActvcnJL = new JLabel("  Funcion de Activacion");

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

		panelNombreRedJP = new JPanel();
		panelNombreRedJP.setPreferredSize(new Dimension(250,25));
		panelNombreRedJP.setLayout(new GridLayout(1,2));

		panelCapasRedJP = new JPanel();
		panelCapasRedJP.setPreferredSize(new Dimension(250,25));
		panelCapasRedJP.setLayout(new GridLayout(1,2));

		panelDatosTextoJP = new JPanel();
		panelDatosTextoJP.setPreferredSize(new Dimension(250,50));
		panelDatosTextoJP.setLayout(new BorderLayout());

		panelBotonesTasaJP = new JPanel();
		panelBotonesTasaJP.setPreferredSize(new Dimension(250,100));
		panelBotonesTasaJP.setLayout(new GridLayout(4,1));

		panelBotonesAccionJP = new JPanel();
		panelBotonesAccionJP.setPreferredSize(new Dimension(250,25));
		panelBotonesAccionJP.setLayout(new GridLayout(1,2,70,1));

		panelBotonesFuncionJP = new JPanel();
		panelBotonesFuncionJP.setPreferredSize(new Dimension(250,100));
		panelBotonesFuncionJP.setLayout(new GridLayout(5,1));

		/*
		panelAreaBotonesDatosJP = new JPanel();
		panelAreaBotonesDatosJP.setPreferredSize(new Dimension(150,450));
		panelAreaBotonesDatosJP.setLayout(new FlowLayout());
		*/

		panelNombreRedJP.add(nombreRedJL);
		panelNombreRedJP.add(nombreRedJTF);

		panelCapasRedJP.add(numeroCapasJL);
		panelCapasRedJP.add(numeroCapasJTF);

		panelDatosTextoJP.add(panelNombreRedJP, BorderLayout.NORTH);
		panelDatosTextoJP.add(panelCapasRedJP, BorderLayout.SOUTH);

		panelBotonesTasaJP.add(tasaApndzjeJL);
		panelBotonesTasaJP.add(tdaRedJRB);
		panelBotonesTasaJP.add(tdaCapaJRB);
		panelBotonesTasaJP.add(tdaNeuronaJRB);

		panelBotonesAccionJP.add(crearJB);
		panelBotonesAccionJP.add(salirJB);

		panelBotonesFuncionJP.add(funcionActvcnJL);
		panelBotonesFuncionJP.add(fdaRedJRB);
		panelBotonesFuncionJP.add(fdaCapaJRB);
		panelBotonesFuncionJP.add(fdaNeuronaJRB);
		panelBotonesFuncionJP.add(fdaOcultasSalidaJRB);

		/*
		panelAreaBotonesDatosJP.add(panelDatosTextoJP);
		panelAreaBotonesDatosJP.add(panelBotonesTasaJP);
		panelAreaBotonesDatosJP.add(panelBotonesFuncionJP);
		*/

		add(panelDatosTextoJP);
		add(panelBotonesTasaJP);
		add(panelBotonesFuncionJP);
		add(panelBotonesAccionJP);
	}
}