
package colecciones;

import java.util.ArrayList;


public class PruebaCollecciones {
    
    public static void main(String[] args) {
        
        //Array
        //1. Admiten primitivos y obj
        int[] notas;
        notas = new int[5];
        
        notas[0] = 1;
        
        for (int nota : notas) {
            System.out.println(nota);
        }
        
        
        
        //Coleccion arraylist
        //1. Solo admiten obj
        ArrayList<Integer> notasList;
        notasList = new ArrayList<>();
        notasList.isEmpty();
        notasList.add(14);
        
        //contains busca en el array y dice si existe
        System.out.println(notasList.contains(14));
        //me recomienda esta netbeans
        notasList.forEach(integer -> {
            System.out.println(integer);
        });
        
        
        
    }
    
}
