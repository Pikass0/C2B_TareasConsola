
package excepciones;



public class PropagarThrows {
    
    public static void main(String[] args) {
        
        int sb = 20000;
        int meses = 12;
        
        CalcularNomina cn = new CalcularNomina();
        try {
            cn.generaNomina(sb, meses);
        } catch (CalculadoreaException ex) {
            System.out.println("Error" + ex.getMessage());
            System.out.println("Ha introducido numero de meses mal: " + ex.getNumeroMal());
            System.out.println("Pruebe mandando meses > 0");
        }
        
        
        double numeroAredondear = -324.3;
        Calculadora c = new Calculadora();
        try {
            double r = c.redondeoPositivos(numeroAredondear);
        } catch (CalculadoreaException ex) {
            ex.getMessage();
        }
        
    }
    
    
}
