import javax.swing.JFrame;

public class PruebaContextual{
	public static void main(String args[]){
		MarcoContextual marcoContextual = new MarcoContextual(); // crea MarcoContextual
		marcoContextual.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		marcoContextual.setSize( 300, 200 ); // establece el tamaño del marco
		marcoContextual.setVisible( true ); // muestra el marco
	}
}