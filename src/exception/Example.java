package exception;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Example {
    
    public static void cat(File file) throws Exception {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
            
        } catch(IOException ioex) {
            
       
            
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }

}
