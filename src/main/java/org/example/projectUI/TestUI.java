package org.example.projectUI;

// Ejercicio 8.1

/**
 * Esta clase define el punto de ingreso al programa de gestión de
 * personas. Por lo tanto, cuenta con un metodo main de acceso al programa.
 * @version 1.2/2025
 */
public class TestUI {
    
    /**
     * Metodo main que sirve de punto de entrada al programa
     */
    public static void main(String[] args) {
        // Define la ventana principal
        MainWindow mainWindow = new MainWindow();
        
        // Crea la ventana principal
        mainWindow.setVisible(true); // Establece la ventana como visible
    }
}
