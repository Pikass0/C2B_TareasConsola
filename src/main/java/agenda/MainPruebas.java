
package agenda;

import java.util.LinkedHashSet;
import java.util.Scanner;



public class MainPruebas {
    public static void main(String[] args) {
        
        Tarea tarea = new Tarea("Reunión", Prioridad.ALTA);
        Tarea tarea2 = new Tarea("Comprar pan", Prioridad.BAJA);
        Tarea tarea3 = new Tarea("Felicitar primo");
        Tarea tarea4 = new Tarea("Terminar ejercicio de Agenda", Prioridad.MEDIA);
        
        LinkedHashSet<Tarea> todoList = new LinkedHashSet<>();
        todoList.add(tarea);
        todoList.add(tarea2);
        todoList.add(tarea3);
        todoList.add(tarea4);
        Agenda agenda = new Agenda(todoList);
        
        
        agenda.info();

        System.out.println("\nVoy a realizar la compra....\n");
        
        for (Tarea t : todoList) {
            if (t.equals(tarea2)) {
                agenda.realizarTarea(t);
                break;
            }
        }
        
        agenda.info();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nRealizar tarea introduciendo numero: ");
        agenda.realizarTarea(sc.nextInt());
        
        agenda.info();
        
        
    }
}
