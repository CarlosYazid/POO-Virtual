package org.example.projectBiking;

/**
 * Esta clase denominada TimeTrailBiker es un tipo de Ciclista que se
 * encuentra mejor adaptado a las etapas contrarreloj. Posee un nuevo
 * atributo: su velocidad máxima
 * @version 1.2/2025
 */
public class TimeTrailBiker extends Biker {
    
    // Atributo que define la velocidad máxima de un contrarrelojista
    private double maximumSpeed;
    
    /**
     * Constructor de la clase TimeTrailBiker
     * @param id Parámetro que define el identificador de un contrarrelojista
     * @param name Parámetro que define el nombre de un contrarrelojista
     * @param maximumSpeed Parámetro que define la velocidad
     * máxima de un contrarrelojista
     */
    public TimeTrailBiker(int id, String name, double
            maximumSpeed) {
        super(id, name);
        this.maximumSpeed = maximumSpeed;
    }
    
    /**
     * Metodo que devuelve la velocidad máxima de un contrarrelojista
     * @return La velocidad máxima de un contrarrelojista
     */
    protected double getMaximumSpeed() {
        return maximumSpeed;
    }
    
    /**
     * Metodo que establece la velocidad máxima de un contrarrelojista
     * @param maximumSpeed Parámetro que especifica la velocidad máxima de un
     * contrarrelojista
     */
    protected void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }
    
    /**
     * Metodo que muestra en pantalla los datos de un contrarrelojista
     */
    @Override
    protected void info() {
        super.info(); // Invoca el metodo imprimir de la clase padre
        System.out.println("Aceleración promedio = " + maximumSpeed);
    }
    
    /**
     * Metodo que devuelve el tipo de ciclista
     * @return Un valor String con el texto “Es un constrarrelojista”
     */
    @Override
    String type () {
        return "Es un constrarrelojista";
    }
}
