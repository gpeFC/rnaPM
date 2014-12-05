/******************************************************************************
 * UAEM, Facultad de Ciencias
 * Seminario de Programacion II
 * Emanuel GP
 *
 * Proyecto: Red Neuronal Artificial: Perceptron Multicapa con Retropropagacion
 ******************************************************************************/

import java.util.Random;

public class Neurona{
	private double alpha;	// Tasa de aprendizaje.
	private double bias;	// Bias.
	private double salida;	// Respuesta de salida.
	private double[] pesos; // Pesos sinapticos.

	/** Constructor para inicializar el objeto 'neurona'. */
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

	public void establecerAlpha(double alpha){
		this.alpha = alpha;
	}

	public void establecerUmbral(double bias){
		this.bias = bias;
	}

	public void establecerPesos(double[] pesos){
		this.pesos = pesos;
	}

	public double obtenerAlpha(){
		return this.alpha;
	}

	public double obtenerBias(){
		return this.bias;
	}

	public double[] obtenerPesos(){
		return this.pesos;
	}

	public double obtenerSalida(){
		return this.salida;
	}

	/** Método para calcular la respuesta de salida de la neurona respecto a los parámetros actuales. */
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
