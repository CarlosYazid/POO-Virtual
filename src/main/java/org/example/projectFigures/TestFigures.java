package org.example.projectFigures;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * Esta clase prueba diferentes acciones realizadas en diversas figuras
 * geométricas.
 * @version 1.2/2024
 */
public class TestFigures {
    
    /**
     * Metodo main que crea un círculo, un rectángulo, un cuadrado y
     * un triángulo rectángulo. Para cada uno de estas figuras geométricas,
     * se calcula su área y perímetro.
     */
    public static void main(String[] args) {
        
        /*
        Figure figura1 = new Circle(2);
        Figure figura2 = new Rectangle(1,2);
        Figure figura3 = new Square(3);
        Triangle figura4 = new TriangleRectangle(3,5);
        
        System.out.println("El área del círculo es = " + figura1.
                getArea());
        System.out.println("El perímetro del círculo es = " + figura1.
                getPerimeter() + "\n");
        
        System.out.println("El área del rectángulo es = " + figura2.
                getArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.
                getPerimeter() + "\n");
        
        System.out.println("El área del cuadrado es = " + figura3.
                getArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.
                getPerimeter() + "\n");
        
        System.out.println("El área del triángulo es = " + figura4.
                getArea());
        System.out.println("El perímetro del triángulo es = " + figura4.
                getPerimeter() + "\n");
        
        System.out.println("El triangulo es " + figura4.type());
        */
        
        UIManager.put("Label.font", new Font("Segoe UI", Font.PLAIN, 14));
        UIManager.put("Button.font", new Font("Segoe UI", Font.BOLD, 14));
        UIManager.put("ComboBox.font", new Font("Segoe UI", Font.PLAIN, 14));
        UIManager.put("TextField.font", new Font("Segoe UI", Font.PLAIN, 14));
        UIManager.put("Button.background", Color.WHITE);
        UIManager.put("Button.foreground", Color.DARK_GRAY);
        UIManager.put("ComboBox.border", BorderFactory.createLineBorder(Color.GRAY));
        
        // Mejoras al diseño y funcionalidad en la clase FiguresUI
        class FiguresUI extends JFrame {
            
            private final JComboBox<String> figureSelector;
            private final JPanel inputPanel;
            
            private JTextField radiusField;
            private JTextField widthField, heightField;
            private JTextField baseField;
            
            private final JLabel areaLabel;
            private final JLabel perimeterLabel;
            private final JLabel typeLabel = new JLabel("Tipo (para triángulos): Triángulo " +
                    "Rectangulo"); // Etiqueta para el tipo de triángulo rectángulo
            
            public FiguresUI() {
                
                setTitle("Figuras Geométricas");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(600, 500);
                setLayout(new BorderLayout());
                
                typeLabel.setVisible(false); // Etiqueta tipo de triangulo oculta por defecto.
                
                setContentPane(new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        Graphics2D g2d = (Graphics2D) g;
                        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                        Color color1 = new Color(235, 246, 255);
                        Color color2 = new Color(173, 216, 230);
                        GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
                        g2d.setPaint(gp);
                        g2d.fillRect(0, 0, getWidth(), getHeight());
                    }
                });
                
                // ** PANEL SUPERIOR: Selección de figura **
                JPanel topPanel = new JPanel(new FlowLayout());
                topPanel.setBorder(BorderFactory.createTitledBorder(
                        BorderFactory.createLineBorder(new Color(100, 149, 237)), // Color del borde
                        "Seleccione una figura",
                        0, 0, new Font("Segoe UI", Font.BOLD, 14), Color.BLACK)
                );
                topPanel.setBackground(new Color(235, 245, 255));
                
                figureSelector = new JComboBox<>(new String[]{"Círculo", "Rectángulo", "Cuadrado", "Triángulo Rectángulo"});
                figureSelector.addActionListener(new FigureSelectorListener());
                figureSelector.setRenderer(new DefaultListCellRenderer() {
                    @Override
                    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                        JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        switch (Objects.toString(value).trim()) {
                            case "Círculo" -> label.setIcon(new ImageIcon("src/main/java/org" +
                                    "/example/projectFigures/icons/circle.png"));
                            case "Rectángulo" -> label.setIcon(new ImageIcon("src/main/java/org/example/projectFigures/icons/rectangle.png"));
                            case "Cuadrado" -> label.setIcon(new ImageIcon("src/main/java/org/example/projectFigures/icons/square.png"));
                            case "Triángulo Rectángulo" -> label.setIcon(new ImageIcon("src/main/java/org/example/projectFigures/icons/traingle-rectangle.png"));
                        }
                        label.setHorizontalTextPosition(SwingConstants.RIGHT);
                        return label;
                    }
                });
                topPanel.add(figureSelector);
                
                add(topPanel, BorderLayout.NORTH);
                
                // ** PANEL CENTRAL: Campos de entrada **
                inputPanel = new JPanel(new GridBagLayout());
                inputPanel.setBorder(BorderFactory.createTitledBorder("Ingrese las dimensiones"));
                add(inputPanel, BorderLayout.CENTER);
                
