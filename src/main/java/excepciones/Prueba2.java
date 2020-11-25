
package excepciones;

import java.io.File;
import java.io.IOException;


public class Prueba2 {
    public static void main(String[] args) {
        
        File f = new File("file.txt");
        
        try {
            f.createNewFile();
        } catch(IOException e) {    
            System.out.println("IO exc");
            e.getMessage();
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(" Error inexperado");
            e.getMessage();
        }
        
    }
}