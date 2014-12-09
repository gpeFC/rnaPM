import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;

public class SeccionCrearRed extends JPanel{

	private int numeroCapas;
	private int[] numeroNeuronasCapa;

	private String nombreRed;

	private final String tasaAprendizajeAS[] = {"...","TasaAprendizaje / Red","TasaAprendizaje / Capa",
												 "TasaAprendizaje / Neurona"};
	private final String funcionActivacionAS[] = {"...","FuncionActivacion / Red","FuncionActivacion / Capa",
												 "FuncionActivacion / Neurona","FuncionActivacion / SalidaOcultas"};

	private JLabel crearRedJL;
	private JLabel nombreRedJL;
	private JLabel numeroCapasJL;
	private JLabel numeroNeuronasCapaJL;
	private JLabel tasaAprendizajeJL;
	private JLabel funcionActivacionJL;

	private JButton crearRedJB;

	private JTextField nombreRedJTF;
	private JTextField numeroCapasJTF;
	private JTextField numeroNeuronasCapaJTF;

	private JComboBox tasaAprendizajeJCB;
	private JComboBox funcionActivacionJCB;

	public SeccionCrearRed(){
		ManejadorCampoTexto manejador = new ManejadorCampoTexto();

		crearRedJL = new JLabel("Crear Red", SwingConstants.CENTER);
		nombreRedJL = new JLabel("Nombre de red:");
		numeroCapasJL = new JLabel("Numero de capas:");
		numeroNeuronasCapaJL = new JLabel("Numero de neuronas por capa[numC1,numC1,...,numCn]:");
		tasaAprendizajeJL = new JLabel("Tasa de Aprendizaje:");
		funcionActivacionJL = new JLabel("Funcion de Activacion:");

		crearRedJB = new JButton("Crear");

		nombreRedJTF = new JTextField(15);
		numeroCapasJTF = new JTextField(15);
		numeroNeuronasCapaJTF = new JTextField(15);

		tasaAprendizajeJCB = new JComboBox(tasaAprendizajeAS);
		tasaAprendizajeJCB.setPreferredSize(new Dimension(320,25));
		tasaAprendizajeJCB.setMaximumRowCount(3);

		funcionActivacionJCB = new JComboBox(funcionActivacionAS);
		funcionActivacionJCB.setPreferredSize(new Dimension(320,25));
		funcionActivacionJCB.setMaximumRowCount(3);

		nombreRedJTF.addActionListener(manejador);
		numeroCapasJTF.addActionListener(manejador);
		numeroNeuronasCapaJTF.addActionListener(manejador);

		add(crearRedJL);
		add(nombreRedJL);
		add(nombreRedJTF);
		add(numeroCapasJL);
		add(numeroCapasJTF);
		add(numeroNeuronasCapaJL);
		add(numeroNeuronasCapaJTF);
		add(tasaAprendizajeJL);
		add(tasaAprendizajeJCB);
		add(funcionActivacionJL);
		add(funcionActivacionJCB);
		add(crearRedJB);
	}

	private class ManejadorCampoTexto implements ActionListener{
		public void actionPerformed( ActionEvent evento ){
			String cadena = "";
			if(evento.getSource() == nombreRedJTF){
				cadena = String.format("%s", evento.getActionCommand());
				if(cadena.length() > 0)
					nombreRed = cadena;
				else
					JOptionPane.showMessageDialog(null, "Nombre invalido.","Dato incorrecto", JOptionPane.ERROR_MESSAGE);
			}
			else if(evento.getSource() == numeroCapasJTF){}
			else if(evento.getSource() == numeroNeuronasCapaJTF){}
		}
	}
}