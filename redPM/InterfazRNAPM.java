
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
import javax.swing.SwingConstants;

public class InterfazRNAPM extends JFrame{

	private JLabel crearRedJL;
	private JLabel entrenarRedJL;
	private JLabel aplicarRedJL;
	private JLabel mostrarRedJL;
	private JLabel modificarRedJL;
	private JLabel eliminarRedJL;

	private JLabel redEntrenarJL;
	private JLabel redAplicarJL;
	private JLabel redMostrarJL;
	private JLabel redModificarJL;
	private JLabel redEliminarJL;

	private JButton crearRedJB;
	private JButton entrenarRedJB;
	private JButton aplicarRedJB;
	private JButton mostrarRedJB;
	private JButton modificarRedJB;
	private JButton eliminarRedJB;

	private JComboBox redesEntrenarJCB;
	private JComboBox redesAplicarJCB;
	private JComboBox redesMostrarJCB;
	private JComboBox redesModificarJCB;
	private JComboBox redesEliminarJCB;

	private JPanel panelVacio0JP;
	private JPanel panelVacio1JP;
	private JPanel panelVacio2JP;
	private JPanel panelVacio3JP;
	private JPanel panelVacio4JP;
	private JPanel panelVacio5JP;
	private JPanel panelVacio6JP;
	private JPanel panelVacio7JP;
	private JPanel panelVacio8JP;
	private JPanel panelVacio9JP;
	private JPanel panelVacio10JP;
	private JPanel panelVacio11JP;

	private JPanel panelTituloCrearJP;
	private JPanel panelTituloEntrenarJP;
	private JPanel panelTituloAplicarJP;
	private JPanel panelTituloMostrarJP;
	private JPanel panelTituloModificarJP;
	private JPanel panelTituloEliminarJP;

	private JPanel panelElementosCrearJP;
	private JPanel panelElementosEntrenarJP;
	private JPanel panelElementosAplicarJP;
	private JPanel panelElementosMostrarJP;
	private JPanel panelElementosModificarJP;
	private JPanel panelElementosEliminarJP;

	private JPanel panelCapaCrearRedJP;
	private JPanel panelCapaEntrenarRedJP;
	private JPanel panelCapaAplicarRedJP;
	private JPanel panelCapaMostrarRedJP;
	private JPanel panelCapaModificarRedJP;
	private JPanel panelCapaEliminarRedJP;

	private JTabbedPane panelPrincipalJTP;

