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

	private int[] numeroNeuronasCapa = null;
	private int [][] indiceFuncionActivacion = null;
	private String nombreRed = null;
	private String configuracionTasaAprendizaje = null;
	private String configuracionFuncionActivacion = null;

	private final String[] tasaAprendizajeAS = {"","TasaAprendizaje/Red","TasaAprendizaje/Capa",
												 "TasaAprendizaje/Neurona"};
	private final String[] funcionActivacionAS = {"","FuncionActivacion/Red","FuncionActivacion/Capa",
												 "FuncionActivacion/Neurona","FuncionActivacion/SalidaOcultas"};
	private JLabel crearRedJL;
	private JLabel nombreRedJL;
	private JLabel neuronasCapaJL;
	private JLabel tasaAprendizajeJL;
	private JLabel funcionActivacionJL;

	private JTextField nombreRedJTF;
	private JTextField neuronasCapaJTF;

	private JComboBox tasaAprendizajeJCB;
	private JComboBox funcionActivacionJCB;

	private ManejadorEventosActionListener manejadorTexto;
	private ManejadorEventosItemListener manejadorOpciones;

	public SeccionCrearRed(){
		manejadorTexto = new ManejadorEventosActionListener();
		manejadorOpciones = new ManejadorEventosItemListener();

		crearRedJL = new JLabel("Crear Red", SwingConstants.CENTER);
		nombreRedJL = new JLabel("Nombre de red:");
		neuronasCapaJL = new JLabel("Numero de neuronas por capa:");
		tasaAprendizajeJL = new JLabel("Tasa de Aprendizaje:");
		funcionActivacionJL = new JLabel("Funcion de Activacion:");

		nombreRedJTF = new JTextField("",15);
		neuronasCapaJTF = new JTextField("",15);

		tasaAprendizajeJCB = new JComboBox(tasaAprendizajeAS);
		tasaAprendizajeJCB.setPreferredSize(new Dimension(320,25));
		tasaAprendizajeJCB.setMaximumRowCount(3);

		funcionActivacionJCB = new JComboBox(funcionActivacionAS);
		funcionActivacionJCB.setPreferredSize(new Dimension(320,25));
		funcionActivacionJCB.setMaximumRowCount(3);

		nombreRedJTF.addActionListener(manejadorTexto);
		neuronasCapaJTF.addActionListener(manejadorTexto);

		tasaAprendizajeJCB.addItemListener(manejadorOpciones);
		funcionActivacionJCB.addItemListener(manejadorOpciones);

		add(crearRedJL);
		add(nombreRedJL);
		add(nombreRedJTF);
		add(neuronasCapaJL);
		add(neuronasCapaJTF);
		add(tasaAprendizajeJL);
		add(tasaAprendizajeJCB);
		add(funcionActivacionJL);
		add(funcionActivacionJCB);
	}

	public void borrarDatosReiniciarConfiguracion(){
		this.numeroNeuronasCapa = null;
		this.indiceFuncionActivacion = null;
		this.nombreRed = null;
		this.configuracionTasaAprendizaje = null;
		this.configuracionFuncionActivacion = null;
		nombreRedJTF.setText("");
		neuronasCapaJTF.setText("");
		//tasaAprendizajeJCB.setSelectedIndex(0);
		//funcionActivacionJCB.setSelectedIndex(0);
	}

	public int[] obtenerNumeroNeuronasCapa(){
		return numeroNeuronasCapa;
	}

	public String obtenerNombreRed(){
		return nombreRed;
	}

	public String obtenerConfiguracionTasaAprendizaje(){
		return configuracionTasaAprendizaje;
	}

	public String obtenerConfiguracionFuncionActivacion(){
		return configuracionFuncionActivacion;
	}

	private class ManejadorEventosActionListener implements ActionListener{
		public void actionPerformed(ActionEvent evento){
			String cadena = "";
			 if(evento.getSource() == nombreRedJTF){
				cadena = String.format("%s", evento.getActionCommand());
				if(cadena.length() >= 4)
					nombreRed = cadena.toUpperCase();
				else
					JOptionPane.showMessageDialog(null, "El nombre de la red debe tener al menos 4 caracteres.","Dato incorrecto(Error nombre)", JOptionPane.ERROR_MESSAGE);
			}
			else if(evento.getSource() == neuronasCapaJTF){
				int[] arregloNumCapasAi;
				cadena = String.format("%s", evento.getActionCommand());
				try{
					String[] arregloNumCapasAS = cadena.split(",");
					arregloNumCapasAi = new int[arregloNumCapasAS.length];
					for(int i=0;i<arregloNumCapasAS.length; i++){
						try{
							int numCapa = Integer.parseInt(arregloNumCapasAS[i]);
							if(numCapa > 0)
								arregloNumCapasAi[i] = numCapa;
							else{
								JOptionPane.showMessageDialog(null, "El numero de neuronas por capa debe ser un numero entero positivo.","Dato incorrecto(Numero negativo)", JOptionPane.ERROR_MESSAGE);
								break;
							}
						}
						catch(Exception excepcion){
							JOptionPane.showMessageDialog(null, "El numero de neuronas por capa debe ser un numero entero positivo.","Dato incorrecto(Error parseo)", JOptionPane.ERROR_MESSAGE);
							break;
						}
					}
					numeroNeuronasCapa = arregloNumCapasAi;
				}
				catch(Exception excepcion){
					JOptionPane.showMessageDialog(null, "Debes separar por comas(,) cada numero de neuronas de cada capa.","Sintaxis incorrecta(Error config neurs capa)", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}

	private class ManejadorEventosItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent evento){
			if (evento.getStateChange() == ItemEvent.SELECTED){
				if(evento.getSource() == tasaAprendizajeJCB){
					if(tasaAprendizajeJCB.getSelectedIndex() == 0)
						JOptionPane.showMessageDialog(null, "Debes elegir una configuracion.","Configuracion incorrecta(TdA)", JOptionPane.ERROR_MESSAGE);
					else
						configuracionTasaAprendizaje = tasaAprendizajeAS[tasaAprendizajeJCB.getSelectedIndex()];
				}
				else if(evento.getSource() == funcionActivacionJCB){
					if(funcionActivacionJCB.getSelectedIndex() == 0)
						JOptionPane.showMessageDialog(null, "Debes elegir una configuracion.","Configuracion incorrecta(FdA)", JOptionPane.ERROR_MESSAGE);
					else{
						configuracionFuncionActivacion = funcionActivacionAS[funcionActivacionJCB.getSelectedIndex()];
						if(funcionActivacionJCB.getSelectedIndex() == 1){
							while(true){
								String alphaRed = JOptionPane.showInputDialog("Escribe el indice numerico de la funcion elegida:\n1) Identidad Lineal \n2) Sigmoide Logistico \n3) Sigmoide Tangencial \n4) Sigmoide Hiperbolico");
								try{
									int funcionRed = Integer.parseInt(alphaRed);
									if(funcionRed < 1 || funcionRed > 4)
										JOptionPane.showMessageDialog(null, "El indice numerico debe estar en el rango [1-4].","Dato incorrecto", JOptionPane.ERROR_MESSAGE);
									else{
										indiceFuncionActivacion = new int[numeroNeuronasCapa.length][];
										for(int i=0; i<indiceFuncionActivacion.length; i++){
											indiceFuncionActivacion[i] = new int[numeroNeuronasCapa[i]];
											for(int j=0; j<numeroNeuronasCapa[i]; j++)
												indiceFuncionActivacion[i][j] = funcionRed;
										}
										break;
									}
								}
								catch(Exception excepcion){
									JOptionPane.showMessageDialog(null, "El dato ingresado no es correcto.","Dato incorrecto", JOptionPane.ERROR_MESSAGE);
								}
							}
						}
					}
				}
			}
		}
	}
}