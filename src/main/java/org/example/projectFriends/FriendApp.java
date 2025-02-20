package org.example.projectFriends;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class FriendApp {
    
    private JFrame frame;
    private JTextField nameField, numberField;
    private JTextField oldNameField, oldNumberField, newNameField, newNumberField;
    private JComboBox<String> friendDropdown;
    private JTextArea friendDisplay;
    
    public FriendApp() {
        // Inicialización o carga de datos (suponiendo que FriendController.file() lo requiere)
        FriendController.file();
        
        // Configuración del frame principal
        frame = new JFrame("Gestor de Contactos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 800);
        frame.setLocationRelativeTo(null); // Centrar la ventana
        
        // Panel principal con BoxLayout vertical y margen
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        frame.add(mainPanel);
        
        // Panel para agregar amigos
        JPanel addPanel = new JPanel(new GridBagLayout());
        addPanel.setBorder(new TitledBorder("Agregar Amigo"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        addPanel.add(new JLabel("Nombre:"), gbc);
        
        gbc.gridx = 1;
        nameField = new JTextField(15);
        addPanel.add(nameField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        addPanel.add(new JLabel("Número:"), gbc);
        
        gbc.gridx = 1;
        numberField = new JTextField(15);
        addPanel.add(numberField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton addButton = new JButton("Agregar");
        addPanel.add(addButton, gbc);
        
        mainPanel.add(addPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        
        // Panel para listar y eliminar amigos
        JPanel listPanel = new JPanel(new GridBagLayout());
        listPanel.setBorder(new TitledBorder("Eliminar amigo"));
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        listPanel.add(new JLabel("Seleccionar Amigo:"), gbc);
        
        gbc.gridx = 1;
        friendDropdown = new JComboBox<>();
        listPanel.add(friendDropdown, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton deleteButton = new JButton("Eliminar");
        listPanel.add(deleteButton, gbc);
        
        mainPanel.add(listPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        
        // Panel para actualizar amigos con nuevos campos para datos antiguos
        JPanel updatePanel = new JPanel(new GridBagLayout());
        updatePanel.setBorder(new TitledBorder("Actualizar Amigo"));
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        
        // Campos para datos antiguos
        gbc.gridx = 0;
        gbc.gridy = 0;
        updatePanel.add(new JLabel("Antiguo Nombre:"), gbc);
        
        gbc.gridx = 1;
        oldNameField = new JTextField(15);
        updatePanel.add(oldNameField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        updatePanel.add(new JLabel("Antiguo Número:"), gbc);
        
        gbc.gridx = 1;
        oldNumberField = new JTextField(15);
        updatePanel.add(oldNumberField, gbc);
        
        // Campos para datos nuevos
        gbc.gridx = 0;
        gbc.gridy = 2;
        updatePanel.add(new JLabel("Nuevo Nombre:"), gbc);
        
        gbc.gridx = 1;
        newNameField = new JTextField(15);
        updatePanel.add(newNameField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        updatePanel.add(new JLabel("Nuevo Número:"), gbc);
        
        gbc.gridx = 1;
        newNumberField = new JTextField(15);
        updatePanel.add(newNumberField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton updateButton = new JButton("Actualizar");
        updatePanel.add(updateButton, gbc);
        
        mainPanel.add(updatePanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        
        // Panel para mostrar el detalle de amigos
        JPanel displayPanel = new JPanel(new BorderLayout());
        displayPanel.setBorder(new TitledBorder("Detalle de Amigos"));
        friendDisplay = new JTextArea();
        friendDisplay.setEditable(false);
        friendDisplay.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(friendDisplay);
        displayPanel.add(scrollPane, BorderLayout.CENTER);
        displayPanel.setPreferredSize(new Dimension(450, 150));
        mainPanel.add(displayPanel);
        
        // Configuración de los ActionListeners para cada botón
        addButton.addActionListener(e -> {
            FriendController.addFriend(nameField.getText(), numberField.getText());
            FriendController.updateFriendList(friendDropdown, friendDisplay);
        });
        
        deleteButton.addActionListener(e -> {
            FriendController.deleteFriend((String) friendDropdown.getSelectedItem());
            FriendController.updateFriendList(friendDropdown, friendDisplay);
        });
        
        updateButton.addActionListener(e -> {
            // Se utiliza la información de los campos antiguos y nuevos para actualizar el amigo
            FriendController.updateFriend(oldNameField.getText(), oldNumberField.getText(),
                    newNameField.getText(), newNumberField.getText());
            FriendController.updateFriendList(friendDropdown, friendDisplay);
        });
        
        // Inicialización de la lista de amigos
        FriendController.updateFriendList(friendDropdown, friendDisplay);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(FriendApp::new);
    }
}
