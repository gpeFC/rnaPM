/******************************************************************************
 * UAEM, Facultad de Ciencias
 * Seminario de Programacion II
 * Emanuel GP
 *
 * Proyecto: Red Neuronal Artificial: Perceptron Multicapa con Retropropagacion
 ******************************************************************************/

import javax.swing.JFrame;

public class RNAPM{
	public static void main(String args[]){

		InterfazPrincipal ventanaPrincipal = new InterfazPrincipal();
		ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaPrincipal.setSize(535,380);
		ventanaPrincipal.setLocationRelativeTo(null);
		ventanaPrincipal.setResizable(false);
		ventanaPrincipal.setVisible(true);

		VentanaCrearRed nuevaRed = new VentanaCrearRed();
		nuevaRed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nuevaRed.setSize(270,335);
		nuevaRed.setLocationRelativeTo(null);
		nuevaRed.setResizable(false);
		nuevaRed.setVisible(true);

		VentanaFuncionActivacion funcionActivacion = new VentanaFuncionActivacion();
		funcionActivacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		funcionActivacion.setSize(300,250);
		funcionActivacion.setLocationRelativeTo(null);
		funcionActivacion.setResizable(false);
		funcionActivacion.setVisible(true);
	}
}