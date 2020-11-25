
package colecciones;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class PruebasSet {
    
    public static void main(String[] args) {
        
        //No permite duplicados
        
        //1 HashSet - no ordenado
        
        Set nombres = new TreeSet<String>();
        //si no se pone tipo, es list de cualquier obj, se pueden mix
        nombres.add("Pepe");
        nombres.add("Carlos");
        nombres.add("Carla");
        nombres.add("Marta");
        //HashSet los muestra en el orden que le da la gana pero siempre igual
        //si cambio new HashSet por LinkedHashSet, los muestra por orden de insercion
        //si lo cambio por TreeSet, los ordena alfabeticamente
        for (Object nombre : nombres) {
            System.out.println(nombre);
        }
        
        
    }
    
}
