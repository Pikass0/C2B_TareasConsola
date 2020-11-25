
package excepciones;


public class Pruebas {
    
    public static void main(String[] args) {
        
        //Exception
            //RuntimeException - no checked. No avisan en compilador
            
            String s = "22";
            
            int n = Integer.parseInt(s);
            s = "veintidós";
            n = Integer.parseInt(s);
            
            //El resto son checked
        
    }
    
}
