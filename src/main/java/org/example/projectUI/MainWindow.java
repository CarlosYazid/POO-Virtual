package org.example.projectUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * Esta clase denominada MainWindow define una interfaz gráfica
 * que permitirá crear una persona y agregarla a un vector de personas.
 * Luego, se puede eliminar una persona seleccionada o borrar todas las
 * personas.
 * @version 1.2/2025
 */
public class MainWindow extends JFrame implements ActionListener {
    
    private PeopleList list; // El objeto PeopleList de la aplicación
    private Container container; // Un contenedor de elementos gráficos */
    private JLabel name, lastName, phone, address; // Etiquetas estáticas para los nombres delos
    // atributos
    private JTextField nameField, lastNameField, phoneField,
            addressField; // Campos de ingreso de texto
    private JButton add, delete, cleanList; // Botones
    private JList<String> nameList; // Lista de personas
    private DefaultListModel model; // Objeto que modela la lista
    private JScrollPane scrollList; // Barra de desplazamiento vertical
    
    public MainWindow() {
        list = new PeopleList(); // Crea la lista de personas
        start();
        setTitle("People"); // Establece el título de la ventana
        setSize(270,350); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); // La ventana se posiciona en centro de la pantalla
        // Establece que el botón de cerrar permitirá salir de la aplicación
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // Establece que el tamaño de la ventana no se puede cambiar
    }
    
    /**
     * Metodo que crea la ventana con sus diferentes componentes
     * gráficos
     */
    private void start() {
        container = getContentPane(); // Obtiene el panel de contenidos de la ventana */
        container.setLayout(null); // Establece que el panel no tiene asociado ningún layout */
        
        // Establece la etiqueta y el campo nombre
        name = new JLabel();
        name.setText("Nombre:");
        name.setBounds(20, 20, 135, 23); // Establece la posición de la etiqueta nombre
        nameField = new JTextField();
        // Establece la posición del campo de texto nombre
        nameField.setBounds(105, 20, 135, 23);
        
        // Establece la etiqueta y el campo apellidos
        lastName = new JLabel();
        lastName.setText("Apellidos:"); // Establece la posición de la etiqueta apellidos
        lastName.setBounds(20, 50, 135, 23);
        lastNameField = new JTextField();
        // Establece la posición del campo de texto apellidos
        lastNameField.setBounds(105, 50, 135, 23);
        
        // Establece la etiqueta y el campo teléfono
        phone = new JLabel();
        phone.setText("Teléfono:");
        phone.setBounds(20, 80, 135, 23); // Establece la posición de la etiqueta teléfono
        phoneField = new JTextField(); // Establece la posición del campo de texto teléfono
        phoneField.setBounds(105, 80, 135, 23);
        
        // Establece la etiqueta y el campo dirección
        address = new JLabel();
        address.setText("Dirección:");
        address.setBounds(20, 110, 135, 23); // Establece la posición de la etiqueta dirección
        addressField = new JTextField(); // Establece la posición del campo de texto dirección
        addressField.setBounds(105, 110, 135, 23);
        
        // Establece el botón Añadir persona
        add = new JButton();
        add.setText("Añadir");
        add.setBounds(105, 150, 80, 23); // Establece la posición del botón Añadir persona
        // Agrega al botón un ActionListener para que gestione eventos del botón
        add.addActionListener(this);
        
        // Establece el botón Eliminar persona
        delete = new JButton();
        delete.setText("Eliminar");
        delete.setBounds(20, 280, 80, 23); // Establece la posición del botón Eliminar persona
        // Agrega al botón un ActionListener para que gestione eventos del botón
        delete.addActionListener(this);
        
        // Establece el botón Borrar lista
        cleanList = new JButton();
        cleanList.setText("Borrar Lista");
        cleanList.setBounds(120, 280, 120, 23); // Establece la posición del botón Borrar lista
        // Agrega al botón un ActionListener para que gestione eventos del botón */
        cleanList.addActionListener(this);
        
        // Establece la lista gráfica de personas
        nameList = new JList<>();
        // Establece que se pueda seleccionar solamente un elemento de la lista
        nameList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        model = new DefaultListModel<>();
        
        // Establece una barra de desplazamiento vertical
        scrollList = new JScrollPane();
        // Establece la posición de la barra de desplazamiento vertical
        scrollList.setBounds(20, 190, 220, 80);
        // Asocia la barra de desplazamiento vertical a la lista de personas
        scrollList.setViewportView(nameList);
        
        // Se añade cada componente gráfico al contenedor de la ventana
        container.add(name);
        container.add(nameField);
        
        container.add(lastName);
        container.add(lastNameField);
        
        container.add(phone);
        container.add(phoneField);
        
        container.add(address);
        container.add(addressField);
        
        container.add(add);
        container.add(delete);
        container.add(cleanList);
        container.add(scrollList);
    }
    
    /**
     * Metodo que gestiona los eventos generados en la ventana principal
     */
    @Override
    public void actionPerformed (ActionEvent event) {
        
        if (event.getSource() == add) { // Si se pulsa el botón add
            addPeople(); // Se invoca añadir persona
        } else if (event.getSource() == delete) { // Si se pulsa el botón delete
            /* Se invoca el metodo deletePeople que elimina el elemento seleccionado */
            deletePeople(nameList.getSelectedIndex());
        } else if (event.getSource() == cleanList) { // Si se pulsa el botón borrar lista
            cleanList(); // Se invoca borrar lista
        }
    }
    
    /**
     * Metodo que agrega una persona al vector de personas y a la lista
     * gráfica de personas
     */
    private void addPeople() {
        
        // Se obtienen los campos de texto ingresados y se crea una persona
        People people = new People(nameField.getText(),
                lastNameField.getText(),
                phoneField.getText(),
                addressField.getText());
        
        list.addPeople(people); // Se añade una persona al vector de personas
        
        String element = nameField.getText() +
                "-" + lastNameField.getText() +
                "-" + phoneField.getText() +
                "-" + addressField.getText();
        
        model.addElement(element); // Se agrega el texto con los datos de la persona al JList
        nameList.setModel(model); // Se colocan todos los campos de texto nulos
        
        nameField.setText("");
        lastNameField.setText("");
        phoneField.setText("");
        addressField.setText("");
    }
    
    /**
     * Metodo que elimina una persona del vector de personas y de la
     * lista gráfica de personas en la ventana
     * @param index Parámetro que define la posición de la persona a
     * eliminar
     */
    private void deletePeople(int index) {
        if (index >= 0) { // Si la posición existe
            model.removeElementAt(index);
            /* Se elimina la persona seleccionada de la lista gráfica */
            list.deletePeople(index); /* Se elimina la persona seleccionada del vector de
            personas */
        } else {
            /* Si no se seleccionó ninguna persona, se genera un mensaje de error */
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento","Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Metodo que elimina todas las personas del vector de personas
     */
    private void cleanList() {
        list.cleanList(); // Se eliminan todas las personas del vector
        model.clear(); // Limpia el JList, la lista gráfica de personas
    }
    
}
