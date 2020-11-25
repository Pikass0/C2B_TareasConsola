package colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PruebasMap {

    public static void main(String[] args) {
        
        //MAP  key - value
        //HashMap no hay orden
        Map<String, Double> notas = new HashMap<>();
        
        //Añadir elem
        notas.put("Laura", 5.6);
        notas.put("Roberto", 9.3);
        notas.put("Roberto", 9.2);
        notas.put("Sandra", 9.6);
        
        
        System.out.println("Nota de roberto: " + notas.get("Roberto"));
        
        //mostrar notas por alumno
        Set<String> keys = notas.keySet();
        for (Object key : keys) {
            System.out.println(key + " nota:" + notas.get(key));
        }
        
        
    }
    
}
