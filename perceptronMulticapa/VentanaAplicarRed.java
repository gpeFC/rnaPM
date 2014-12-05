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
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import javax.swing.Box;

public class VentanaAplicarRed extends JFrame{

	private JLabel redAplicarJL;

	private JButton aplicarJB;
	private JButton salirJB;

	private JComboBox redesJCB;

	private JTextArea entradaDatosJTA;
	private JTextArea salidaDatosJTA;

	private JPanel panelEntradaDatosJP;
	private JPanel panelSalidaDatosJP;
	private JPanel panelBotonesAccionJP;

	private Box cuadroPanelesB;

	public VentanaAplicarRed(){
		super("Aplicar Red");
		setLayout(new FlowLayout());

		redAplicarJL = new JLabel("Red a aplicar: ");

		aplicarJB = new JButton("Aplicar");
		salirJB = new JButton("Salir");

		redesJCB = new JComboBox();
		redesJCB.setPreferredSize(new Dimension(150,20));
		redesJCB.setMaximumRowCount(3);

		entradaDatosJTA = new JTextArea(8,30);
		salidaDatosJTA = new JTextArea(8,30);

		panelEntradaDatosJP = new JPanel();
		panelEntradaDatosJP.setPreferredSize(new Dimension(350,150));
		
		panelSalidaDatosJP = new JPanel();
		panelSalidaDatosJP.setPreferredSize(new Dimension(350,150));
		
		panelBotonesAccionJP = new JPanel();
		panelBotonesAccionJP.setPreferredSize(new Dimension(350,25));
		panelBotonesAccionJP.setLayout(new GridLayout(1,2,100,1));

		panelEntradaDatosJP.add(entradaDatosJTA);
		panelEntradaDatosJP.setBorder(BorderFactory.createTitledBorder("Entrada de Datos"));

		panelSalidaDatosJP.add(salidaDatosJTA);
		panelSalidaDatosJP.setBorder(BorderFactory.createTitledBorder("Salida de Datos"));

		panelBotonesAccionJP.add(aplicarJB);
		panelBotonesAccionJP.add(salirJB);

		cuadroPanelesB = Box.createVerticalBox();

		cuadroPanelesB.add(panelEntradaDatosJP);
		cuadroPanelesB.add(panelSalidaDatosJP);

		add(redAplicarJL);
		add(redesJCB);
		add(cuadroPanelesB);
		add(panelBotonesAccionJP);
	}
}