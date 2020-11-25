package colecciones;

import java.util.ArrayList;
import java.util.List;

public class PruebasList {

    public static void main(String[] args) {
        
        List<String> nombresList = new ArrayList<String>();
        
        nombresList.add("Andrea");
        nombresList.add("María");
        nombresList.add("Alba");
        nombresList.add("Silvia");
        nombresList.add("Soledad");
        nombresList.add("Silvia");
        System.out.println("Mostrar la segunda " + nombresList.get(1));
        
        for (String string : nombresList) {
            System.out.println(string);
        }
        
        
    }
    
}
