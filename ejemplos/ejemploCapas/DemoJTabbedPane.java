import javax.swing.JFrame;

public class DemoJTabbedPane{
	public static void main( String args[] ){
		MarcoJTabbedPane marcoPanelFichas = new MarcoJTabbedPane();
		marcoPanelFichas.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		marcoPanelFichas.setSize( 350, 300 ); // establece el tamaño del marco
		marcoPanelFichas.setVisible( true ); // muestra el marco
	} // fin de main
}