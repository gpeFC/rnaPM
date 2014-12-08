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
 * Clase final que contiene las funciones de activacion admitidas y 
 * las respectivas derivadas de cada una para el calculo de la 
 * retropropagacion del error de la red. 
 */
public final class Activacion{

	/**
     * Metodo que calcula la activacion postsinaptica
     * de la neurona mediante la funcion lineal.
     * @param potencial     Potencial sinaptico de la neurona.
     */
    public static double identidadLineal(double potencial){
        return potencial;
    }

    /**
     * Metodo que calcula la activacion postsinaptica
     * de la neurona mediante la funcion logistica sigmoidal.
     * @param potencial     Potencial sinaptico de la neurona.
     */
    public static double sigmoideLogistico(double potencial){
        return (1.0 / (1.0 + (Math.pow(Math.E, -potencial))));
    }

    /**
     * Metodo que calcula la activacion postsinaptica
     * de la neurona mediante la funcion tangente sigmoidal.
     * @param potencial     Potencial sinaptico de la neurona.
     */
    public static double sigmoideTangencial(double potencial){
        return ((2.0 / (1.0 + (Math.pow(Math.E, -potencial)))) - 1.0);
    }

    /**
     * Metodo que calcula la activacion postsinaptica
     * de la neurona mediante la funcion tangente hiperbolica.
     * @param potencial     Potencial sinaptico de la neurona.
     */
    public static double sigmoideHiperbolico(double potencial){
        return (((Math.pow(Math.E, potencial)) - ((Math.pow(Math.E, -potencial)))) / ((Math.pow(Math.E, potencial)) + ((Math.pow(Math.E, -potencial)))));
    }

	/**
     * Metodo que calcula la derivada del potencial
     * sinaptico de la neurona de la funcion lineal para calcular el error a 
     * retropropagar.
     * @param potencial     Potencial sinaptico de la neurona.
     */
    public static double derivadaFuncionIdentidad(double potencial){
        return 1.0;
    }

   /**
     * Metodo que calcula la derivada del potencial
     * sinaptico de la neurona de la funcion logistica para calcular el error a 
     * retropropagar.
     * @param potencial     Potencial sinaptico de la neurona.
     */
    public static double derivadaFuncionLogistica(double potencial){
        return (Activacion.sigmoideLogistico((potencial) * (1 - Activacion.sigmoideLogistico(potencial))));
    }

    /**
     * Metodo que calcula la derivada del potencial
     * sinaptico de la neurona de la funcion tangente sigmoidal para calcular el 
     * error a retropropagar.
     * @param potencial     Potencial sinaptico de la neurona.
     */
    public static double derivadaFuncionTangencial(double potencial){
        return (2*(Math.pow(Math.E, -potencial))) / Math.pow((1.0 + (Math.pow(Math.E, -potencial))), 2);
    }

    /**
     * Metodo que calcula la derivada del potencial
     * sinaptico de la neurona de la funcion tangente hiperbolica para calcular el 
     * error a retropropagar.
     * @param potencial     Potencial sinaptico de la neurona.
     */
    public static double derivadaFuncionHiperbolica(double potencial){
        return (1 - Math.pow(Activacion.sigmoideHiperbolico(potencial), 2));
    }
}
