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
 * Clase que instancia objetos -CapaNeuronal- que constituyen las capas
 * de neuronas de la topologia de la red. 
 */
public class CapaNeuronal{
	private int[] funciones;		// Indicador de funcion de activacion por neurona.
	private double[] delthas;		// Errores calculados de cada neurona.
	private double[] salidas;		// Salidas obtenidas de cada neurona.
	private double[] entradas;		// Entradas para cada neurona.
	private double[][] antiguos;	// Pesos anteriores de cada neurona.
	private Neurona[] neuronas;		// Neuronas de la capa.

	/**
     * Constructor de la clase -CapaNeuronal-
     * @param numNeurs		Numero de neuronas en la capa.
     * @param numArgs	    Numero de conexiones presinapticas de la capa.
     */
	public CapaNeuronal(int numNeurs, int numArgs){
		this.entradas = new double[numArgs];
		for(int i=0; i<numArgs; i++)
			this.entradas[i] = 0.0;
		this.funciones = new int[numNeurs];
		this.delthas = new double[numNeurs];
		this.salidas = new double[numNeurs];
		this.antiguos = new double[numNeurs][numArgs];
		this.neuronas = new Neurona[numNeurs];
		for(int i=0; i<numNeurs; i++){
			this.funciones[i] = 0;
			this.delthas[i] = 0.0;
			this.salidas[i] = 0.0;
			this.neuronas[i] = new Neurona(numArgs);
			for(int j=0; j<numArgs; j++)
				this.antiguos[i][j] = 0.0;
		}
	}

	/**
     * Metodo que permite establecer los indices que indican las 
     * funciones de activacion respectivas de cada neurona de la capa.
     * @param funciones 	Indices que indican la funcion de activacion de cada neurona.
     */
	public void establecerFunciones(int[] funciones){
		this.funciones = funciones;
	}

	/**
     * Metodo que permite establecer las entradas sinapticas de la capa neuronal.
     * @param entradas 	Entradas sinapticas de la capa neuronal.
     */
	public void establecerEntrada(double[] entradas){
		this.entradas = entradas;
	}

	/**
     * Metodo que permite establecer un mismo factor de aprendizaje en todas las
     * neuronas de la capa.
     * @param alpha 	Factor de aprendizaje de la red.
     */
	public void establecerAlphas(double alpha){
		for(int i=0; i<this.neuronas.length; i++)
			this.neuronas[i].establecerAlpha(alpha);
	}

	/**
     * Metodo que permite establecer un factor de aprendizaje diferente para cada
     * neurona de la capa.
     */
	public void establecerAlphas(){
		double alpha=0.0;
		for(int i=0; i<this.neuronas.length; i++){
			do{
				Random pseudoAleatorio = new Random();
				alpha = pseudoAleatorio.nextDouble();
			}while(alpha == 0.0);
			this.neuronas[i].establecerAlpha(alpha);
		}
	}

	/**
     * Metodo que permite recuperar el vector de indices de las funciones de activacion
     * de la capa.
     */
	public int[] obtenerFunciones(){
		return this.funciones;
	}

	/**
     * Metodo que permite recuperar el vector de errores asociados a cada neurona de la
     * capa para retropropagarlos.
     */
	public double[] obtenerDelthas(){
		return this.delthas;
	}

	/**
     * Metodo que permite recuperar el vector de las salidas calculadas de cada neurona
     * de la capa.
     */
	public double[] obtenerSalidas(){
		return this.salidas;
	}

	/**
     * Metodo que permite recuperar la matriz de pesos sinapticos de cada neurona de la capa.
     */
	public double[][] obtenerPesosActuales(){
		double[][] pesos = new double[this.neuronas.length][this.entradas.length];
		for(int i=0; i<this.neuronas.length; i++)
			pesos[i] =this.neuronas[i].obtenerPesos();
		return pesos;
	}

	/**
     * Metodo que permite recuperar la matriz de pesos sinapticos de la epoca anterior
     * de propagacion de las neuronas de la capa.
     */
	public double[][] obtenerPesosAntiguos(){
		return this.antiguos;
	}

	/**
     * Metodo que permite recuperar el vector de neuronas de la capa.
     */
	public Neurona[] obtenerNeuronas(){
		return this.neuronas;
	}

	public void actualizarAlphas(){
	}

	/**
     * Metodo que permite actualizar el valor de los biases de cada neurona de la capa.
     */
	public void actualizarBiases(){
		double biasActual, biasNuevo=0.0;
		for(int i=0; i<this.neuronas.length; i++){
			biasActual = this.neuronas[i].obtenerBias();
			biasNuevo = biasActual + (this.neuronas[i].obtenerAlpha() * this.delthas[i]);
			System.out.printf("\nUmb: (%f) = (%f) + [(%f)*(%f)]\n", biasNuevo, biasActual, this.neuronas[i].obtenerAlpha(), this.delthas[i]);
			this.neuronas[i].establecerUmbral(biasNuevo);
		}
	}

	/**
     * Metodo que permite actualizar el valor de los pesos sinapticos de cada neurona
     * de la capa.
     * @param eta 		Error retropropagado para actualizar los pesos sinapticos.
     * @param indice 	Indice para cotejar la neurona  a ser actualizada.
     */
	public void actualizarPesos(double eta, int indice){
		double[] pesosActuales;
		double[] pesosNuevos = new double[this.entradas.length];
		for(int i=0; i<this.neuronas.length; i++){
			pesosActuales = this.neuronas[i].obtenerPesos();
			if(indice == 1){
				for(int j=0; j<this.entradas.length; j++)
					pesosNuevos[j] = pesosActuales[j] + (this.neuronas[i].obtenerAlpha() * this.delthas[i] * this.entradas[j]);
				this.neuronas[i].establecerPesos(pesosNuevos);
			}
			else if(indice == 2){
				for(int j=0; j<this.entradas.length; j++){
					pesosNuevos[j] = pesosActuales[j] + (this.neuronas[i].obtenerAlpha() * this.delthas[i] * this.entradas[j]);
					pesosNuevos[j] = pesosNuevos[j] + (eta * this.antiguos[i][j]);
					this.antiguos[i][j] = pesosActuales[j] - pesosNuevos[j];
				}
				this.neuronas[i].establecerPesos(pesosNuevos);
			}
		}
	}

