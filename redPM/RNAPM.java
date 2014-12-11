/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 *
 * Proyecto: Red Neuronal Artificial Perceptron 
 ******************************************************************************/

// Clase: RNAPM

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.JFrame;

public class RNAPM{
	public static void main(String[] args){
		InterfazSecciones interfazGrafica = new InterfazSecciones();
		interfazGrafica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		interfazGrafica.setSize(515, 475);
		interfazGrafica.setVisible(true);
	}
}
