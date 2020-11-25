
package excepciones;


public class CalcularNomina {
    
    public void generaNomina(int salarioBaseAnual, int meses) throws CalculadoreaException{
        
        Calculadora c = new Calculadora();
        double salario = c.dividir( salarioBaseAnual, meses);
        salario = c.redondeoPositivos(salario);
        System.out.println("Nomina mensual de "+salario);
        
    }
    
    
}