	/**
     * Metodo que permite calcular el error ponderado cometido por cada neurona de 
     * la capa de salida para poder retropropagarlos.
     * @param errores 		Vector de errores cometidos por cada neurona de la capa de salida.
     */
	public void calcularDelthas(double[] errores){
		for(int i=0; i<this.neuronas.length; i++){
			if(this.funciones[i] == 1)
				this.delthas[i] = errores[i] * Activacion.derivadaFuncionIdentidad(ReglaPropagacion.sumaPonderada(this.neuronas[i].obtenerBias(), this.entradas, this.neuronas[i].obtenerPesos()));
			else if(this.funciones[i] == 2)
				this.delthas[i] = errores[i] * Activacion.derivadaFuncionLogistica(ReglaPropagacion.sumaPonderada(this.neuronas[i].obtenerBias(), this.entradas, this.neuronas[i].obtenerPesos()));
			else if(this.funciones[i] == 3)
				this.delthas[i] = errores[i] * Activacion.derivadaFuncionTangencial(ReglaPropagacion.sumaPonderada(this.neuronas[i].obtenerBias(), this.entradas, this.neuronas[i].obtenerPesos()));
			else if(this.funciones[i] == 4)
				this.delthas[i] = errores[i] * Activacion.derivadaFuncionHiperbolica(ReglaPropagacion.sumaPonderada(this.neuronas[i].obtenerBias(), this.entradas, this.neuronas[i].obtenerPesos()));
		}
	}

	/**
     * Metodo que permite calcular el error ponderado cometido por cada neurona de 
     * las capas ocultas para poder retropropagarlos.
     * @param delthas 		Errores ponderados de cada neurona de la capa posterior.
     * @param neuronas 		Vector de neuronas de la capa posterior.
     */
	public void calcularDelthas(double[] deltas, Neurona[] neuronas){
		double sumaDeltha, pesos[];
		for(int i=0; i<this.neuronas.length; i++){
			sumaDeltha = 0.0;
			for(int j=0; j<neuronas.length; j++){
				pesos = neuronas[j].obtenerPesos();
				sumaDeltha = sumaDeltha + (deltas[j]*pesos[i]);
			}
			if(this.funciones[i] == 1)
				this.delthas[i] = Activacion.derivadaFuncionIdentidad(ReglaPropagacion.sumaPonderada(this.neuronas[i].obtenerBias(), this.entradas, this.neuronas[i].obtenerPesos()))*sumaDeltha;
			else if(this.funciones[i] == 2)
				this.delthas[i] = Activacion.derivadaFuncionLogistica(ReglaPropagacion.sumaPonderada(this.neuronas[i].obtenerBias(), this.entradas, this.neuronas[i].obtenerPesos()))*sumaDeltha;
			else if(this.funciones[i] == 3)
				this.delthas[i] = Activacion.derivadaFuncionTangencial(ReglaPropagacion.sumaPonderada(this.neuronas[i].obtenerBias(), this.entradas, this.neuronas[i].obtenerPesos()))*sumaDeltha;
			else if(this.funciones[i] == 4)
				this.delthas[i] = Activacion.derivadaFuncionHiperbolica(ReglaPropagacion.sumaPonderada(this.neuronas[i].obtenerBias(), this.entradas, this.neuronas[i].obtenerPesos()))*sumaDeltha;
		}
	}

	/**
     * Metodo que permite calcular y almacenar en un vector las salidas
     * de cada neurona de la capa.
     */
	public void calcularSalidas(){
		for(int i=0; i<this.neuronas.length; i++){
			this.neuronas[i].calcularSalida(this.funciones[i], this.entradas);
			this.salidas[i] = this.neuronas[i].obtenerSalida();
		}
	}

	/**
     * Metodo que permite calcular el incremento ponderado en los pesos sinapticos
     * de las neuronas de la capa respecto a sus respectivos pesos en la epoca anterior.
     * @param indice 			Indice para cotejar la neurona que esta siendo verificada.
     * @param presosPrevios		Vector de pesos sinapticos de las neuronas de la capa en la epoca anterior.
     * @param pesosActuales		Vector de pesos sinapticos actuales de las neuronas de la capa.
     */
	public void calcularIncremento(int indice, double[] pesosPrevios, double[] pesosActuales){
		for(int i=0; i<pesosPrevios.length; i++)
			this.antiguos[indice][i] = pesosPrevios[i] - pesosActuales[i];
	}

	public void mostrarDatosCapa(){
		double[] pesos;
		for(int i=0; i<neuronas.length; i++){
			System.out.printf("\nNeurona (%d) {", i+1);
			System.out.printf("Alpha:(%f) |", neuronas[i].obtenerAlpha());
			System.out.printf(" Umbral:(%f) |", neuronas[i].obtenerBias());
			pesos = neuronas[i].obtenerPesos();
			System.out.printf(" Pesos:[");
			for(int j=0; j<pesos.length; j++)
				System.out.printf("(%f)", pesos[j]);
			System.out.printf("]}");
		}
	}
}
