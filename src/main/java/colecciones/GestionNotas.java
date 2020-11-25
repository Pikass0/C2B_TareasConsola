
package colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class GestionNotas {
    public static void main(String[] args) {
        //treeset necesita que alumno sea comparable para cast a set
        TreeSet<Alumno> listado = new TreeSet();
        
        listado.add(new Alumno(1, "Luis"));
        listado.add(new Alumno(1, "Luis")); //siendo HasMap lo añade aunque no deberia. 
        //no añade porque internamente ahce un equals, y al ser nuestra clase, no sabe lo que
        //es queals, por eso tenemos que programarlo nosotros
        listado.add(new Alumno(4, "María"));
        listado.add(new Alumno(5, "Carlos"));
        listado.add(new Alumno(2, "Alberto"));
        listado.add(new Alumno(3, "Mario"));

        
        mostrarListaAsistenciaAlumnos(listado);
        
        TreeSet<Alumno> lista2 = new TreeSet<>(new ComparadorNombreAlumno());
        lista2.add(new Alumno(1, "Luis"));
        lista2.add(new Alumno(1, "Luis"));
        lista2.add(new Alumno(4, "María"));
        lista2.add(new Alumno(5, "Carlos"));
        lista2.add(new Alumno(2, "Alberto"));
        lista2.add(new Alumno(3, "Mario"));
        
        mostrarListaAsistenciaAlumnos(lista2);
        
        
    }
    
    
    public static void mostrarListaAsistenciaAlumnos(Set<Alumno> alumnos){
        
        System.out.println(" LISTADO DE ASISTENCIA");
        
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getDni() + " " + alumno.getNombre());
        }
        
        
    }
    
    
}
