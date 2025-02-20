package org.example.projectFriends;
// Java program to read from file and display the contacts

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Read {
    
    protected static boolean found (File file, Friend friend) throws IOException {
        
        String line;
        String name2;
        long number2;
        
        // Opening file in reading and write mode.
        
        RandomAccessFile raf
                = new RandomAccessFile(file, "rw");
        
        raf.seek(0);
        
        // Traversing the file
        // getFilePointer() give the current offset
        // value from start of the file.
        while (raf.getFilePointer() < raf.length()) {
            
            // reading line from the file.
            line = raf.readLine();
            
            // splitting the string to get name and number
            String[] lineSplit
                    = line.split(Create.getSeparator());
            
            // separating name and number.
            name2 = lineSplit[0];
            number2 = Long.parseLong(lineSplit[1]);
            
            // if condition to find existence of record.
            if (Objects.equals(friend.name(), name2) || friend.number() == number2) {
               return true;
            }
        }
        
        return false;
    
    }
    
    protected static List<Friend> friends (File file) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(file, "r");
        List<Friend> friends = new ArrayList<>();
        while (raf.getFilePointer() < raf.length()) {
            String line = raf.readLine();
            String[] data = line.split(Create.getSeparator());
            friends.add(new Friend(data[0], Long.parseLong(data[1])));
        }
        return friends;
    }
}
    

