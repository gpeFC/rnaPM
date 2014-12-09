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

public class SeccionAplicarRed extends JPanel{

	private JLabel aplicarRedJL;
	private JLabel redAplicarJL;

	private JComboBox redesAplicarJCB;

	private JTextArea entradaDatosAplicarJTA;
	private JTextArea salidaDatosAplicarJTA;

	private JPanel panelEntradaDatosAplicarJP;
	private JPanel panelSalidaDatosAplicarJP;

	public SeccionAplicarRed(){
		aplicarRedJL = new JLabel("Aplicar Red", SwingConstants.CENTER);
		redAplicarJL = new JLabel("Red a aplicar:");

		redesAplicarJCB = new JComboBox();
		redesAplicarJCB.setPreferredSize(new Dimension(200,25));
		redesAplicarJCB.setMaximumRowCount(3);

		entradaDatosAplicarJTA = new JTextArea(8,34);
		salidaDatosAplicarJTA = new JTextArea(8,34);

		panelEntradaDatosAplicarJP = new JPanel();
		panelEntradaDatosAplicarJP.setPreferredSize(new Dimension(400,155));
		
		panelSalidaDatosAplicarJP = new JPanel();
		panelSalidaDatosAplicarJP.setPreferredSize(new Dimension(400,155));

		panelEntradaDatosAplicarJP.add(entradaDatosAplicarJTA);
		panelEntradaDatosAplicarJP.setBorder(BorderFactory.createTitledBorder("Entrada de Datos"));

		panelSalidaDatosAplicarJP.add(salidaDatosAplicarJTA);
		panelSalidaDatosAplicarJP.setBorder(BorderFactory.createTitledBorder("Salida de Datos"));

		add(aplicarRedJL);
		add(redAplicarJL);
		add(redesAplicarJCB);
		add(panelEntradaDatosAplicarJP);
		add(panelSalidaDatosAplicarJP);
	}
}