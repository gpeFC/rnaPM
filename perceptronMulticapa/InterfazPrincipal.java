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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class InterfazPrincipal extends JFrame{

	private JLabel logotipoJL;

	private JButton salirJB;
	private JButton continuarJB;

	private JRadioButton crearRedJRB;
	private JRadioButton mostrarRedJRB;
	private JRadioButton aplicarRedJRB;
	private JRadioButton entrenarRedJRB;
	private JRadioButton eliminarRedJRB;
	private JRadioButton modificarRedJRB;

	private ButtonGroup menuOpcionesBG;

	private JPanel panelAreaImagenJP;
	private JPanel panelBotonesAccionJP;
	private JPanel panelBotonesSeleccionJP;

	public InterfazPrincipal(){
		super("Red Neuronal Artificial  <Perceptron Multicapa>");
		setLayout(new FlowLayout());

		Icon icono = new ImageIcon(getClass().getResource("iconopm2.jpg"));
		logotipoJL = new JLabel(icono);

		salirJB = new JButton("Salir");
		salirJB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evento){
				dispose();
			}
		});

		continuarJB = new JButton("Continuar");
		continuarJB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evento){
			}
		});

		crearRedJRB = new JRadioButton("Crear Red", false);
		crearRedJRB.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent evento){
				if (evento.getStateChange() == ItemEvent.SELECTED){
					VentanaCrearRed nuevaRed = new VentanaCrearRed();
					nuevaRed.setSize(270,345);
					nuevaRed.setLocationRelativeTo(null);
					nuevaRed.setResizable(false);
					nuevaRed.setVisible(true);
				}
			}
		});

		mostrarRedJRB = new JRadioButton("Mostrar Red", false);
		mostrarRedJRB.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent evento){
				if (evento.getStateChange() == ItemEvent.SELECTED){
					VentanaMostrarRed mostrarRed = new VentanaMostrarRed();
					mostrarRed.setSize(350,405);
					mostrarRed.setLocationRelativeTo(null);
					mostrarRed.setResizable(false);
					mostrarRed.setVisible(true);
				}
			}
		});

		aplicarRedJRB = new JRadioButton("Aplicar Red", false);
		aplicarRedJRB.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent evento){
				if (evento.getStateChange() == ItemEvent.SELECTED){
					VentanaAplicarRed aplicarRed = new VentanaAplicarRed();
					aplicarRed.setSize(375,445);
					aplicarRed.setLocationRelativeTo(null);
					aplicarRed.setResizable(false);
					aplicarRed.setVisible(true);
				}
			}
		});

		entrenarRedJRB = new JRadioButton("Entrenar Red", false);
		entrenarRedJRB.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent evento){
				if (evento.getStateChange() == ItemEvent.SELECTED){
					VentanaEntrenarRed entrenarRed = new VentanaEntrenarRed();
					entrenarRed.setSize(375,450);
					entrenarRed.setLocationRelativeTo(null);
					entrenarRed.setResizable(false);
					entrenarRed.setVisible(true);
				}
			}
		});

		eliminarRedJRB = new JRadioButton("Eliminar Red", false);
		eliminarRedJRB.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent evento){
				if (evento.getStateChange() == ItemEvent.SELECTED){
					VentanaEliminarRed eliminarRed = new VentanaEliminarRed();
					eliminarRed.setSize(375,115);
					eliminarRed.setLocationRelativeTo(null);
					eliminarRed.setResizable(false);
					eliminarRed.setVisible(true);
				}
			}
		});

		modificarRedJRB = new JRadioButton("Modificar Red", false);
		modificarRedJRB.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent evento){
				if (evento.getStateChange() == ItemEvent.SELECTED){
					VentanaModificarRed modificarRed = new VentanaModificarRed();
					modificarRed.setSize(330,230);
					modificarRed.setLocationRelativeTo(null);
					modificarRed.setResizable(false);
					modificarRed.setVisible(true);
				}
			}
		});

		menuOpcionesBG = new ButtonGroup();
		menuOpcionesBG.add(crearRedJRB);
		menuOpcionesBG.add(mostrarRedJRB);
		menuOpcionesBG.add(aplicarRedJRB);
		menuOpcionesBG.add(entrenarRedJRB);
		menuOpcionesBG.add(eliminarRedJRB);
		menuOpcionesBG.add(modificarRedJRB);

		panelAreaImagenJP = new JPanel();
		panelAreaImagenJP.setLayout(new FlowLayout());
		panelAreaImagenJP.setPreferredSize(new Dimension(350,300));
		
		panelBotonesAccionJP = new JPanel();
		panelBotonesAccionJP.setLayout(new GridLayout(1,2,160,200));
		panelBotonesAccionJP.setPreferredSize(new Dimension(500,30));
		
		panelBotonesSeleccionJP = new JPanel();
		panelBotonesSeleccionJP.setLayout(new GridLayout(6,1));
		panelBotonesSeleccionJP.setPreferredSize(new Dimension(150,300));

		panelAreaImagenJP.add(logotipoJL);

		panelBotonesAccionJP.add(continuarJB);
		panelBotonesAccionJP.add(salirJB);

		panelBotonesSeleccionJP.add(crearRedJRB);
		panelBotonesSeleccionJP.add(mostrarRedJRB);
		panelBotonesSeleccionJP.add(aplicarRedJRB);
		panelBotonesSeleccionJP.add(entrenarRedJRB);
		panelBotonesSeleccionJP.add(eliminarRedJRB);
		panelBotonesSeleccionJP.add(modificarRedJRB);

		add(panelBotonesSeleccionJP);
		add(panelAreaImagenJP);
		add(panelBotonesAccionJP);
	}
}