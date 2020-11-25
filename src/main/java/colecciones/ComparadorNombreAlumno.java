/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Comparator;

/**
 *
 * @author user
 */
public class ComparadorNombreAlumno implements Comparator<Alumno>{

    @Override
    public int compare(Alumno a1, Alumno a2) {
        return a1.getNombre().compareTo(a2.getNombre());
    }

    
    
}
