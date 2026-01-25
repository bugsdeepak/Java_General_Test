package main.java.ioExamples;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccesssExample {
    
    public static void main(String[] args) {
        
        RandomAccessFile randAccFile = null;
        String textFile = "mytext.txt";
        Byte b = 23;
        try{
            
            randAccFile = new RandomAccessFile(textFile, "rw");
            randAccFile.write(b);
            randAccFile.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}
