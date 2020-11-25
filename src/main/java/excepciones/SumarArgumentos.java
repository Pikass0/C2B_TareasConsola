
package excepciones;


public class SumarArgumentos {
    public static void main(String[] args) {
        
        double suma=0;
        
        for (String arg : args) {
            try {
                suma+= Double.parseDouble(arg);
            } catch (NumberFormatException e) {
                System.out.println("No he podido incluir " + arg + 
                        " en la suma.");
            }
            
        }
        
        System.out.println(suma);
        
    }
}
