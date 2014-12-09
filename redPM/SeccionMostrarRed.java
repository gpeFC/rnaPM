import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
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

public class SeccionMostrarRed extends JPanel{

	private JLabel mostrarRedJL;
	private JLabel redMostrarJL;
	private JLabel datosRedJL;

	private JComboBox redesMostrarJCB;

	private JPanel panelMostrarDatosRedJP;

	public SeccionMostrarRed(){
		mostrarRedJL = new JLabel("Mostrar Red", SwingConstants.CENTER);
		redMostrarJL = new JLabel("Red a mostrar:");
		datosRedJL = new JLabel("Datos de la Red");

		redesMostrarJCB = new JComboBox();
		redesMostrarJCB.setPreferredSize(new Dimension(200,25));
		redesMostrarJCB.setMaximumRowCount(3);

		panelMostrarDatosRedJP = new JPanel();
		panelMostrarDatosRedJP.setPreferredSize(new Dimension(400,250));

		add(mostrarRedJL);
		add(redMostrarJL);
		add(redesMostrarJCB);
		add(datosRedJL);
		add(new JScrollPane(panelMostrarDatosRedJP));
	}
}