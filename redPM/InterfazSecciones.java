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

	static RedNeuronal redNeuralPM;

	public ArrayList<RedNeuronal> redesNeuronalesPerceptron = new ArrayList<RedNeuronal>();

	private SeccionCrearRed seccionCrearRed;
	private SeccionEntrenarRed seccionEntrenarRed;
	private SeccionAplicarRed seccionAplicarRed;
	private SeccionMostrarRed seccionMostrarRed;
	private SeccionModificarRed seccionModificarRed;
	private SeccionEliminarRed seccionEliminarRed;

	private JTabbedPane panelPrincipalJTP;

	public InterfazSecciones(){
		super("RNA - Perceptron Multicapa con Retropropagacion");

		ManejadorCampoTexto manejador = new ManejadorCampoTexto();

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

		panelPrincipalJTP.addTab("CREAR", null, seccionCrearRed, "Primer panel");
		panelPrincipalJTP.addTab("ENTRENAR", null, seccionEntrenarRed, "Segundo panel");
		panelPrincipalJTP.addTab("APLICAR", null, seccionAplicarRed, "Tercer panel");
		panelPrincipalJTP.addTab("MOSTRAR", null, seccionMostrarRed, "Cuarto panel");
		panelPrincipalJTP.addTab("MODIFICAR", null, seccionModificarRed, "Quinto panel");
		panelPrincipalJTP.addTab("ELIMINAR", null, seccionEliminarRed, "Sexto panel");

		add(panelPrincipalJTP);
	}

	private class ManejadorCampoTexto implements ActionListener{
		public void actionPerformed( ActionEvent evento ){
			
			if(evento.getSource() == crearRedJB){
				
				int[] arregloNumsCapa = seccionCrearRed.obtenerArregloNumNeursCapa();
				String nombre = seccionCrearRed.obtenerNombreRed();
				String configTdA = seccionCrearRed.obtenerConfiguracionTdA();
				String configFdA = seccionCrearRed.obtenerconfiguracionFdA();
			
				redNeuralPM = new RedNeuronal(arregloNumsCapa,nombre,configTdA,configFdA);
				
				if(redNeuralPM != null){
					redesNeuronalesPerceptron.add(redNeuralPM);
					System.out.printf("\nRed guardada...\n");
					redNeuralPM = null;
				}
				
				seccionCrearRed.vaciarElementosRed();
			}
		}
	}
}