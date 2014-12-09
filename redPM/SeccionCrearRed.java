import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class SeccionCrearRed extends JPanel{

	private int numeroCapas;
	private int[] numeroNeuronasCapa;

	private String nombreRed;
	private String configuracionTdA;
	private String configuracionFdA;

	private final String tasaAprendizajeAS[] = {"...","TasaAprendizaje / Red","TasaAprendizaje / Capa",
												 "TasaAprendizaje / Neurona"};
	private final String funcionActivacionAS[] = {"...","FuncionActivacion / Red","FuncionActivacion / Capa",
												 "FuncionActivacion / Neurona","FuncionActivacion / SalidaOcultas"};
	private JLabel crearRedJL;
	private JLabel nombreRedJL;
	private JLabel numeroCapasJL;
	private JLabel numeroNeuronasCapaJL;
	private JLabel tasaAprendizajeJL;
	private JLabel funcionActivacionJL;

	private JTextField nombreRedJTF;
	private JTextField numeroCapasJTF;
	private JTextField numeroNeuronasCapaJTF;

	private JComboBox tasaAprendizajeJCB;
	private JComboBox funcionActivacionJCB;

	public SeccionCrearRed(){
		ManejadorCampoTexto manejadorTexto = new ManejadorCampoTexto();
		ManejadorJCombobox manejadorOpciones = new ManejadorJCombobox();

		crearRedJL = new JLabel("Crear Red", SwingConstants.CENTER);
		nombreRedJL = new JLabel("Nombre de red:");
		numeroCapasJL = new JLabel("Numero de capas:");
		numeroNeuronasCapaJL = new JLabel("Numero de neuronas por capa[numC1,numC1,...,numCn]:");
		tasaAprendizajeJL = new JLabel("Tasa de Aprendizaje:");
		funcionActivacionJL = new JLabel("Funcion de Activacion:");


		nombreRedJTF = new JTextField(15);
		numeroCapasJTF = new JTextField(15);
		numeroNeuronasCapaJTF = new JTextField(15);

		tasaAprendizajeJCB = new JComboBox(tasaAprendizajeAS);
		tasaAprendizajeJCB.setPreferredSize(new Dimension(320,25));
		tasaAprendizajeJCB.setMaximumRowCount(3);

		funcionActivacionJCB = new JComboBox(funcionActivacionAS);
		funcionActivacionJCB.setPreferredSize(new Dimension(320,25));
		funcionActivacionJCB.setMaximumRowCount(3);

		nombreRedJTF.addActionListener(manejadorTexto);
		numeroCapasJTF.addActionListener(manejadorTexto);
		numeroNeuronasCapaJTF.addActionListener(manejadorTexto);

		tasaAprendizajeJCB.addItemListener(manejadorOpciones);
		funcionActivacionJCB.addItemListener(manejadorOpciones);

		add(crearRedJL);
		add(nombreRedJL);
		add(nombreRedJTF);
		add(numeroCapasJL);
		add(numeroCapasJTF);
		add(numeroNeuronasCapaJL);
		add(numeroNeuronasCapaJTF);
		add(tasaAprendizajeJL);
		add(tasaAprendizajeJCB);
		add(funcionActivacionJL);
		add(funcionActivacionJCB);
	}

	public void vaciarElementosRed(){
		numeroNeuronasCapa = null;
		nombreRed = null;
		configuracionTdA = null;
		configuracionFdA = null;
	}

	public int[] obtenerArregloNumNeursCapa(){
		return numeroNeuronasCapa;
	}

	public String obtenerNombreRed(){
		return nombreRed;
	}

	public String obtenerConfiguracionTdA(){
		return configuracionTdA;
	}

	public String obtenerconfiguracionFdA(){
		return configuracionFdA;
	}

	private class ManejadorCampoTexto implements ActionListener{
		public void actionPerformed( ActionEvent evento ){
			String cadena = "";
			 if(evento.getSource() == nombreRedJTF){
				cadena = String.format("%s", evento.getActionCommand());
				if(cadena.length() >= 4)
					nombreRed = cadena.toUpperCase();
				else
					JOptionPane.showMessageDialog(null, "El nombre de la red debe tener al menos 4 caracteres.","Dato incorrecto", JOptionPane.ERROR_MESSAGE);
			}
			else if(evento.getSource() == numeroCapasJTF){
				cadena = String.format("%s", evento.getActionCommand());
				try{
					int numCapas = Integer.parseInt(cadena);
					if(numCapas > 0)
						numeroCapas = numCapas;
					else
						JOptionPane.showMessageDialog(null, "El numero de capas debe ser positivo.","Dato incorrecto", JOptionPane.ERROR_MESSAGE);
				}
				catch(Exception excepcion){
					JOptionPane.showMessageDialog(null, "El numero de capas debe ser un numero entero positivo.","Dato incorrecto", JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(evento.getSource() == numeroNeuronasCapaJTF){
				int[] numCapas;
				try{
					cadena = String.format("%s", evento.getActionCommand());
					String[] arregloNumCapas = cadena.split(",");
					numCapas = new int[arregloNumCapas.length];
					for(int i=0;i<arregloNumCapas.length; i++){
						try{
							int numCapa = Integer.parseInt(arregloNumCapas[i]);
							if(numCapa > 0)
								numCapas[i] = numCapa;
							else{
								JOptionPane.showMessageDialog(null, "El numero de neuronas debe ser un numero entero positivo.","Dato incorrecto", JOptionPane.ERROR_MESSAGE);
								break;
							}
						}
						catch(Exception excepcion){
							JOptionPane.showMessageDialog(null, "El numero de neuronas debe ser un numero entero positivo.","Dato incorrecto", JOptionPane.ERROR_MESSAGE);
							break;
						}
					}
					if(numCapas.length == numeroCapas)
						numeroNeuronasCapa = numCapas;
					else
						JOptionPane.showMessageDialog(null, "Debe ingresar un numero de neuronas por cada capa.","Dato incorrecto", JOptionPane.ERROR_MESSAGE);
				}
				catch(Exception excepcion){
					JOptionPane.showMessageDialog(null, "El numero de neuronas debe ser un numero entero positivo.","Dato incorrecto", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}

	private class ManejadorJCombobox implements ItemListener{
		public void itemStateChanged(ItemEvent evento){
			if (evento.getStateChange() == ItemEvent.SELECTED){
				if(evento.getSource() == tasaAprendizajeJCB){
					if(tasaAprendizajeJCB.getSelectedIndex() == 0)
						JOptionPane.showMessageDialog(null, "Debes elegir una configuracion.","Dato incorrecto", JOptionPane.ERROR_MESSAGE);
					else if(tasaAprendizajeJCB.getSelectedIndex() == 1)
						configuracionTdA = "TDA/RED";
				}
				else if(evento.getSource() == funcionActivacionJCB){
					if(funcionActivacionJCB.getSelectedIndex() == 0)
						JOptionPane.showMessageDialog(null, "Debes elegir una configuracion.","Dato incorrecto", JOptionPane.ERROR_MESSAGE);
					else if(funcionActivacionJCB.getSelectedIndex() == 1)
						configuracionFdA = "FDA/RED";
				}
			}
		}
	}
}