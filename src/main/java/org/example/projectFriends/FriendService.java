package org.example.projectFriends;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

class FriendService {
    
    
    
    private static File file;
    
    protected static File makeFile() throws IOException {
        File file = Create.file();
        setFile(file);
        return file;
    }
    
    protected static File makeFile(String pathName) throws IOException {
        File file = Create.file(pathName);
        setFile(file);
        return file;
    }
    
    protected static void addFriend(String name, long number) throws IOException {
        Create.friend(file, new Friend(name, number));
    }
    
    protected static void deleteFriend(String name, long number) throws IOException{
        Delete.friend(file, new Friend(name, number));
    }
    
    protected static void updateFriend(String oldName, long oldNumber, String newName,
                                    long newNumber) throws IOException, NoSuchFieldError {
        
        
        boolean status1 = Update.name(file, new Friend(oldName, oldNumber), newName);
        boolean status2 = Update.number(file, new Friend(newName, oldNumber), newNumber);
        
        if (!(status1 && status2)) {
            throw new NoSuchFieldError();
        }
    }
    
    protected static DefaultComboBoxModel<String> getFriend() throws IOException {
        DefaultComboBoxModel<String> names = new DefaultComboBoxModel<>();
        List<Friend> friends = Read.friends(file);
        for (Friend friend : friends) {
            names.addElement(friend.name() + Create.getSeparator() + friend.number());
        }
        return names;
    }
    
    protected static String getFriendList() throws IOException {
        StringBuilder sb = new StringBuilder();
        List<Friend> friends = Read.friends(file);
        for (Friend friend : friends) {
            sb.append(friend.name())
                    .append(" ")
                    .append(Create.getSeparator())
                    .append(" ")
                    .append(friend.number())
                    .append("\n");
        }
        return sb.toString();
    }
    
    protected static void setFile (File file) {
        FriendService.file = file;
    }
    
    public static String getSeparator() {
        return Create.getSeparator();
    }
}
