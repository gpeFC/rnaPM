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

public class SeccionModificarRed extends JPanel{

	private final String parametrosModificablesAS[] = {"...","Nombre de Red","Configuracion de la Tasa de Aprendizaje",
													 "Configuracion de la Funcion de Activacion"};

	private JLabel modificarRedJL;
	private JLabel redModificarJL;
	private JLabel parametroModificarJL;

	private JComboBox redesModificarJCB;
	private JComboBox parametrosModificarJCB;

	public SeccionModificarRed(){
		modificarRedJL = new JLabel("Modificar Red", SwingConstants.CENTER);
		redModificarJL = new JLabel("Red a modificar:");
		parametroModificarJL = new JLabel("Parametro a modificar");

		redesModificarJCB = new JComboBox();
		redesModificarJCB.setPreferredSize(new Dimension(200,25));
		redesModificarJCB.setMaximumRowCount(3);

		parametrosModificarJCB = new JComboBox(parametrosModificablesAS);
		parametrosModificarJCB.setPreferredSize(new Dimension(320,25));
		parametrosModificarJCB.setMaximumRowCount(3);

		add(modificarRedJL);
		add(redModificarJL);
		add(redesModificarJCB);
		add(parametroModificarJL);
		add(parametrosModificarJCB);
	}
}