/******************************************************************************
 * UAEM, Facultad de Ciencias
 * Seminario de Programacion II
 * Emanuel GP
 *
 * Proyecto: Red Neuronal Artificial: Perceptron Multicapa con Retropropagacion
 ******************************************************************************/

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class VentanaFuncionActivacion extends JFrame{

	private JLabel configuracionJL;

	private JButton aceptarJB;

	private JPanel panelConfigFncnActvcnJP;

	public VentanaFuncionActivacion(){
		super("Funcion de Activacion");
		setLayout(new FlowLayout());

		configuracionJL = new JLabel("Establecer configuracion");

		aceptarJB = new JButton("Aceptar");

		panelConfigFncnActvcnJP = new JPanel();
		panelConfigFncnActvcnJP.setPreferredSize(new Dimension(250,160));

		add(configuracionJL);
		add(new JScrollPane(panelConfigFncnActvcnJP));
		add(aceptarJB);
	}
}