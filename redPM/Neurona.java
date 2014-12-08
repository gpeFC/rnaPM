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
 * Clase que instancia objetos -Neurona- que constituyen la red. 
 */
public class Neurona{
	private double alpha;	// Tasa de aprendizaje.
	private double bias;	// Bias.
	private double salida;	// Respuesta de salida.
	private double[] pesos; // Pesos sinapticos.

	/**
     * Constructor de la clase -Neurona-
     * @param numArgs     Numero de conexiones presinapticas de la neurona.
     */
	public Neurona(int numArgs){
		this.alpha = 0.0;
		this.salida = 0.0;
		do{
			Random pseudoAleatorio = new Random();
			this.bias = pseudoAleatorio.nextDouble();	// Inicialización aleatoria del bias.
		}while(this.bias == 0.0);
		this.pesos = new double[numArgs];
		for(int i=0; i<numArgs; i++){
			do{
				Random pseudoAleatorio = new Random();
				this.pesos[i] = pseudoAleatorio.nextDouble();	// Inicialización aleatoria de los pesos sinapticos.
			}while(this.pesos[i]==0.0);
		}
	}

	/**
     * Metodo que permite establecer el factor de aprendizaje
     * de la neurona para controlar la actualizacion de los parametros neuronales.
     * @param alpha     Factor de aprendizaje de la neurona.
     */
	public void establecerAlpha(double alpha){
		this.alpha = alpha;
	}

	/**
     * Metodo que permite establecer el bias de la neurona.
     * @param bias     Bias de la neurona.
     */
	public void establecerUmbral(double bias){
		this.bias = bias;
	}

	/**
     * Metodo que permite establecer los pesos sinapticos de la neurona.
     * @param pesos     Pesos sinapticos de la neurona.
     */
	public void establecerPesos(double[] pesos){
		this.pesos = pesos;
	}

	/**
     * Metodo que permite recuperar el factor de aprendizaje de la neurona.
     */
	public double obtenerAlpha(){
		return this.alpha;
	}

	/**
     * Metodo que permite recuperar el bias de la neurona.
     */
	public double obtenerBias(){
		return this.bias;
	}

	/**
     * Metodo que permite recuperar los pesos sinapticos de la neurona.
     */
	public double[] obtenerPesos(){
		return this.pesos;
	}

	/**
     * Metodo que permite recuperar la salida sinaptica de la neurona.
     */
	public double obtenerSalida(){
		return this.salida;
	}

	/**
     * Metodo que permite calcular la salida sinaptica de la neurona.
     * @param funcion     Indice que indica cual funcion de activacion efectua la neurona.
     * @param entrada     Datos presinapticos de la neurona.
     */
	public void calcularSalida(int funcion, double[] entrada){
        if(funcion == 1)
            this.salida = Activacion.identidadLineal(ReglaPropagacion.sumaPonderada(this.bias, entrada, this.pesos));
        else if(funcion == 2)
            this.salida = Activacion.sigmoideLogistico(ReglaPropagacion.sumaPonderada(this.bias, entrada, this.pesos));
        else if(funcion == 3)
            this.salida = Activacion.sigmoideTangencial(ReglaPropagacion.sumaPonderada(this.bias, entrada, this.pesos));
        else if(funcion == 4)
            this.salida = Activacion.sigmoideHiperbolico(ReglaPropagacion.sumaPonderada(this.bias, entrada, this.pesos));
	}
}
