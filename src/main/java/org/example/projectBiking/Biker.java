package org.example.projectBiking;

/**
 * Esta clase abstracta denominada Biker posee como atributos un
 * identificador, un nombre y un tiempo acumulado en una carrera
 * ciclística.
 * @version 1.2/2025
 */
public abstract class Biker {
    
    // Atributo que define el identificador de un ciclista
    private int id;
    
    // Atributo que define el nombre del ciclista
    private String name;
    
    //Atributo que define el tiempo acumulado de un ciclista
    private int timeAccumulated = 0;
    
    //Atributo que define la posición general del ciclista
    private int overallPosition;
    
    /**
     * Constructor de la clase Biker
     * @param id Parámetro que define el identificador de un ciclista
     * @param name Parámetro que define el nombre completo de un ciclista
     */
    public Biker(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    /**
     * Metodo abstracto que muestra en pantalla el tipo específico de un
     * ciclista
     * @return Tipo de ciclista
     */
    abstract String type();
    
    /**
     * Metodo que devuelve el identificador de un ciclista
     * @return El identificador de un ciclista
     */
    protected int getId() {
        return id;
    }
    
    /**
     * Metodo que establece el identificador de un ciclista
     * @param id Parámetro que especifica el identificador de un ciclista
     */
    protected void setId(int id) {
        this.id = id;
    }
    
    /**
     * Metodo que devuelve el nombre de un ciclista
     * @return El nombre de un ciclista
     */
    protected String getName() {
        return name;
    }
    
    /**
     * Metodo que establece el nombre de un ciclista
     * @param name Parámetro que especifica el nombre de un ciclista
     */
    protected void setName(String name) {
        this.name = name;
    }
    
    /**
     * Metodo que devuelve el puesto que ocupa un ciclista en la
     * posición general de la competencia
     * @return El puesto del ciclista en la posición general
     */
    protected int getOverallPosition() {
        return overallPosition;
    }
    
    /**
     * Metodo que establece el puesto que ocupa un ciclista en la posición general
     * @param overallPosition Parametro que especifica el puesto que ocupa un ciclista en la
     *                        posición general
     */
    protected void setOverallPosition(int overallPosition) {
        this.overallPosition = overallPosition;
    }
    
    /**
     * Metodo que devuelve el tiempo acumulado de un ciclista en una competencia
     * @return El tiempo acumulado de un ciclista en una competencia
     */
    protected int getTimeAccumulated() {
        return timeAccumulated;
    }
    
    /**
     * Metodo que establece el tiempo acumulado por un ciclista
     * @param timeAccumulated Parámetro que especifica el tiempo acumulado por un ciclista
     */
    protected void setTimeAccumulated(int timeAccumulated) {
        this.timeAccumulated = timeAccumulated;
    }
    
    /**
     * Metodo muestra en pantalla los datos de un ciclista
     */
    protected void info() {
        System.out.println("Identificador = " + id +
                "\nNombre = " + name +
                "\nTipo = " + timeAccumulated);
    }
}
