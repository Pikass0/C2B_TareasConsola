
package excepciones;


public class Calculadora {
    
    /**
     * 
     * @param n1
     * @param n2
     * @return
     * @throws excepciones.CalculadoreaException
     */
    
    public double dividir(int n1, int n2) throws CalculadoreaException{
        if (n2 == 0) {
            throw new CalculadoreaException("Denominador no debe ser 0", n2);
        }
        return n2/n2;
    }
    
    public double redondeoPositivos(double numero) throws CalculadoreaException{
        
        //pos valid
        if (numero < 0) {
            //hijo de runtime exception. No es obligatorio poner throws arriba
            throw new CalculadoreaException("Número debe ser positivo pero es " + numero, numero);
        }
        return Math.round(numero);
    }
    
    
}
