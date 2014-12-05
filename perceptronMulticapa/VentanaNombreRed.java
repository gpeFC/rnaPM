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

	private JPanel panelVacioJP0;
	private JPanel panelVacioJP1;
	private JPanel panelVacioJP2;
	private JPanel panelDatosJP;
	private JPanel panelBotonesAccionJP;

	public VentanaNombreRed(){
		super("Nombre Red");
		setLayout(new FlowLayout());

		nombreRedJL = new JLabel("Nuevo nombre: ");

		aceptarJB = new JButton("Aceptar");
		cancelarJB = new JButton("Cancelar");

		nombreRedJTF = new JTextField(15);

		panelVacioJP0 = new JPanel();
		panelVacioJP0.setPreferredSize(new Dimension(350,5));

		panelVacioJP1 = new JPanel();
		panelVacioJP1.setPreferredSize(new Dimension(350,5));

		panelVacioJP2 = new JPanel();
		panelVacioJP2.setPreferredSize(new Dimension(350,5));

		panelDatosJP = new JPanel();
		panelDatosJP.setPreferredSize(new Dimension(350,25));
		panelDatosJP.setLayout(new GridLayout(1,2));

		panelBotonesAccionJP = new JPanel();
		panelBotonesAccionJP.setPreferredSize(new Dimension(350,25));
		panelBotonesAccionJP.setLayout(new GridLayout(1,2,70,20));

		panelDatosJP.add(nombreRedJL);
		panelDatosJP.add(nombreRedJTF);

		panelBotonesAccionJP.add(aceptarJB);
		panelBotonesAccionJP.add(cancelarJB);

		add(panelVacioJP0);
		add(panelDatosJP);
		add(panelVacioJP1);
		add(panelBotonesAccionJP);
		add(panelVacioJP2);
	}
}