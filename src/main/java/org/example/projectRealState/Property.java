package org.example.projectRealState;

/**
 * Esta clase denominada Property modela un inmueble que posee
 * como atributos un realStateId, un área, una dirección y un precio
 * de venta. Es la clase raíz de una jerarquía de herencia.
 * @version 1.2/2020
 */
public class Property {
    // Atributo para el identificador inmobiliario de un inmueble
    protected int realStateId;
    
    // Atributo que identifica el área de un inmueble
    protected int area;
    
    // Atributo que identifica la dirección de un inmueble
    protected String address;
    
    // Atributo que identifica el precio de venta de un inmueble
    protected double salePrice;
    
    /**
    * Constructor de la clase Inmueble
    * @param realStateId Parámetro que define el identificador de un inmueble
    * @param area Parámetro que define el área de un inmueble
    * @param address Parámetro que define la dirección donde se encuentra localizado un inmueble
    */
    public Property(int realStateId, int area, String address) {
        this.realStateId = realStateId;
        this.area = area;
        this.address = address;
    }
    
    public Property() {
        this(0, 0, null);
    }
    
    /**
     * Metodo que a partir del valor del área de un inmueble, calcula su precio de venta
     * @param rateArea El valor unitario por área de un determinado inmueble
     * @return Precio de venta del inmueble
     */
    double computeSalePrice(double rateArea) {
        salePrice = area * rateArea;
        return salePrice;
    }
    
    /**
     * Metodo que muestra en pantalla los datos de un inmueble
     */
    void info() {
        System.out.println("Identificador inmobiliario = " + realStateId +
                "\nArea = " + area +
                "\nDirección = " + address +
                "\nPrecio de venta = $" + salePrice
        );
    }
}
