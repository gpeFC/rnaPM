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
 * Clase final que contiene las reglas de propagacion de la red. 
 */
public final class ReglaPropagacion{
	
	/**
	 * Metodo que calcula mediante la regla de propagacion el producto
	 * de los valores de entrada de la neurona ponderados por los pesos sinapticos neuronales.
	 * @param bias		Bias de la neurona.
	 * @param entrada	Datos presinpaticos de la neurona.
	 * @param pesos 	Pesos sinapticos de la neurona.
	 */
	public static double sumaPonderada(double bias, double[] entrada, double[] pesos){
		double potencial = 0.0;
		for(int i=0; i<pesos.length; i++){
			potencial = potencial + (pesos[i] * entrada[i]);
		}
		potencial = potencial + bias;
		return potencial;
	}
}
