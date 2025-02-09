package org.example.projectQualifications;

import java.util.Arrays;

/**
 * Esta clase denominada Qualification define un array de notas numéricas de
 * tipo double.
 * @version 1.2/2025
 */
public class Qualification {
    
    public static final int DEFAULT_COUNT_OF_QUALIFICATIONS = 5;
    
    // Atributo que identifica un array de notas de tipo double
    double[] qualifications;
    
    /**
     * Constructor de la clase Qualification, instancia un array con
     * <i><b>DEFAULT_COUNT_OF_QUALIFICATIONS</b></i> notas de tipo double
     */
    public Qualification() {
        qualifications = new double[DEFAULT_COUNT_OF_QUALIFICATIONS];
    }
    
    /**
     * Constructor de la clase Qualification, instancia un array con <i>count</i> notas de tipo double
     * @param count cantidad de notas
     */
    public Qualification(int count) {
        qualifications = new double[count];
    }
    
    /**
     * Metodo que calcula el promedio de notas
     * @return El promedio de notas calculado
     */
    double computeAverage() {
        double sum = 0;
        for(double qualification : qualifications) { // Se recorre el array
            sum  += qualification; // Suma las notas del array
        }
        /* Obtiene el promedio como la división de la suma de notas sobre el total de notas */
        return (sum / qualifications.length);
    }
    
    /**
     * Metodo que calcula la desviación estándar del array de notas
     * @return La desviación estándar del array de notas
     */
    double computeDeviation() {
        double avg = computeAverage(); // Invoca el metodo para calcular el promedio
        double sum = 0;
        
        for (double qualification : qualifications) {
            // Aplica fórmula para la sumatoria de elementos
            sum += Math.pow(qualification - avg, 2);
        }
        return Math.sqrt (sum/qualifications.length); // Retorna el cálculo final de la desviación
    }
    
    /**
     * Metodo que calcula el valor menor del array de notas
     * @return El valor menor del array de notas
     */
    double lower() {
        return Arrays.stream(qualifications).min().orElse(qualifications[0]);
    }
    
    /**
     * Metodo que calcula el valor mayor del array de notas
     * @return El valor mayor del array de notas
     */
    double upper() {
        return Arrays.stream(qualifications).max().orElse(qualifications[qualifications.length - 1]);
    }
    
    public double[] getQualifications () {
        return qualifications;
    }
    
    public void setQualifications (double[] qualifications) {
        this.qualifications = qualifications;
    }
}
