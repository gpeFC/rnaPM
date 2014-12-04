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
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class VentanaFuncionActivacion extends JFrame{

	private JLabel configuracionJL;

	public VentanaFuncionActivacion(){
		super("Funcion de Activacion");

		configuracionJL = new JLabel("Establecer configuracion");

		add(configuracionJL);
	}
}