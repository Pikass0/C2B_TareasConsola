
package coleccionescompare;

import java.util.Comparator;


public class ComparatorAlumno implements Comparator<Alumno>{

    @Override
    public int compare(Alumno a1, Alumno a2) {
        if (a1.getCiclo().ordinal() == a2.getCiclo().ordinal()) {
            return a1.getDni() - a2.getDni();
        }else{
            return  a1.getCiclo().ordinal() - a2.getCiclo().ordinal();
        }
    }
    
}
