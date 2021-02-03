
package agenda;

import java.util.Comparator;

public  class ComparatorAgenda implements Comparator<Tarea>{

    ComparatorAgenda() {
    }


    @Override
    public int compare(Tarea t1, Tarea t2) {
        return t2.getDesc().compareTo(t2.getDesc());
    }




    
}
