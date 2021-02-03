
package agenda;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;


public class Agenda {
    
    private Set<Tarea> todoList;
    private Set<Tarea> doneList;

    public Agenda() {
        this.doneList = new LinkedHashSet<>();
    }

    
    public Agenda(Set<Tarea> todoList) {
        this();
        this.todoList = todoList;
    }

    
    public void addTodoList(Tarea tarea){
        todoList.add(tarea);
    }
    
    public void realizarTarea(Tarea tarea){
        todoList.remove(tarea);
        tarea.setfRealizacion(LocalDate.now());
        doneList.add(tarea);
    }
    
    public boolean realizarTarea(int index){
        int cont = 1;
        for (Tarea tarea : todoList) {
            if (cont == index) {
                todoList.remove(tarea);
                tarea.setfRealizacion(LocalDate.now());
                doneList.add(tarea); 
                return true;
            }
            cont++;
        }
        return false;

    }
    
    public Tarea buscarTareaPorDesc(String desc) throws AgendaException{
        
        ArrayList<Tarea> lista = new ArrayList<Tarea>();
        lista.addAll(todoList);
        Collections.sort(lista, new ComparatorAgenda());
        int pos = Collections.binarySearch(lista, new Tarea(desc), new ComparatorAgenda());
        
        if (pos <0) {
            throw new AgendaException("no se ha encontrado ninguna tarea en "
                    + "TODO list con la descripción :" +desc);
        }else{
            return lista.get(pos);
        }

    }

    public void info(){
        int cont =1;
        System.out.println("\n*************");
        System.out.println("*   AGENDA  *");
        System.out.println("*************");
        System.out.println("TODO List:");
        System.out.println("*************");
        
        if (!todoList.isEmpty()) {
            for (Tarea tarea : todoList) {
                System.out.println(cont + ". " + tarea);
                cont++;
            }
        }
        cont = 1;
        System.out.println("\n*************");
        System.out.println("DONE List:");
        System.out.println("*************");
        if (doneList != null) {
            for (Tarea tarea : doneList) {
                System.out.println(cont + ". " + tarea);
                cont++;
            }
        }
        
        System.out.println();
        
    }
    
    
}
