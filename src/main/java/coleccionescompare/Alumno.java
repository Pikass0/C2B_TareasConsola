
package coleccionescompare;



public class Alumno implements Comparable<Alumno>{
    private int dni;
    private String nombre;
    private Ciclo ciclo;


    public Alumno(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        
    }
    
    public Alumno(int dni, String nombre, Ciclo ciclo) {
        this(dni, nombre);
        this.ciclo = ciclo;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }

    
    
    
    @Override
    public String toString() {
        return "Alumno{" + "dni=" + dni + ", nombre=" + nombre + ", ciclo=" + ciclo + '}';
    }

    @Override
    public int hashCode() {
        //HashSet usa esta funcion y el equals pero no el compareto
        int hash = 5;
        hash = 89 * hash + this.dni;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Alumno a) {
        //TreeSet usa el compareto
        //neg menor, 0 igual, pos mayor
        
        if (a == null) {
            return 0;
        }
        
        
        return this.dni - a.dni;
        
    }


    
}
