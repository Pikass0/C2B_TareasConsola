
package excepciones;


public class CalculadoreaException extends Exception{

    private double numeroMal;
    
    
    public CalculadoreaException(String msg, double numeroMal) {
        super(msg);
        this.numeroMal = numeroMal;
    }

    public double getNumeroMal() {
        return numeroMal;
    }
    
    
    
}
