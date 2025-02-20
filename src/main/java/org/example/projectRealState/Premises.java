package org.example.projectRealState;

/**
 * Esta clase denominada Premises modela un tipo específico de inmueble
 * que no está destinado para la vivienda que tiene como atributos un
 * tipo que especifica si es un local interno o que da a la calle.
 * @version 1.2/2025
 */
public class Premises extends Property {
    
    enum Type {INTERN,EXTERN} // Tipo de inmueble especificado como un valor enumerado
    protected Type type; // Atributo que identifica el tipo de inmueble
    
    /**
     * Constructor de la clase Premises
     * @param realStateId Parámetro que define el identificador inmobiliario de un local
     * @param area Parámetro que define el área de un local
     * @param address Parámetro que define la dirección donde se encuentra localizado un local
     * @param type Parámetro que define el tipo de local (interno o
     * que da a la calle)
     */
    public Premises (int realStateId, int area, String address, Type type) {
        super(realStateId, area, address);
        this.type = type;
    }
    
    public Premises () {
        this(0,0, null, null);
    }
    
    /**
     * Metodo que muestra en pantalla los datos de un local
     */
    @Override
    void info() {
        super.info(); // Invoca al metodo imprimir de la clase padre
        System.out.println("Tipo de local = " + type);
    }
    
}
