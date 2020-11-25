
package bank7.data;

import bank7.domain.Bank;
import bank7.domain.CheckingAccount;
import bank7.domain.Customer;
import bank7.domain.SavingsAccount;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DataSource {
   
    private File dataFile;
///src/main/data/data.txt
    public DataSource(String path) throws IOException {
        File dir = new File(path);
        
        if (!dir.exists()) {
            System.out.println("El directorio dir1 no existe. Creo el directorio");
            dir.mkdir();
        }else{
            System.out.printf("El directorio %s ya existe", dir.getName());
        }
        
        this.dataFile = new File(dir, "data.txt");
        
        if (!dataFile.exists()) {
            System.out.printf("El fichero %s no existe. Creo el fichero", dataFile.getName());
            dataFile.createNewFile();
        }else{
            System.out.printf("El directorio %s ya existe", dataFile.getName());
         }
        
    }

    
    public void loadData() throws IOException{
        
        FileReader fr = null;
 
        try {
            fr = new FileReader(dataFile);
            BufferedReader buffer = new BufferedReader(fr);
            String linea1 =buffer.readLine();
//            int numClientes = Integer.parseInt(linea1);
            String linea = buffer.readLine();
            
            do{
                while (!linea.equals("")) {     
                    //Cada linea vacia hay un nuevo cliente
                    //Nombre, apellido, num cuentas
                    String[] datosCliente = linea.split("\t");
                    String nombre = datosCliente[0];
                    String apellido = datosCliente[1];        
                    int numCuentas = Integer.parseInt(datosCliente[2]);
                    Customer customer = new Customer(nombre, apellido);
                    for (int i = 0; i < numCuentas; i++) {
                        linea = buffer.readLine();
                        String[] datosCuenta = linea.split("\t");
                        if (datosCuenta[0].equals("S")) {
                            //[1] = balance. [2] = interes
                            customer.addAccount(new SavingsAccount( 
                                    Double.parseDouble(datosCuenta[1]), 
                                    Double.parseDouble(datosCuenta[2])));
                        }else if(datosCuenta[0].equals("C")){
                            //[1] = balance. [2] = overdraftAmount
                            customer.addAccount(new CheckingAccount( 
                                    Double.parseDouble(datosCuenta[1]), 
                                    Double.parseDouble(datosCuenta[2])));
                        }  
                    }
                    linea = "";
                    Bank.addCustomer(customer); 
                }
                linea = buffer.readLine();
            }while (linea != null);

                
 
            
            
        } catch (IOException ex) {
            System.out.println("No se pudo leer. IOException: ");
            System.out.println(ex.getMessage());
        }finally {
            if (fr != null) {
                fr.close();
            }
        }
         
        
        
        
        
    }
    
    
}
