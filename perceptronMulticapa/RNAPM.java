/******************************************************************************
 * UAEM, Facultad de Ciencias
 * Seminario de Programacion II
 * Emanuel GP
 *
 * Proyecto: Red Neuronal Artificial: Perceptron Multicapa con Retropropagacion
 ******************************************************************************/

import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class RNAPM{

	private int numeroCapas=0;
	private int[] numNeursCapa;
	private String nombreRed="";
	private String configTasaRed="";
	private String configFuncionRed="";
	private RedNeuronal rnapm=null;
	private ArrayList<RedNeuronal> redesNeuronalesPM = new ArrayList<RedNeuronal>();

	public static void main(String args[]){

		InterfazPrincipal ventanaPrincipal = new InterfazPrincipal();
		ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaPrincipal.setSize(535,375);
		ventanaPrincipal.setLocationRelativeTo(null);
		ventanaPrincipal.setResizable(false);
		ventanaPrincipal.setVisible(true);


		/*

		InterfazPrincipal ventanaPrincipal = new InterfazPrincipal();
		ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaPrincipal.setSize(535,375);
		ventanaPrincipal.setLocationRelativeTo(null);
		ventanaPrincipal.setResizable(false);
		ventanaPrincipal.setVisible(true);

		VentanaCrearRed nuevaRed = new VentanaCrearRed();
		nuevaRed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nuevaRed.setSize(270,345);
		nuevaRed.setLocationRelativeTo(null);
		nuevaRed.setResizable(false);
		nuevaRed.setVisible(true);

		VentanaFuncionActivacion funcionActivacion = new VentanaFuncionActivacion();
		funcionActivacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		funcionActivacion.setSize(300,280);
		funcionActivacion.setLocationRelativeTo(null);
		funcionActivacion.setResizable(false);
		funcionActivacion.setVisible(true);

		VentanaMostrarRed mostrarRed = new VentanaMostrarRed();
		mostrarRed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mostrarRed.setSize(350,405);
		mostrarRed.setLocationRelativeTo(null);
		mostrarRed.setResizable(false);
		mostrarRed.setVisible(true);
		
		VentanaAplicarRed aplicarRed = new VentanaAplicarRed();
		aplicarRed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicarRed.setSize(375,445);
		aplicarRed.setLocationRelativeTo(null);
		aplicarRed.setResizable(false);
		aplicarRed.setVisible(true);
		
		VentanaEntrenarRed entrenarRed = new VentanaEntrenarRed();
		entrenarRed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		entrenarRed.setSize(375,450);
		entrenarRed.setLocationRelativeTo(null);
		entrenarRed.setResizable(false);
		entrenarRed.setVisible(true);

		VentanaMaximoEpocas maxEpocas = new VentanaMaximoEpocas();
		maxEpocas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		maxEpocas.setSize(375,120);
		maxEpocas.setLocationRelativeTo(null);
		maxEpocas.setResizable(false);
		maxEpocas.setVisible(true);

		VentanaMaximoEpocasErrorMinimo errorMinimo = new VentanaMaximoEpocasErrorMinimo();
		errorMinimo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		errorMinimo.setSize(375,145);
		errorMinimo.setLocationRelativeTo(null);
		errorMinimo.setResizable(false);
		errorMinimo.setVisible(true);
		
		VentanaEliminarRed eliminarRed = new VentanaEliminarRed();
		eliminarRed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		eliminarRed.setSize(375,115);
		eliminarRed.setLocationRelativeTo(null);
		eliminarRed.setResizable(false);
		eliminarRed.setVisible(true);
		
		VentanaModificarRed modificarRed = new VentanaModificarRed();
		modificarRed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		modificarRed.setSize(330,230);
		modificarRed.setLocationRelativeTo(null);
		modificarRed.setResizable(false);
		modificarRed.setVisible(true);
		
		VentanaNombreRed nombreRed = new VentanaNombreRed();
		nombreRed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nombreRed.setSize(375,120);
		nombreRed.setLocationRelativeTo(null);
		nombreRed.setResizable(false);
		nombreRed.setVisible(true);

		VentanaConfiguracionTdA tasaRed = new VentanaConfiguracionTdA();
		tasaRed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tasaRed.setSize(260,195);
		tasaRed.setLocationRelativeTo(null);
		tasaRed.setResizable(false);
		tasaRed.setVisible(true);

		VentanaConfiguracionFdA funcionRed = new VentanaConfiguracionFdA();
		funcionRed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		funcionRed.setSize(260,215);
		funcionRed.setLocationRelativeTo(null);
		funcionRed.setResizable(false);
		funcionRed.setVisible(true);

		*/
		
	}

	public void establecerNombreRed(String nombreRed){
		this.nombreRed = nombreRed;
	}
}