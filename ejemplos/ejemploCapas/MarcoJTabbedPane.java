import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class MarcoJTabbedPane extends JFrame{
	public MarcoJTabbedPane(){
		super("Demo de JTabbedPane ");

		JTabbedPane panelFichas = new JTabbedPane(); // crea objeto JTabbedPane

		// establece pane11 y lo agrega al objeto JTabbedPane
		JLabel etiqueta1 = new JLabel( "panel uno", SwingConstants.CENTER );
		JPanel panel1 = new JPanel(); // crea el primer panel
		panel1.add( etiqueta1 ); // agrega etiqueta al panel
		panelFichas.addTab( "Ficha uno", null, panel1, "Primer panel" );

		// establece panel2 y lo agrega al objeto JTabbedPane
		JLabel etiqueta2 = new JLabel( "panel dos", SwingConstants.CENTER );
		JPanel panel2 = new JPanel(); // crea el segundo panel
		panel2.setBackground( Color.YELLOW ); // establece el color de fondo en amarillo
		panel2.add( etiqueta2 ); // agrega etiqueta al panel
		panelFichas.addTab( "Ficha dos", null, panel2, "Segundo panel" );

		// establece panel3 y lo agrega al objeto JTabbedPane
		JLabel etiqueta3 = new JLabel( "panel tres" );
		JPanel panel3 = new JPanel(); // crea el tercer panel
		panel3.setLayout( new BorderLayout() ); // usa esquema Borderlayout
		panel3.add( new JButton( "Norte" ), BorderLayout.NORTH );
		panel3.add( new JButton( "Oeste" ), BorderLayout.WEST );
		panel3.add( new JButton( "Este" ), BorderLayout.EAST );
		panel3.add( new JButton( "Sur" ), BorderLayout.SOUTH );
		panel3.add( etiqueta3, BorderLayout.CENTER );
		panelFichas.addTab( "Ficha tres", null, panel3, "Tercer panel" );
		
		add( panelFichas );
	}
}