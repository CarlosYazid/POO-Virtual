package org.example.projectFriends;
// Java program to create a file and add a new contact in the file

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class Create {
    
    protected static final String DEFAULT_PATHNAME = "friendsContact.txt";
    protected static String separator = "!";
    
    protected static File file() throws IOException {
        return file(DEFAULT_PATHNAME);
    }
    
    protected static File file(String pathname) throws IOException {
        
        // Using file pointer creating the file.
        File file = new File(pathname);
        
        if (!file.exists()) {
            
            // Create a new file if not exists.
            file.createNewFile();
        
        }
        
        return file;
    }
    
    protected static void friend(File file, Friend friend) throws IOException {
        
        boolean exist = Read.found(file, friend);
        
        if (!exist) {
            
            // Opening file in reading and write mode.
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            
            // Enter the if block when a record
            // is not already present in the file.
            String line = friend.name() + separator + friend.number();
            
            if (raf.getFilePointer() < raf.length()) {
                raf.seek(raf.length());
            }
            
            // writeBytes function to write a string
            // as a sequence of bytes.
            raf.writeBytes(line);
            
            // To insert the next record in new line.
            raf.writeBytes(System.lineSeparator());
            
        }
        
    }
    
    public static String getSeparator () {
        return separator;
    }
    
    public static void setSeparator (String separator) {
        Create.separator = separator;
    }
    
}
