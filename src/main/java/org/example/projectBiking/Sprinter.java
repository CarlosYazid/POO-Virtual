package org.example.projectBiking;

/**
 * Esta clase denominada Sprinter es un tipo de Ciclista caracterizado
 * por poseer gran potencia y alta velocidad punta en esfuerzos cortos.
 * Posee nuevos atributos como la potencia promedio y la velocidad promedio
 * @version 1.2/2025
 */
public class Sprinter extends Biker{
    
    // Atributo que define la potencia promedio de un velocista
    private double averagePower;
    
    // Atributo que define la velocidad promedio de un velocista
    private double averageSpeed;
    
    /**
     * Constructor de la clase Sprinter
     * @param id Parámetro que define el identificador de un velocista
     * @param name Parámetro que define el nombre de un velocista
     * @param averagePower Parámetro que define la potencia promedio de un velocista
     * @param averageSpeed Parámetro que define la velocidad promedio de un velocista
     */
    public Sprinter (int id, String name, double averagePower, double averageSpeed) {
        super(id, name);
        this.averagePower = averagePower;
        this.averageSpeed = averageSpeed;
    }
    
    /**
     * Metodo que devuelve la potencia promedio de un velocista
     * @return La potencia promedio de un velocista
     */
    protected double getAveragePower() {
        return averagePower;
    }
    
    /**
     * Metodo que establece la potencia promedio de un velocista
     * @param averagePower Parámetro que especifica la potencia promedio de un velocista
     */
    protected void setAveragePower(double averagePower) {
        this.averagePower = averagePower;
    }
    
    /**
     * Metodo que devuelve la velocidad promedio de un velocista
     * @return La velocidad promedio de un velocista
     */
    protected double getAverageSpeed() {
        return averageSpeed;
    }
    
    /**
     * Metodo que establece la velocidad promedio de un velocista
     * @param averageSpeed Parámetro que especifica la velocidad promedio de un
     * velocista
     */
    protected void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }
    
    /**
     * Metodo que muestra en pantalla los datos de un velocista
     */
    @Override
    protected void info() {
        super.info(); // Invoca al metodo imprimir de la clase padre
        System.out.println("Potencia promedio = " + averagePower +
                "\nPotencia de speed = " + averageSpeed);
    }
    
    /**
     * Metodo que devuelve el tipo de ciclista
     * @return Un valor String con el texto “Es un velocista”
     */
    @Override
    String type () {
        return "Es un velocista";
    }
}
