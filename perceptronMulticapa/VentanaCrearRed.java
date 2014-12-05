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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import java.util.InputMismatchException;

public class VentanaCrearRed extends JFrame{

	private int[] numNeursCapa;
	private RedNeuronal rnapm;

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

		ManejadorAL manejador1 = new ManejadorAL();

		this.rnapm = new RedNeuronal("","","");

		nombreRedJL = new JLabel("  Nombre/Red:");
		numeroCapasJL = new JLabel("  Numero/Capas:");

		crearJB = new JButton("Crear");
		crearJB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evento){
				JOptionPane.showMessageDialog(VentanaCrearRed.this, String.format(
						"Usted oprimio: %s", evento.getActionCommand()));
			}
		});

		salirJB = new JButton("Salir");
		salirJB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evento){
				dispose();
			}
		});

		tdaRedJRB = new JRadioButton("TdA/Red", false);
		tdaRedJRB.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent evento){
				if (evento.getStateChange() == ItemEvent.SELECTED){
				}
			}
		});

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
		nombreRedJTF.addActionListener(manejador1);

		numeroCapasJTF = new JTextField();
		numeroCapasJTF.addActionListener(manejador1);

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

	private class ManejadorAL implements ActionListener{
		public void actionPerformed(ActionEvent evento){
			if(evento.getSource() == nombreRedJTF){
				String cadena = String.format("%s", evento.getActionCommand());
				if(cadena.length() >= 4)
					rnapm.establecerNombreRed(cadena);
				else
					JOptionPane.showMessageDialog(VentanaCrearRed.this, String.format(
						"El nombre debe ser de al menos 4 caracteres."));
			}
			else if(evento.getSource() == numeroCapasJTF){
				String cadena = String.format("%s", evento.getActionCommand());
				try{
					int numero = Integer.parseInt(cadena);
					numNeursCapa = new int[numero];
					for(int i=0;i<numero;i++){
						int numNeuronas = 0;
						if(i == numero-1){
							do{
								try{
									while(numNeuronas < 1 || cadena.equals("")){
										cadena = JOptionPane.showInputDialog("Num/Neuronas-CapaSalida:");
										try{
											numNeuronas = Integer.parseInt(cadena);
											numNeursCapa[i] = numNeuronas;
										}
										catch(InputMismatchException excepcion){
											cadena = "";
										}
									}
									break;
								}
								catch(InputMismatchException excepcion){}
							}while(true);
						}
						else{
							do{
								try{
									while(numNeuronas < 1 || cadena.equals("")){
										cadena = JOptionPane.showInputDialog("Num/Neuronas-CapaOculta["+(i+1)+"]:");
										try{
											numNeuronas = Integer.parseInt(cadena);
											numNeursCapa[i] = numNeuronas;
										}
										catch(InputMismatchException excepcion){
											cadena = "";
										}
									}
									break;
								}
								catch(InputMismatchException excepcion){}
							}while(true);
						}
					}
				}
				catch(InputMismatchException excepcion){
					cadena = "";
					JOptionPane.showMessageDialog(VentanaCrearRed.this, String.format(
						"Dato invalido."));
				}
			}
		}
	}

	private class ManejadorIL implements ItemListener{
		String cadena;
		public ManejadorIL(String cad){
			cadena = cad;
		}
		public void itemStateChanged(ItemEvent evento){
			
		}
	}
}