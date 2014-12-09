import java.util.ArrayList;
import java.util.Random;

/**
 * UAEM, Facultad de Ciencias
 * Seminario de Programacion II
 * Proyecto Final
 * .:Constructor de Resdes Neuronales Artificiales
 *   tipo Perceptron Multicapa con Retropropagacion
 * @author :: Emanuel Garcia Perez
 *
 */

/**
 * Clase que instancia objetos -RedNeuronal- que son en escencia cada uno de ellos
 * una red neuronal en si. 
 */
public class RedNeuronal{
	private String nombreRed;
	private String configuracionAlphas;
	private String configuracionFunciones;
	private ArrayList<CapaNeuronal> redNeuronal;

	/**
     * Constructor de la clase -RedNeuronal-
     * @param nombreRed			Nombre para identificar a la red.
     * @param configAlphas	    Configuracion del factor de aprendizaje de la red.
     * @param configFunciones	Configuracion de las funciones de activacion de la red.
     */
	public RedNeuronal(String nombreRed, String configAlphas, String configFunciones){
		this.nombreRed = nombreRed;
		this.configuracionAlphas = configAlphas;
		this.configuracionFunciones = configFunciones;
		this.redNeuronal = null;
	}

	/**
     * Metodo que permite recuperar el nombre de la red.
     */
	public String obtenerNombreRed(){
		return this.nombreRed;
	}

	/**
     * Metodo que permite recuperar el vector de capas neuronales de la red.
     */
	public ArrayList<CapaNeuronal> obtenerRedNeuronal(){
		return this.redNeuronal;
	}

	/**
     * Metodo que permite establecer el nombre de la red.
     */
	public void establecerNombreRed(String nombreRed){
		this.nombreRed = nombreRed;
	}

	/**
     * Metodo que permite establecer la configuracion del factor de aprendizaje de la red.
     */
	public void establecerConfiguracionAlphas(String configuracionAlphas){
		this.configuracionAlphas = configuracionAlphas;
	}

	/**
     * Metodo que permite establecer el valor del factor de aprendizaje de la red segun la configuracion elegida.
     * @param indice 	Indice que permite cotejar la configuracion del factor de aprendizaje de la red a ser establecida.
     */
	public void establecerConfiguracionAlphas(int indice){ // Generar config: Alphas/Neurona Aqui.:
		double alpha=0.0;
		CapaNeuronal capa;
		if(indice == 1){
			do{
				Random pseudoAleatorio = new Random();
				alpha = pseudoAleatorio.nextDouble();
			}while(alpha == 0.0);
			for(int i=0; i<this.redNeuronal.size(); i++){
				capa = this.redNeuronal.get(i);
				capa.establecerAlphas(alpha);
			}
		}
		else if(indice == 2){
			for(int i=0; i<this.redNeuronal.size(); i++){
				capa = this.redNeuronal.get(i);
				do{
					Random pseudoAleatorio = new Random();
					alpha = pseudoAleatorio.nextDouble();
				}while(alpha == 0.0);
				capa.establecerAlphas(alpha);
			}
		}
		else if(indice == 3){
			for(int i=0; i<this.redNeuronal.size(); i++){
				capa = this.redNeuronal.get(i);
				capa.establecerAlphas();
			}
		}
	}

	/**
     * Metodo que permite establecer la configuracion de las funciones de activacion de la red.
     */
	public void establecerConfiguracionFunciones(String configuracionFunciones){
		this.configuracionFunciones = configuracionFunciones;
	}

	/**
     * Metodo que permite establecer la funcion de activacion correspondiente de cada neurona
     * de la red.
     * @param funciones 	Indices que indican la funcion de activacion de cada neurona.
     */
	public void establecerConfiguracionFunciones(int funcion, int numNeurs){
		int[] funciones = new int[numNeurs];
		CapaNeuronal capaNeuronal = this.redNeuronal.get(0);
		for(int i=0; i<numNeurs; i++)
			funciones[i] = funcion;
		capaNeuronal.establecerFunciones(funciones);
	}

	/**
     * Metodo que permite establecer una misma funcion de activacion asociada a cada neurona de la red.
     * @param funcion 			Indice que indica la funcion de activacion asociada a las neuronas de la red.
     * @param numNeursCapa		Vector de indices del numero de neuronas existentes en cada capa neuronal de la red.
     */
	public void establecerConfiguracionFunciones(int funcion, int[] numNeursCapa){
		int[] funciones;
		CapaNeuronal capa;
		for(int i=0; i<numNeursCapa.length; i++){
			capa = this.redNeuronal.get(i);
			funciones = new int[numNeursCapa[i]];
			for(int j=0; j<numNeursCapa[i]; j++)
				funciones[j] = funcion;
			capa.establecerFunciones(funciones);
		}
	}

	/**
     * Metodo que permite establecer una funcion de activacion asociada a cada neurona de la
     * capa de salida de la red y otra correspondiente a cada neurona de las capas ocultas de la red.
     * @param funcionSalida		 	Funcion de activacion correspondiente a las neuronas de la capa de salida de la red.
     * @param funcionOcultas 		Funcion de activacion correspondiente a las neuronas de las capas ocultas de la red.
     * @param numNeursCapa			Vector de indices del numero de neuronas existentes en cada capa neuronal de la red.
     */
	public void establecerConfiguracionFunciones(int funcionSalida, int funcionOcultas, int[] numNeursCapa){
		int[] funciones;
		CapaNeuronal capa;
		for(int i=0; i<numNeursCapa.length; i++){
			capa = this.redNeuronal.get(i);
			funciones = new int[numNeursCapa[i]];
			if(i == numNeursCapa.length-1){
				for(int j=0; j<numNeursCapa[i]; j++)
					funciones[j] = funcionSalida;
				capa.establecerFunciones(funciones);
			}
			else{
				for(int j=0; j<numNeursCapa[i]; j++)
					funciones[j] = funcionOcultas;
				capa.establecerFunciones(funciones);
			}
		}
	}

