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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;

public class VentanaAplicarRed extends JFrame{

	private JLabel redAplicarJL;

	private JButton aplicarJB;
	private JButton salirJB;

	private JComboBox redesJCB;

	private JTextArea entradaDatosJTA;
	private JTextArea salidaDatosJTA;

	private JPanel panelVacioJP0;
	private JPanel panelVacioJP1;
	private JPanel panelVacioJP2;
	private JPanel panelVacioJP3;
	private JPanel panelVacioJP4;
	private JPanel panelRedesJP;
	private JPanel panelEntradaDatosJP;
	private JPanel panelSalidaDatosJP;
	private JPanel panelBotonesAccionJP;

	public VentanaAplicarRed(){
		super("Aplicar Red");
		setLayout(new FlowLayout());

		redAplicarJL = new JLabel(" Red a aplicar: ");

		aplicarJB = new JButton("Aplicar");
		
		salirJB = new JButton("Salir");
		salirJB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evento){
				dispose();
			}
		});

		redesJCB = new JComboBox();
		redesJCB.setPreferredSize(new Dimension(150,20));
		redesJCB.setMaximumRowCount(3);

		entradaDatosJTA = new JTextArea(8,30);
		salidaDatosJTA = new JTextArea(8,30);

		panelVacioJP0 = new JPanel();
		panelVacioJP0.setPreferredSize(new Dimension(350,5));

		panelVacioJP1 = new JPanel();
		panelVacioJP1.setPreferredSize(new Dimension(350,5));

		panelVacioJP2 = new JPanel();
		panelVacioJP2.setPreferredSize(new Dimension(350,5));

		panelVacioJP3 = new JPanel();
		panelVacioJP3.setPreferredSize(new Dimension(350,5));

		panelVacioJP4 = new JPanel();
		panelVacioJP4.setPreferredSize(new Dimension(350,5));

		panelRedesJP = new JPanel();
		panelRedesJP.setPreferredSize(new Dimension(350,20));
		panelRedesJP.setLayout(new GridLayout(1,2));

		panelEntradaDatosJP = new JPanel();
		panelEntradaDatosJP.setPreferredSize(new Dimension(350,150));
		
		panelSalidaDatosJP = new JPanel();
		panelSalidaDatosJP.setPreferredSize(new Dimension(350,150));
		
		panelBotonesAccionJP = new JPanel();
		panelBotonesAccionJP.setPreferredSize(new Dimension(350,25));
		panelBotonesAccionJP.setLayout(new GridLayout(1,2,100,1));

		panelRedesJP.add(redAplicarJL);
		panelRedesJP.add(redesJCB);

		panelEntradaDatosJP.add(entradaDatosJTA);
		panelEntradaDatosJP.setBorder(BorderFactory.createTitledBorder("Entrada de Datos"));

		panelSalidaDatosJP.add(salidaDatosJTA);
		panelSalidaDatosJP.setBorder(BorderFactory.createTitledBorder("Salida de Datos"));

		panelBotonesAccionJP.add(aplicarJB);
		panelBotonesAccionJP.add(salirJB);

		add(panelVacioJP0);
		add(panelRedesJP);
		add(panelVacioJP1);
		add(panelEntradaDatosJP);
		add(panelVacioJP2);
		add(panelSalidaDatosJP);
		add(panelVacioJP3);
		add(panelBotonesAccionJP);
		add(panelVacioJP4);
	}
}