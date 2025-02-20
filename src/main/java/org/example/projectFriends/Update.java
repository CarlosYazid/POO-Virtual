package org.example.projectFriends;
// Java program to update in the file and change the number of an old contact

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class Update {
    
    protected static boolean name (File file, Friend friend, String newName) throws IOException {
        
        boolean exists = Read.found(file, friend);
        
        if (exists) {
            
            String line;
            String name;
            long number;
            
            // Creating a temporary file
            // with file pointer as tmpFile.
            File tmpFile = new File("temp.txt");
            
            // Opening this temporary file
            // in ReadWrite Mode
            RandomAccessFile tmpraf
                    = new RandomAccessFile(tmpFile, "rw");
            
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            
            // Set file pointer to start
            raf.seek(0);
            
            // Traversing the friendsContact.txt file
            while (raf.getFilePointer()
                    < raf.length()) {
                
                // Reading the contact from the file
                line = raf.readLine();
                
                // splitting the string to get name and number
                String[] lineSplit = line.split(Create.getSeparator());
                
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
                
                // Check if the fetched contact is the one to be updated
                if (name.equals(friend.name()) && number == friend.number()) {
                    
                    // Update the name of this contact
                    line = newName + Create.getSeparator() + friend.number();
                }
                
                // Add this contact in the temporary file
                tmpraf.writeBytes(line);
                
                // Add the line separator in the temporary file
                tmpraf.writeBytes(System.lineSeparator());
            }
            
            // The contact has been updated now
            // So copy the updated content from
            // the temporary file to original file.
            
            // Set both files pointers to start
            raf.seek(0);
            tmpraf.seek(0);
            
            // Copy the contents from
            // the temporary file to original file.
            while (tmpraf.getFilePointer()
                    < tmpraf.length()) {
                raf.writeBytes(tmpraf.readLine());
                raf.writeBytes(System.lineSeparator());
            }
            
            // Set the length of the original file
            // to that of temporary.
            raf.setLength(tmpraf.length());
            
            // Closing the resources.
            tmpraf.close();
            raf.close();
            
            // Deleting the temporary file
            tmpFile.delete();
            
            return true;
            
        }
        
        return false;
    }
    
    protected static boolean number (File file, Friend friend, long newNumber) throws IOException {
        
        boolean exists = Read.found(file, friend);
        
        if (exists) {
            
            String line;
            String name;
            long number;
            
            // Creating a temporary file
            // with file pointer as tmpFile.
            File tmpFile = new File("temp.txt");
            
            // Opening this temporary file
            // in ReadWrite Mode
            RandomAccessFile tmpraf
                    = new RandomAccessFile(tmpFile, "rw");
            
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            
            // Set file pointer to start
            raf.seek(0);
            
            // Traversing the friendsContact.txt file
            while (raf.getFilePointer()
                    < raf.length()) {
                
                // Reading the contact from the file
                line = raf.readLine();
                
                // splitting the string to get name and number
                String[] lineSplit = line.split(Create.getSeparator());
                
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
                
                // Check if the fetched contact is the one to be updated
                if (name.equals(friend.name()) && number == friend.number()) {
                    
                    // Update the number of this contact
                    line = friend.name() + Create.getSeparator() + newNumber;
                }
                
                // Add this contact in the temporary file
                tmpraf.writeBytes(line);
                
                // Add the line separator in the temporary file
                tmpraf.writeBytes(System.lineSeparator());
            }
            
            // The contact has been updated now
            // So copy the updated content from
            // the temporary file to original file.
            
            // Set both files pointers to start
            raf.seek(0);
            tmpraf.seek(0);
            
            // Copy the contents from
            // the temporary file to original file.
            while (tmpraf.getFilePointer()
                    < tmpraf.length()) {
                raf.writeBytes(tmpraf.readLine());
                raf.writeBytes(System.lineSeparator());
            }
            
            // Set the length of the original file
            // to that of temporary.
            raf.setLength(tmpraf.length());
            
            // Closing the resources.
            tmpraf.close();
            
            // Deleting the temporary file
            tmpFile.delete();
            
            return true;
        }
        
        return false;
    }
}