	/**
     * Metodo que permite establecer la funcion de activacion correspondiente de cada
     * neurona de una capa determinada de la red.
     * @param funciones 	Vector de indices de las funciones asociadas a cada neurona de la capa neuronal dada de la red.
     * @param indice 		Indice que coteja la capa neuronal asociada a las funciones de activacion a ser establecidas.
     */
	public void establecerConfiguracionFunciones(int[] funciones, int indice){
		CapaNeuronal capa;
		capa = this.redNeuronal.get(indice);
		capa.establecerFunciones(funciones);
	}

	/**
     * Metodo que permite inicializar el vector de capas neuronales de la red.
     * @param numArgs 		Longitud de las entradas sinapticas de la primer capa neuronal de la red.
     * @param numCapas		Numero de capas neuronales de la red.
     * @param numNeursCapa	Vector que indexa el numero de neuronas que habra en capa neuronal de la red.
     */
	public void establecerRedNeuronal(int numArgs, int numCapas, int[] numNeursCapa){
		CapaNeuronal capaNeuronal;
		this.redNeuronal = new ArrayList<CapaNeuronal>(numCapas);
		for(int i=0; i<numCapas; i++){
			if(i == 0){
				capaNeuronal = new CapaNeuronal(numNeursCapa[i], numArgs);
				this.redNeuronal.add(capaNeuronal);
			}
			else{
				capaNeuronal = new CapaNeuronal(numNeursCapa[i], numNeursCapa[i-1]);
				this.redNeuronal.add(capaNeuronal);
			}
		}
	}

	/**
     * Metodo que permite aplicar la red sobre datos no verificados una vez que ha 
     * sido entrenada satisfactoriamente.
     * @param entradas 	Datos de entrada sinapticos de la red a ser procesados.
     */
	public double[] aplicarRedNeuronal(double[][] entradas){
		double salida, salidas[], temporal[];
		salidas = new double[entradas.length];
		for(int i=0; i<entradas.length; i++){
			realizarPropagacion(entradas[i]);
			temporal = this.redNeuronal.get(this.redNeuronal.size()-1).obtenerSalidas();
			salida = 0.0;
			for(int j=0; j<temporal.length; j++)
				salida = salida + temporal[j];
			salida = salida / ((double)temporal.length);
			salidas[i] = salida;
		}
		return salidas;
	}

	/**
     * Metodo que permite realizar la propagacion de los datos de entrada sobre la red.
     * @param entradas 	Datos de entrada sinapticos de la red.
     */
	public void realizarPropagacion(double[] entradas){
		CapaNeuronal capa, previa;
		for(int i=0; i<this.redNeuronal.size(); i++){
			capa = this.redNeuronal.get(i);
			if(i == 0){
				capa.establecerEntrada(entradas);
				capa.calcularSalidas();
			}
			else{
				previa = this.redNeuronal.get(i-1);
				capa.establecerEntrada(previa.obtenerSalidas());
				capa.calcularSalidas();
			}
		}
	}

	/**
     * Metodo que permite realizar la retropropagacion de los errores ponderados de cada
     * neurona de la red.
     * @param salida 	Salida asociada a la propagacion de la epoca actual de la red.
     */
	public void realizarRetroPropagacion(double salida){
		double[] salidas, errores;
		Neurona[] neuronas;
		CapaNeuronal capa, previa;
		for(int i=this.redNeuronal.size()-1; i>=0; i--){
			capa = this.redNeuronal.get(i);
			if(i == this.redNeuronal.size()-1){
				salidas = capa.obtenerSalidas();
				errores = new double[salidas.length];
				for(int j=0; j<salidas.length; j++)
					errores[j] = salida - salidas[j];
				capa.calcularDelthas(errores);
			}
			else{
				previa = this.redNeuronal.get(i+1);
				errores = previa.obtenerDelthas();
				neuronas = previa.obtenerNeuronas();
				capa.calcularDelthas(errores, neuronas);
			}
		}
	}

	/**
     * Metodo que permite actualizar los parametros neuronales de la red.
     * @param indice 	Indice que permite cotejar la capa neuronal a ser actualizada.
     * @param eta 		Error calculado sera usado para ponderar la actualziacion de los parametros neuronales.
     */
	public void actualizarParametrosNeuronales(int indice, double eta){
		CapaNeuronal capa;
		for(int i=this.redNeuronal.size()-1; i>=0; i--){
			capa = this.redNeuronal.get(i);
			capa.actualizarBiases();
			capa.actualizarPesos(eta, indice);
		}
	}

	public void mostrarDatosPerceptron(){
		CapaNeuronal capa;
		System.out.printf("\nNombre:                  %s", this.nombreRed);
		System.out.printf("\nConfiguracion/TDA:       %s", this.configuracionAlphas);
		System.out.printf("\nConfiguracion/Funciones: %s", this.configuracionFunciones);
		for(int i=0; i<this.redNeuronal.size(); i++){
			capa = this.redNeuronal.get(i);
			System.out.printf("\nCapa (%d)", i+1);
			capa.mostrarDatosCapa();
		}
	}
}