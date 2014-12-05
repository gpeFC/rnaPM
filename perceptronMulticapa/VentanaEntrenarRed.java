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
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;

public class VentanaEntrenarRed extends JFrame{

	private JLabel redEntrenarJL;

	private JButton entrenarJB;
	private JButton salirJB;

	private JComboBox redesJCB;

	private JTextArea datosEntrenarJTA;

	private JPanel panelEntrenamientoJP;
	private JPanel panelBotonesAccionJP;

	public VentanaEntrenarRed(){
		super("Aplicar Red");
		setLayout(new FlowLayout());

		redEntrenarJL = new JLabel("Red a entrenar: ");

		entrenarJB = new JButton("Entrenar");
		salirJB = new JButton("Salir");

		redesJCB = new JComboBox();
		redesJCB.setPreferredSize(new Dimension(150,20));
		redesJCB.setMaximumRowCount(3);

		datosEntrenarJTA = new JTextArea(8,30);

		panelEntrenamientoJP = new JPanel();
		panelEntrenamientoJP.setPreferredSize(new Dimension(350,150));
		
		panelBotonesAccionJP = new JPanel();
		panelBotonesAccionJP.setPreferredSize(new Dimension(350,25));
		panelBotonesAccionJP.setLayout(new GridLayout(1,2,100,1));

		panelEntrenamientoJP.add(datosEntrenarJTA);
		panelEntrenamientoJP.setBorder(BorderFactory.createTitledBorder("Patrones de Entrenamiento"));

		panelBotonesAccionJP.add(entrenarJB);
		panelBotonesAccionJP.add(salirJB);

		add(redEntrenarJL);
		add(redesJCB);
		add(panelEntrenamientoJP);
		add(panelBotonesAccionJP);
	}
}