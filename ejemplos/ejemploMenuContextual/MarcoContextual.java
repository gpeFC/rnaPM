// Fig. 22.7: MarcoContextual.java
// Demostración de los objetos JPopupMenu.
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.ButtonGroup;

public class MarcoContextual extends JFrame{
	private JRadioButtonMenuItem elementos[];
	private final Color valoresColores[] = {Color.BLUE, Color.YELLOW, Color.RED };
	private JPopupMenu menuContextual;

	public MarcoContextual(){
		super( "Uso de objetos JPopupMenu" );
		
		ManejadorElementos manejador = new ManejadorElementos();
		String colores[] = {"Azul", "Amarillo", "Rojo"};
		
		ButtonGroup grupoColores = new ButtonGroup();
		menuContextual = new JPopupMenu();
		elementos = new JRadioButtonMenuItem[3];

		for(int cuenta = 0; cuenta < elementos.length; cuenta++){
			elementos[ cuenta ] = new JRadioButtonMenuItem( colores[ cuenta ] );
			menuContextual.add(elementos[cuenta]);
			grupoColores.add(elementos[cuenta]);
			elementos[cuenta].addActionListener(manejador);
		}

		setBackground( Color.WHITE );

		addMouseListener(new MouseAdapter(){
			// maneja el evento de oprimir el botón del ratón
			public void mousePressed( MouseEvent evento ){
				checkForTriggerEvent( evento ); // comprueba el desencadenador
			} // fin del método mousePressed


			// maneja el evento de liberación del botón del ratón
			public void mouseReleased( MouseEvent evento )
			{
			checkForTriggerEvent( evento ); // comprueba el desencadenador
			} // fin del método mouseReleased


			// determina si el evento debe desencadenar el menú contextual
			private void checkForTriggerEvent(MouseEvent evento){
				if ( evento.isPopupTrigger() )
					menuContextual.show(evento.getComponent(), 
						evento.getX(), evento.getY() );
			}
		});
	}

	// clase interna privada para manejar los eventos de los elementos de menú
	private class ManejadorElementos implements ActionListener{
		
		// procesa las selecciones de los elementos de menú
		public void actionPerformed(ActionEvent evento){
			// determina cuál elemento de menú se seleccionó
			for (int i = 0; i < elementos.length; i++){
				if(evento.getSource() == elementos[i]){
					getContentPane().setBackground(valoresColores[i]);
					return;
				}
			}
		}
	}
}