	public InterfazRNAPM(){
		super("RNA - Perceptron Multicapa con Retropropagacion");

		crearRedJL = new JLabel("Crear Red", SwingConstants.CENTER);
		entrenarRedJL = new JLabel("Entrenar Red", SwingConstants.CENTER);
		aplicarRedJL = new JLabel("Aplicar Red", SwingConstants.CENTER);
		mostrarRedJL = new JLabel("Mostrar Red", SwingConstants.CENTER);
		modificarRedJL = new JLabel("Modificar Red", SwingConstants.CENTER);
		eliminarRedJL = new JLabel("Eliminar Red", SwingConstants.CENTER);

		redEntrenarJL = new JLabel("Red a entrenar:");
		redAplicarJL = new JLabel("Red a aplicar:");
		redMostrarJL = new JLabel("Red a mostrar:");
		redModificarJL = new JLabel("Red a modificar:");
		redEliminarJL = new JLabel("Red a eliminar:");

		crearRedJB = new JButton("Crear");
		entrenarRedJB = new JButton("Entrenar");
		aplicarRedJB = new JButton("Aplicar");
		mostrarRedJB = new JButton("Mostrar");
		modificarRedJB = new JButton("Modificar");
		eliminarRedJB = new JButton("Eliminar");

		redesEntrenarJCB = new JComboBox();
		redesEntrenarJCB.setPreferredSize(new Dimension(200,25));
		redesEntrenarJCB.setMaximumRowCount(3);

		redesAplicarJCB = new JComboBox();
		redesAplicarJCB.setPreferredSize(new Dimension(200,25));
		redesAplicarJCB.setMaximumRowCount(3);

		redesMostrarJCB = new JComboBox();
		redesMostrarJCB.setPreferredSize(new Dimension(200,25));
		redesMostrarJCB.setMaximumRowCount(3);

		redesModificarJCB = new JComboBox();
		redesModificarJCB.setPreferredSize(new Dimension(200,25));
		redesModificarJCB.setMaximumRowCount(3);

		redesEliminarJCB = new JComboBox();
		redesEliminarJCB.setPreferredSize(new Dimension(200,25));
		redesEliminarJCB.setMaximumRowCount(3);

		panelVacio0JP = new JPanel();
		panelVacio0JP.setPreferredSize(new Dimension(500,5));
		panelVacio1JP = new JPanel();
		panelVacio1JP.setPreferredSize(new Dimension(500,5));
		panelVacio2JP = new JPanel();
		panelVacio2JP.setPreferredSize(new Dimension(500,5));
		panelVacio3JP = new JPanel();
		panelVacio3JP.setPreferredSize(new Dimension(500,5));
		panelVacio4JP = new JPanel();
		panelVacio4JP.setPreferredSize(new Dimension(500,5));
		panelVacio5JP = new JPanel();
		panelVacio5JP.setPreferredSize(new Dimension(500,5));
		panelVacio7JP = new JPanel();
		panelVacio7JP.setPreferredSize(new Dimension(500,5));
		panelVacio8JP = new JPanel();
		panelVacio8JP.setPreferredSize(new Dimension(500,5));
		panelVacio6JP = new JPanel();
		panelVacio6JP.setPreferredSize(new Dimension(500,5));
		panelVacio9JP = new JPanel();
		panelVacio9JP.setPreferredSize(new Dimension(500,5));
		panelVacio10JP = new JPanel();
		panelVacio10JP.setPreferredSize(new Dimension(500,5));
		panelVacio11JP = new JPanel();
		panelVacio11JP.setPreferredSize(new Dimension(500,5));

		panelTituloCrearJP = new JPanel();
		panelTituloCrearJP.setLayout(new FlowLayout());
		panelTituloCrearJP.setPreferredSize(new Dimension(500,25));

		panelTituloEntrenarJP = new JPanel();
		panelTituloEntrenarJP.setLayout(new FlowLayout());
		panelTituloEntrenarJP.setPreferredSize(new Dimension(500,25));

		panelTituloAplicarJP = new JPanel();
		panelTituloAplicarJP.setLayout(new FlowLayout());
		panelTituloAplicarJP.setPreferredSize(new Dimension(500,25));

		panelTituloMostrarJP = new JPanel();
		panelTituloMostrarJP.setLayout(new FlowLayout());
		panelTituloMostrarJP.setPreferredSize(new Dimension(500,25));

		panelTituloModificarJP = new JPanel();
		panelTituloModificarJP.setLayout(new FlowLayout());
		panelTituloModificarJP.setPreferredSize(new Dimension(500,25));

		panelTituloEliminarJP = new JPanel();
		panelTituloEliminarJP.setLayout(new FlowLayout());
		panelTituloEliminarJP.setPreferredSize(new Dimension(500,25));

		panelElementosCrearJP = new JPanel();
		panelElementosEntrenarJP = new JPanel();
		panelElementosAplicarJP = new JPanel();
		panelElementosMostrarJP = new JPanel();
		panelElementosModificarJP = new JPanel();
		panelElementosEliminarJP = new JPanel();

		panelCapaCrearRedJP = new JPanel();
		panelCapaCrearRedJP.setLayout(new FlowLayout());
		panelCapaEntrenarRedJP = new JPanel();
		panelCapaEntrenarRedJP.setLayout(new FlowLayout());
		panelCapaAplicarRedJP = new JPanel();
		panelCapaAplicarRedJP.setLayout(new FlowLayout());
		panelCapaMostrarRedJP = new JPanel();
		panelCapaMostrarRedJP.setLayout(new FlowLayout());
		panelCapaModificarRedJP = new JPanel();
		panelCapaModificarRedJP.setLayout(new FlowLayout());
		panelCapaEliminarRedJP = new JPanel();
		panelCapaEliminarRedJP.setLayout(new FlowLayout());

		panelPrincipalJTP = new JTabbedPane();

		panelTituloCrearJP.add(crearRedJL);
		panelTituloEntrenarJP.add(entrenarRedJL);
		panelTituloAplicarJP.add(aplicarRedJL);
		panelTituloMostrarJP.add(mostrarRedJL);
		panelTituloModificarJP.add(modificarRedJL);
		panelTituloEliminarJP.add(eliminarRedJL);

		panelCapaCrearRedJP.add(panelVacio0JP);
		panelCapaCrearRedJP.add(panelTituloCrearJP);
		panelCapaCrearRedJP.add(panelVacio1JP);
		
		panelCapaEntrenarRedJP.add(panelVacio2JP);
		panelCapaEntrenarRedJP.add(panelTituloEntrenarJP);
		panelCapaEntrenarRedJP.add(panelVacio3JP);

		panelCapaAplicarRedJP.add(panelVacio4JP);
		panelCapaAplicarRedJP.add(panelTituloAplicarJP);
		panelCapaAplicarRedJP.add(panelVacio5JP);
		
		panelCapaMostrarRedJP.add(panelVacio6JP);
		panelCapaMostrarRedJP.add(panelTituloMostrarJP);
		panelCapaMostrarRedJP.add(panelVacio7JP);

		panelCapaModificarRedJP.add(panelVacio8JP);
		panelCapaModificarRedJP.add(panelTituloModificarJP);
		panelCapaModificarRedJP.add(panelVacio9JP);

		panelCapaEliminarRedJP.add(panelVacio10JP);
		panelCapaEliminarRedJP.add(panelTituloEliminarJP);
		panelCapaEliminarRedJP.add(panelVacio11JP);

		panelPrincipalJTP.addTab("CREAR", null, panelCapaCrearRedJP, "Primer panel");
		panelPrincipalJTP.addTab("ENTRENAR", null, panelCapaEntrenarRedJP, "Segundo panel");
		panelPrincipalJTP.addTab("APLICAR", null, panelCapaAplicarRedJP, "Tercer panel");
		panelPrincipalJTP.addTab("MOSTRAR", null, panelCapaMostrarRedJP, "Cuarto panel");
		panelPrincipalJTP.addTab("MODIFICAR", null, panelCapaModificarRedJP, "Quinto panel");
		panelPrincipalJTP.addTab("ELIMINAR", null, panelCapaEliminarRedJP, "Sexto panel");

		add(panelPrincipalJTP);
	}
}