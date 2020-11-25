      
package coleccionescompare;
  
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PruebaAPICollections implements Comparator<Alumno>{
    
    public static void main(String[] args) {
        ArrayList<Alumno> lista = new ArrayList<>();
        //Collections.sort(Lsit)
        //Collections.sort(Lsit, comparator)
        /*
        Añadir alumnos a la lista
        recorrer array
        ordenar con sort por su compareto (por dni)
        recorrer el array
        ordenar por ciclo y luego por dni
        */
        

        lista.add(new Alumno(1, "Marcos", Ciclo.PREESCOLAR));
        lista.add(new Alumno(5, "María", Ciclo.PRIMARIA));
        lista.add(new Alumno(3, "Diego", Ciclo.BACHILLER));
        lista.add(new Alumno(9, "Gabriela", Ciclo.SECUNDARIA));

        
        mostrarLista(lista);
        
        System.out.println("Ordenamos con collections.sort(List) por dni");
        
        Collections.sort(lista);
        System.out.println("Ordenamos con collections.sort(List, coll) por ciclo y si se repite, por dni");
        
        Collections.sort(lista, new ComparatorAlumno());
        
        mostrarLista(lista);
        
        
        
        
        
    }
    
    public static void mostrarLista(ArrayList<Alumno> lista){
        
        for (Alumno alumno : lista) {
            System.out.println(alumno);
        }
        
    }

    @Override
    public int compare(Alumno o1, Alumno o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
}
