import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class InterfazSecciones extends JFrame{

	int opcion=0, numCapas=0, numPatrones=0, numArgumentos=0, red;
	int configActivacion=0, configAlpha=0;
	byte config=0, funcion=0, funcionSalida=0, funcionOcultas=0, numNeuronas=0;
	byte[] funcionesCapa, numNeuronasCapa;
	long epocas=0;
	boolean continuar=true, buscar=true, errorValid=true;
	double alpha=0.0, error=0.0, salidas[], entradas[][];
	String eco=null, nombre=null, funcionPercetron=null, topologia=null, configAlphas=null, configFunciones=null;
	CapaNeuronal capaNeural=null;

	private JButton crearRedJB;
	private JButton entrenarRedJB;
	private JButton aplicarRedJB;
	private JButton modificarRedJB;
	private JButton eliminarRedJB;

	private SeccionCrearRed seccionCrearRed;
	private SeccionEntrenarRed seccionEntrenarRed;
	private SeccionAplicarRed seccionAplicarRed;
	private SeccionMostrarRed seccionMostrarRed;
	private SeccionModificarRed seccionModificarRed;
	private SeccionEliminarRed seccionEliminarRed;

	private JTabbedPane panelPrincipalJTP;

	private ArrayList<RedNeuronal> redesNeuronalesPMR;

	private ManejadorEventosActionListener manejador;

	public InterfazSecciones(){
		super("RNA - Perceptron Multicapa con Retropropagacion");

		redesNeuronalesPMR = new ArrayList<RedNeuronal>();

		manejador = new ManejadorEventosActionListener();

		crearRedJB = new JButton("Crear");
		entrenarRedJB = new JButton("Entrenar");
		aplicarRedJB = new JButton("Aplicar");
		modificarRedJB = new JButton("Modificar");
		eliminarRedJB = new JButton("Eliminar");

		crearRedJB.addActionListener(manejador);
		entrenarRedJB.addActionListener(manejador);

		seccionCrearRed = new SeccionCrearRed();
		seccionEntrenarRed = new SeccionEntrenarRed();
		seccionAplicarRed = new SeccionAplicarRed();
		seccionMostrarRed = new SeccionMostrarRed();
		seccionModificarRed = new SeccionModificarRed();
		seccionEliminarRed = new SeccionEliminarRed();

		panelPrincipalJTP = new JTabbedPane();

		seccionCrearRed.add(crearRedJB);
		seccionEntrenarRed.add(entrenarRedJB);
		seccionAplicarRed.add(aplicarRedJB);
		seccionModificarRed.add(modificarRedJB);
		seccionEliminarRed.add(eliminarRedJB);

		panelPrincipalJTP.addTab("CREAR", null, seccionCrearRed, "Seccion - Crear Red");
		panelPrincipalJTP.addTab("ENTRENAR", null, seccionEntrenarRed, "Seccion - Entrenar Red");
		panelPrincipalJTP.addTab("APLICAR", null, seccionAplicarRed, "Seccion - Aplicar Red");
		panelPrincipalJTP.addTab("MOSTRAR", null, seccionMostrarRed, "Seccion - Mostrar Red");
		panelPrincipalJTP.addTab("MODIFICAR", null, seccionModificarRed, "Seccion - Modificar Red");
		panelPrincipalJTP.addTab("ELIMINAR", null, seccionEliminarRed, "Seccion - Eliminar Red");

		add(panelPrincipalJTP);
	}

	private class ManejadorEventosActionListener implements ActionListener{
		public void actionPerformed( ActionEvent evento ){
			boolean bandera = false;
			String[] nombresRedesExistentes = null;
			RedNeuronal redNeuronalPM = null;
			if(evento.getSource() == crearRedJB){
				int[] numNeursCapa = seccionCrearRed.obtenerNumeroNeuronasCapa();
				String nombre = seccionCrearRed.obtenerNombreRed();
				String configTdA = seccionCrearRed.obtenerConfiguracionTasaAprendizaje();
				String configFdA = seccionCrearRed.obtenerConfiguracionFuncionActivacion();

				if(redesNeuronalesPMR.size() > 0){
					nombresRedesExistentes = new String[redesNeuronalesPMR.size()];
					for(int i=0; i<redesNeuronalesPMR.size(); i++){
						redNeuronalPM = redesNeuronalesPMR.get(i);
						nombresRedesExistentes[i] = redNeuronalPM.obtenerNombreRed();
					}
				}

				if((numNeursCapa!=null) && (nombre!=null) && (configTdA!=null) && (configFdA!=null)){
					redNeuronalPM = new RedNeuronal(numNeursCapa,nombre,configTdA,configFdA);
					redesNeuronalesPMR.add(redNeuronalPM);
					seccionCrearRed.borrarDatosReiniciarConfiguracion();
					JOptionPane.showMessageDialog(null, "Red neuronal creada y almacenada correctamente.","Creacion de red correcta", JOptionPane.PLAIN_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "Debes establecer los datos de configuracion de la red.","Configuracion incorrecta", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}