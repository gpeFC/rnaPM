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

public class SeccionEntrenarRed extends JPanel{

	private final String condicionAltoEntrenamientoAS[] = {"...","Epocas de Entrenamiento",
													 "Epocas de Entrenamiento / ErrorMinimo"};
	private final String algoritmoEntrenamientoAS[] = {"...","Algoritmo de Retropropagacion",
													 "Algoritmo de Retropropagacion / Momento"};

	private JLabel entrenarRedJL;
	private JLabel redEntrenarJL;
	private JLabel algoritmoEntrenamientoASJL;
	private JLabel condicionAltoEntrenamientoASJL;

	private JButton entrenarRedJB;

	private JComboBox redesEntrenarJCB;
	private JComboBox algoritmoEntrenamientoASJCB;
	private JComboBox condicioncondicionAltoEntrenamientoASJCB;

	private JTextArea patronesEntrenamientoJTA;

	private JPanel panelPatronesEntrenamientoJP;

	public SeccionEntrenarRed(){
		entrenarRedJL = new JLabel("Entrenar Red", SwingConstants.CENTER);
		redEntrenarJL = new JLabel("Red a entrenar:");
		algoritmoEntrenamientoASJL = new JLabel("Algoritmo de entrenamiento");
		condicionAltoEntrenamientoASJL = new JLabel("Condicion de alto del entrenamiento");

		entrenarRedJB = new JButton("Entrenar");

		redesEntrenarJCB = new JComboBox();
		redesEntrenarJCB.setPreferredSize(new Dimension(200,25));
		redesEntrenarJCB.setMaximumRowCount(3);

		algoritmoEntrenamientoASJCB = new JComboBox(algoritmoEntrenamientoAS);
		algoritmoEntrenamientoASJCB.setPreferredSize(new Dimension(320,25));
		algoritmoEntrenamientoASJCB.setMaximumRowCount(3);

		condicioncondicionAltoEntrenamientoASJCB = new JComboBox(condicionAltoEntrenamientoAS);
		condicioncondicionAltoEntrenamientoASJCB.setPreferredSize(new Dimension(320,25));
		condicioncondicionAltoEntrenamientoASJCB.setMaximumRowCount(3);

		patronesEntrenamientoJTA = new JTextArea(8,34);

		panelPatronesEntrenamientoJP = new JPanel();
		panelPatronesEntrenamientoJP.setPreferredSize(new Dimension(400,155));

		panelPatronesEntrenamientoJP.add(patronesEntrenamientoJTA);
		panelPatronesEntrenamientoJP.setBorder(BorderFactory.createTitledBorder("Patrones de Entrenamiento"));

		add(entrenarRedJL);
		add(redEntrenarJL);
		add(redesEntrenarJCB);
		add(panelPatronesEntrenamientoJP);
		add(condicionAltoEntrenamientoASJL);
		add(condicioncondicionAltoEntrenamientoASJCB);
		add(algoritmoEntrenamientoASJL);
		add(algoritmoEntrenamientoASJCB);
		add(entrenarRedJB);
	}
}