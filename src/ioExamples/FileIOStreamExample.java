package ioExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamExample {
    
    public static void main(String[] args) throws Exception {
        
        //the following line will not throw any exception, 
        //because it just create an instance of file object using the path.
        //this will not check whether the file exists or not.
        File file = new File("Temp.out");
        
        //the file object will be used by other classes in the IO to read
        //and write.
        
        FileOutputStream fos = null;
        FileInputStream fis = null;
        int read;
        
        try {
            
            //only the following line creates a new file
            file.createNewFile();
            
            //File file1 = new File("/","check.out");
            
            System.out.println("New File Created : " + file);
            
            //create output stream for writing with append mode as true
            fos = new FileOutputStream(file,true);
            
            //write integers to that file.
            for(int i=65; i <= 90; i++ ) {
                fos.write(i);
            }
            
            //then close the stream 
            fos.close();
            
            //after closing the file handle (output stream) if you try
            //to write you'll get IOException "File Handle is Inavalid"
            //fos.write(23);
            
            //create an input stream for the same file
            fis = new FileInputStream(file);
            
            
            //read the integers till the EOF            
            while( (read = fis.read()) != -1) {
                System.out.println(read);
            }
            
            //the below loop does not throw any exception. Even after the EOF 
            //is reached if you still call read() before close() you get the
            //same value -1, but no exception
            for(int i=65; i <= 90; i++ ) {
                System.out.println(fis.read());
            }
            
            //closed the output stream
            fis.close();
            
            //after closing file output stream if you try to read
            //you will get IOException "Read error"
            //fis.read();
            
        } catch (IOException ioex) {
            ioex.printStackTrace();
        } finally {
            if(fis != null) {
                fis.close();
            }
            if(fos != null) {
                fos.close();
            }
        }
    }
}
