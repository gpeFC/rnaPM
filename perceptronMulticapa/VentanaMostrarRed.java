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

public class VentanaMostrarRed extends JFrame{

	private JLabel datosRedJL;

	private JButton aceptarJB;

	private JPanel panelDatosRedJP;

	public VentanaMostrarRed(){
		super("Mostrar Red");
		setLayout(new FlowLayout());

		datosRedJL = new JLabel("Datos de la Red");

		aceptarJB = new JButton("Aceptar");

		panelDatosRedJP = new JPanel();
		panelDatosRedJP.setPreferredSize(new Dimension(300,250));

		add(datosRedJL);
		add(new JScrollPane(panelDatosRedJP));
		add(aceptarJB);
	}
}