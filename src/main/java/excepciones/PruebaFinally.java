
package excepciones;


public class PruebaFinally {
    
    public static void main(String[] args) {
       
        suma("Sumatorio", 5,4,6,8,14,65);
        
        
    }
    
    public static void suma(String titulo, int... numeros){
        int total = 0;

        for (int numero : numeros) {
            total+= numero;      
        }
        
        try {
            System.out.println(titulo.toUpperCase());
            System.out.println("....................");
            System.out.println("Total: " + total);
         
        } catch (Exception e) {
            System.out.println("Has indicado mal el titulo");
        }finally{
            System.out.println("fin de suma");
        }
       
        
    }
    
    
    
}
