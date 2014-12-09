import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;

public class InterfazSecciones extends JFrame{

	private SeccionCrearRed seccionCrearRed;
	private SeccionEntrenarRed seccionEntrenarRed;
	private SeccionAplicarRed seccionAplicarRed;
	private SeccionMostrarRed seccionMostrarRed;
	private SeccionModificarRed seccionModificarRed;
	private SeccionEliminarRed seccionEliminarRed;

	private JTabbedPane panelPrincipalJTP;

	public InterfazSecciones(){
		super("RNA - Perceptron Multicapa con Retropropagacion");

		seccionCrearRed = new SeccionCrearRed();
		seccionEntrenarRed = new SeccionEntrenarRed();
		seccionAplicarRed = new SeccionAplicarRed();
		seccionMostrarRed = new SeccionMostrarRed();
		seccionModificarRed = new SeccionModificarRed();
		seccionEliminarRed = new SeccionEliminarRed();

		panelPrincipalJTP = new JTabbedPane();

		panelPrincipalJTP.addTab("CREAR", null, seccionCrearRed, "Primer panel");
		panelPrincipalJTP.addTab("ENTRENAR", null, seccionEntrenarRed, "Segundo panel");
		panelPrincipalJTP.addTab("APLICAR", null, seccionAplicarRed, "Tercer panel");
		panelPrincipalJTP.addTab("MOSTRAR", null, seccionMostrarRed, "Cuarto panel");
		panelPrincipalJTP.addTab("MODIFICAR", null, seccionModificarRed, "Quinto panel");
		panelPrincipalJTP.addTab("ELIMINAR", null, seccionEliminarRed, "Sexto panel");

		add(panelPrincipalJTP);
	}
}