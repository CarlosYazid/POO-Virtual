package org.example.projectPolyhedron;

/**
 * Esta clase define el punto de ingreso al programa de figuras
 * geométricas. Por lo tanto, cuenta con un méeodo main de acceso al
 * programa.
 * @version 1.2/2025
 */
public class TestPolyhedron {
    
    /**
     * Metodo main que sirve de punto de entrada al programa
     */
    public static void main(String[] args) {
        MainWindow mainWindow; // Define la ventana principal
        mainWindow = new MainWindow(); // Crea la ventana principal
        mainWindow.setVisible(true); // Establece la ventana como visible
        // Establece que la ventana no puede cambiar su tamaño
        mainWindow.setResizable(false);
    }
}
