package org.example.projectFriends;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class FriendController {
    
    private static void showErrorDialog(String message, Exception e) {
        if (e != null) {
            JOptionPane.showMessageDialog(null, message + "\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, message + "\n", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public static File file() {
        try {
            return FriendService.makeFile();
        } catch (IOException e) {
            showErrorDialog("Error creando el archivo", e);
        }
        return null;
    }
    
    public static void addFriend(String name, String number) {
        if (!name.isEmpty() && !number.isEmpty()) {
            try {
                FriendService.addFriend(name, Long.parseLong(number));
            } catch (IOException e) {
                showErrorDialog("Error añadiendo a " + name, e);
            } catch (NumberFormatException e) {
                showErrorDialog("Estas introduciendo caracteres no validos en " +
                        "el campo número", null);
            }
            
        } else {
            showErrorDialog("Estas dejando campos vacios", null);
        }
    }
    
    public static void deleteFriend(String friend) {
        if (friend != null) {
            
            String[] friendSplit = friend.split(FriendService.getSeparator());
            
            try {
                FriendService.deleteFriend(friendSplit[0], Long.parseLong(friendSplit[1]));
            } catch (IOException e) {
                showErrorDialog("Error al tratar de eliminar a " + friendSplit[0], e);
            }
            
        } else {
            showErrorDialog("No hay amigo al que eliminar", null);
        }
    }
    
    public static void updateFriend(String name, String number, String newName, String newNumber) {
        if (!name.isEmpty() && !number.isEmpty() && !newName.isEmpty() && !newNumber.isEmpty()) {
            
            try {
                FriendService.updateFriend(name, Long.parseLong(number), newName,
                        Long.parseLong(newNumber));
            } catch (IOException e) {
                showErrorDialog("Error al tratar de actualizar a " + name, e);
            } catch (NumberFormatException e) {
                showErrorDialog("Estas introduciendo caracteres no validos " +
                        "en el/los campo/s antiguo número y/o nuevo número", null);
            } catch (NoSuchFieldError e) {
                showErrorDialog("No se ha encontrado el amigo a actualizar", null);
            }
            
        } else {
            showErrorDialog("Estas dejando campos vacios", null);
        }
    }
    
    public static void updateFriendList(JComboBox<String> friendDropdown, JTextArea friendDisplay) {
        try {
            friendDropdown.setModel(FriendService.getFriend());
            friendDisplay.setText(FriendService.getFriendList());
        } catch (IOException e) {
            showErrorDialog("Error al tratar de actualizar a lista de amigos", e);
        }
    }
}
