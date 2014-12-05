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

	RedNeuronal rnapm=null;
	ArrayList<RedNeuronal> redesNeuronalesPM = new ArrayList<RedNeuronal>();

	public static void main(String args[]){

		/*
		InterfazPrincipal ventanaPrincipal = new InterfazPrincipal();
		ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaPrincipal.setSize(535,375);
		ventanaPrincipal.setLocationRelativeTo(null);
		ventanaPrincipal.setResizable(false);
		ventanaPrincipal.setVisible(true);

		VentanaCrearRed nuevaRed = new VentanaCrearRed();
		nuevaRed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nuevaRed.setSize(270,330);
		nuevaRed.setLocationRelativeTo(null);
		nuevaRed.setResizable(false);
		nuevaRed.setVisible(true);

		VentanaFuncionActivacion funcionActivacion = new VentanaFuncionActivacion();
		funcionActivacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		funcionActivacion.setSize(300,250);
		funcionActivacion.setLocationRelativeTo(null);
		funcionActivacion.setResizable(false);
		funcionActivacion.setVisible(true);
		

		VentanaMostrarRed mostrarRed = new VentanaMostrarRed();
		mostrarRed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mostrarRed.setSize(350,370);
		mostrarRed.setLocationRelativeTo(null);
		mostrarRed.setResizable(false);
		mostrarRed.setVisible(true); */

		VentanaAplicarRed aplicarRed = new VentanaAplicarRed();
		aplicarRed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicarRed.setSize(375,395);
		aplicarRed.setLocationRelativeTo(null);
		aplicarRed.setResizable(false);
		aplicarRed.setVisible(true);
		

		VentanaEntrenarRed entrenarRed = new VentanaEntrenarRed();
		entrenarRed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		entrenarRed.setSize(375,245);
		entrenarRed.setLocationRelativeTo(null);
		entrenarRed.setResizable(false);
		entrenarRed.setVisible(true);
	}
}