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
		ventanaPrincipal.setVisible(true);

		VentanaCrearRed nuevaRed = new VentanaCrearRed();
		nuevaRed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nuevaRed.setSize(265,350);
		nuevaRed.setVisible(true);

		VentanaFuncionActivacion funcionActivacion = new VentanaFuncionActivacion();
		funcionActivacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		funcionActivacion.setSize(350,250);
		funcionActivacion.setVisible(true);
	}
}