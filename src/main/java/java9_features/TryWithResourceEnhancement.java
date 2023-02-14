package java9_features;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResourceEnhancement {

    public static void main(String[] args) throws FileNotFoundException {
        // we can put resource declared outside the try-with-resource in java 9
        FileOutputStream fileStream = new FileOutputStream("javatpoint.txt");


        try(fileStream){
            String greeting = "Welcome to javaTpoint.";
            byte b[] = greeting.getBytes();
            fileStream.write(b);
            System.out.println("File written");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
