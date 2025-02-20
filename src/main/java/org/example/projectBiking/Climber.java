package org.example.projectBiking;

/**
 * Esta clase denominada Climber es un tipo de Ciclista que se
 * encuentra mejor adaptado y se destaca cuando las carreteras son en
 * ascenso, ya sea en colinas o montañas. Posee nuevos atributos como
 * su aceleración promedio y el grado de rampa que soporta
 * @version 1.2/2025
 */
public class Climber extends Biker {
    
    // Atributo que define la acelaración promedio de un escalador
    private double averageAcceleration;
    
    // Atributo que define el grado de rampa soportado por un escalador
    private double inclinationDegree;

    /**
     * Constructor de la clase Climber
     * @param id Parámetro que define el identificador de un escalador
     * @param name Parámetro que define el nombre de un escalador
     * @param averageAcceleration Parámetro que define la aceleración promedio de un escalador
     * @param inclinationDegree Parámetro que define el grado de rampa de un escalador
     */
    public Climber(int id, String name, double
            averageAcceleration, double inclinationDegree) {
        super(id, name);
        this.averageAcceleration = averageAcceleration;
        this.inclinationDegree = inclinationDegree;
    }
    
    /**
     * Metodo que devuelve la aceleración promedio de un escalador
     * @return La aceleración promedio de un escalador
     */
    protected double getAverageAcceleration() {
        return averageAcceleration;
    }
    
    /**
     * Metodo que establece la aceleración promedio de un escalador
     * @param averageAcceleration Parámetro que especifica la aceleración promedio de un
     * escalador
     */
    protected void setAverageAcceleration(double
                                                  averageAcceleration) {
        this.averageAcceleration = averageAcceleration;
    }
    
    /**
     * Metodo que devuelve el grado de rampa soportado de un escalador
     * @return El grado de rampa soportado de un escalador
     */
    protected double getInclinationDegree() {
        return inclinationDegree;
    }
    
    /**
     * Metodo que establece el grado de rampa soportado por un escalador
     * @param inclinationDegree Parametro que especifica el grado de rampa soportado
     * por un escalador
     */
    protected void setInclinationDegree(double inclinationDegree) {
        this.inclinationDegree = inclinationDegree;
    }
    
    /**
     * Metodo que muestra en pantalla los datos de un escalador
     */
    @Override
    protected void info() {
        super.info(); // Invoca el metodo imprimir de la clase padre
        System.out.println("Aceleración promedio = " + averageAcceleration +
                "\nGrado de inclinación = " + inclinationDegree
        );
    }
    
    /**
     * Metodo que devuelve el tipo de ciclista
     * @return Un valor String con el texto “Es un escalador”
     */
    @Override
    String type () {
        return "Es un escalador";
    }
}
