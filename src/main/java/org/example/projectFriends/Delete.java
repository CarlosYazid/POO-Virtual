package org.example.projectFriends;
// Java program to delete a contact from the file

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class Delete {
    
    protected static void friend (File file, Friend friend) throws IOException {
        
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
            
            // Opening file in reading and write mode.
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            
            // Set file pointer to start
            raf.seek(0);
            
            // Traversing the file
            // getFilePointer() give the current offset value from start of the file.
            while (raf.getFilePointer() < raf.length()) {
                
                // reading line from the file.
                line = raf.readLine();
                
                // splitting the string to get name and number
                String[] lineSplit = line.split(Create.getSeparator());
                
                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
                
                // Check if the fetched contact
                // is the one to be deleted
                if (name.equals(friend.name()) && number == friend.number()) {
                    
                    // Skip inserting this contact
                    // into the temporary file
                    continue;
                }
                
                // Add this contact in the temporary file
                tmpraf.writeBytes(line);
                
                // Add the line separator in the temporary file
                tmpraf.writeBytes(System.lineSeparator());
            }
            
            // The contact has been deleted now
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
            
        }
    }
}