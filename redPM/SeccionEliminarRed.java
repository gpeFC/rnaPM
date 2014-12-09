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

public class SeccionEliminarRed extends JPanel{

	private JLabel eliminarRedJL;
	private JLabel redEliminarJL;

	private JButton eliminarRedJB;

	private JComboBox redesEliminarJCB;

	public SeccionEliminarRed(){
		eliminarRedJL = new JLabel("Eliminar Red", SwingConstants.CENTER);
		redEliminarJL = new JLabel("Red a eliminar:");

		eliminarRedJB = new JButton("Eliminar");

		redesEliminarJCB = new JComboBox();
		redesEliminarJCB.setPreferredSize(new Dimension(200,25));
		redesEliminarJCB.setMaximumRowCount(3);

		add(eliminarRedJL);
		add(redEliminarJL);
		add(redesEliminarJCB);
		add(eliminarRedJB);
	}
}