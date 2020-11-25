
package agenda;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;


public class Tarea{
    
    private LocalDate fCreacion; //fecha con formato año-mes-dia (sin hora ni nada)
    private LocalDate fRealizacion;
    private String desc;
    private Prioridad prioridad;

    public Tarea(String desc) {
        this.fCreacion = LocalDate.now();
        this.desc = desc;
        this.prioridad = Prioridad.MEDIA;
    }

    
    
    public Tarea(String desc, Prioridad prioridad) {
        this.fCreacion = LocalDate.now();
        this.desc = desc;
        this.prioridad = prioridad;
    }

    public LocalDate getfCreacion() {
        return fCreacion;
    }

    public LocalDate getfRealizacion() {
        return fRealizacion;
    }

    public String getDesc() {
        return desc;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setfRealizacion(LocalDate fRealizacion) {
        this.fRealizacion = fRealizacion;
    }

    
    
    @Override
    public String toString() {
        if (fRealizacion != null) {
             return  "Tarea: " + desc + ", Fecha de creación: " + fCreacion +
                     ", Fecha de realización: " + fRealizacion + ", Prioridad: " + prioridad + '}';
        }
        
        return  "Tarea: " + desc + ", Fecha de creación: " + fCreacion + ", Prioridad: " + prioridad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.fCreacion);
        hash = 23 * hash + Objects.hashCode(this.desc);
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
        final Tarea other = (Tarea) obj;
        if (!Objects.equals(this.desc, other.desc)) {
            return false;
        }
        if (!Objects.equals(this.fCreacion, other.fCreacion)) {
            return false;
        }
        return true;
    }


  
    
    
    
}
