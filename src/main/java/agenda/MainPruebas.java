package agenda;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class MainPruebas {

    public static void main(String[] args) {
        Tarea tarea = null;
        Tarea tarea2 = null;
        Tarea tarea3 = null;
        Tarea tarea4 = null;
        try {
            tarea = new Tarea("Reunión", Prioridad.ALTA);
            tarea2 = new Tarea("Comprar pan", Prioridad.BAJA);
            tarea3 = new Tarea("Felicitar primo");
            tarea4 = new Tarea("Terminar ejercicio de Agenda", Prioridad.MEDIA);
        } catch (TareaException e) {

        }

        String msgError = "";
        String[] textos;

        LinkedHashSet<Tarea> todoList = new LinkedHashSet<>();
        todoList.add(tarea);
        todoList.add(tarea2);
        todoList.add(tarea3);
        todoList.add(tarea4);
        Agenda agenda = new Agenda(todoList);

        agenda.info();
        do {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("\nRealizar tarea introduciendo numero: ");
            textos = sc.nextLine().split(" ");
            switch (textos[0]) {
                case "crear":
                    try {
                        String descripcion = "";
                        for (int i = 1; i < textos.length-1; i++) {
                            descripcion += textos[i] + " ";
                        }
                        Tarea nuevaTarea = new Tarea(descripcion, Prioridad.valueOf(textos[textos.length-1].toUpperCase()));
                        agenda.addTodoList(nuevaTarea);
                        msgError = "";
                    } catch (TareaException e) {
                        msgError = "No se pudo crear la tarea. Revise los datos [crear <desc> <prioridad>]";
                    }
                case "salir":
                    break;
                default:
                    try {
                        if (!agenda.realizarTarea(Integer.parseInt(textos[0]))) {
                            msgError = "Escriba un numero de tarea existente";
                        }else{
                            msgError= "";
                        }

                    } catch (Exception e) {
                        msgError = "No se pudo realizar la tarea. Compruebe que haya escrito bien el numero";
                    }

            }

            if (!msgError.isEmpty()) {
                System.out.println(msgError);
            }else{
                agenda.info();
            }
 
        } while (!textos[0].equals("salir"));

    }

}
