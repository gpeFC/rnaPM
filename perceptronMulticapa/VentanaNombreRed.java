/******************************************************************************
 * UAEM, Facultad de Ciencias
 * Seminario de Programacion II
 * Emanuel GP
 *
 * Proyecto: Red Neuronal Artificial: Perceptron Multicapa con Retropropagacion
 ******************************************************************************/

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class VentanaNombreRed extends JFrame{

	private JLabel nombreRedJL;

	private JButton aceptarJB;
	private JButton cancelarJB;

	private JTextField nombreRedJTF;

	private JPanel panelDatosJP;
	private JPanel panelVacioJP;
	private JPanel panelBotonesAccionJP;

	public VentanaNombreRed(){
		super("Nombre Red");
		setLayout(new FlowLayout());

		nombreRedJL = new JLabel("Nuevo nombre: ");

		aceptarJB = new JButton("Aceptar");
		cancelarJB = new JButton("Cancelar");

		nombreRedJTF = new JTextField(15);

		panelDatosJP = new JPanel();
		panelDatosJP.setPreferredSize(new Dimension(350,25));
		panelDatosJP.setLayout(new GridLayout(1,2));

		panelVacioJP = new JPanel();
		panelVacioJP.setPreferredSize(new Dimension(350,5));

		panelBotonesAccionJP = new JPanel();
		panelBotonesAccionJP.setPreferredSize(new Dimension(350,25));
		panelBotonesAccionJP.setLayout(new GridLayout(1,2,70,20));

		panelDatosJP.add(nombreRedJL);
		panelDatosJP.add(nombreRedJTF);

		panelBotonesAccionJP.add(aceptarJB);
		panelBotonesAccionJP.add(cancelarJB);

		add(panelDatosJP);
		add(panelVacioJP);
		add(panelBotonesAccionJP);
	}
}