                // ** PANEL INFERIOR: Resultados **
                JPanel resultPanel = new JPanel(new GridLayout(3, 1, 5, 5));
                resultPanel.setBorder(BorderFactory.createTitledBorder("Resultados"));
                resultPanel.setBackground(new Color(245, 245, 250));
                
                areaLabel = new JLabel("Área: ");
                perimeterLabel = new JLabel("Perímetro: ");
                
                resultPanel.add(areaLabel);
                resultPanel.add(perimeterLabel);
                resultPanel.add(typeLabel);
                
                add(resultPanel, BorderLayout.SOUTH);
                
                // ** BOTÓN: Calcular **
                JButton calculateButton = new JButton("Calcular");
                calculateButton.setBackground(new Color(0, 153, 255));
                calculateButton.setForeground(Color.WHITE);
                calculateButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
                calculateButton.setBorder(BorderFactory.createLineBorder(new Color(0, 102, 204)));
                calculateButton.setOpaque(true);
                calculateButton.addActionListener(new CalculateButtonListener());
                add(calculateButton, BorderLayout.EAST);
                
                // Configuración inicial
                setFigureInput("Círculo");
                setVisible(true);
            }
            
            private void setFigureInput(String figure) {
                inputPanel.removeAll(); // Limpiar panel de entrada.
                
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.insets = new Insets(10, 10, 10, 10);
                
                // Cambiar los campos según la figura seleccionada
                switch (figure) {
                    case "Círculo":
                        radiusField = new JTextField(10);
                        radiusField.setBorder(BorderFactory.createCompoundBorder(
                                BorderFactory.createLineBorder(new Color(173, 216, 230), 1),
                                BorderFactory.createEmptyBorder(5, 5, 5, 5)
                        ));
                        radiusField.setToolTipText("Ingrese el radio del círculo en unidades.");
                        inputPanel.add(new JLabel("Radio:"), gbc);
                        
                        gbc.gridx++;
                        inputPanel.add(radiusField, gbc);
                        break;
                    
                    case "Rectángulo":
                        widthField = new JTextField(10);
                        heightField = new JTextField(10);
                        
                        inputPanel.add(new JLabel("Ancho:"), gbc);
                        gbc.gridx++;
                        inputPanel.add(widthField, gbc);
                        
                        gbc.gridx = 0;
                        gbc.gridy++;
                        inputPanel.add(new JLabel("Altura:"), gbc);
                        gbc.gridx++;
                        inputPanel.add(heightField, gbc);
                        break;
                    
                    case "Cuadrado":
                        widthField = new JTextField(10);
                        
                        inputPanel.add(new JLabel("Lado:"), gbc);
                        gbc.gridx++;
                        inputPanel.add(widthField, gbc);
                        break;
                    
                    case "Triángulo Rectángulo":
                        baseField = new JTextField(10);
                        heightField = new JTextField(10);
                        
                        inputPanel.add(new JLabel("Base:"), gbc);
                        gbc.gridx++;
                        inputPanel.add(baseField, gbc);
                        
                        gbc.gridx = 0;
                        gbc.gridy++;
                        inputPanel.add(new JLabel("Altura:"), gbc);
                        gbc.gridx++;
                        inputPanel.add(heightField, gbc);
                        break;
                }
                
                inputPanel.revalidate();
                inputPanel.repaint();
            }
            
            private class FigureSelectorListener implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Obtén la figura seleccionada
                    String selectedFigure = (String) figureSelector.getSelectedItem();
                    
                    // Cambiar los campos de entrada según la figura seleccionada
                    setFigureInput(selectedFigure);
                    
                    // Muestra u oculta el label "Tipo (para triángulos)"
                    typeLabel.setVisible("Triángulo Rectángulo".equals(selectedFigure));
                    
                    // Limpia los resultados
                    areaLabel.setText("Área: ");
                    perimeterLabel.setText("Perímetro: ");
                    typeLabel.setText("Tipo:");
                }
            }
            
            private class CalculateButtonListener implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String selectedFigure = (String) figureSelector.getSelectedItem();
                    
                    try {
                        
                        Figure figure = switch (selectedFigure) {
                            case "Círculo" -> new Circle(Double.parseDouble(radiusField.getText()));
                            case "Rectángulo" -> new Rectangle(Double.parseDouble(widthField.getText()), Double.parseDouble(heightField.getText()));
                            case "Cuadrado" -> new Square(Double.parseDouble(widthField.getText()));
                            case "Triángulo Rectángulo" -> new TriangleRectangle(Double.parseDouble(baseField.getText()), Double.parseDouble(heightField.getText()));
                            default -> throw new IllegalArgumentException("Figura desconocida.");
                        };
                        
                        areaLabel.setText("Área: " + figure.getArea());
                        perimeterLabel.setText("Perímetro: " + figure.getPerimeter());
                        
                        if (figure instanceof Triangle triangle) {
                            typeLabel.setText("Tipo: " + triangle.type());
                        }
                        
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(FiguresUI.this, "Por favor, introduzca valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                    } catch (IllegalArgumentException ex) {
                        JOptionPane.showMessageDialog(FiguresUI.this, "Figura desconocida.", "Error", JOptionPane.ERROR_MESSAGE);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(FiguresUI.this, "Ha ocurrido un error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    
        new FiguresUI();
    }
}
