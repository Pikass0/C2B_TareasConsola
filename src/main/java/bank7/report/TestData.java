package bank7.report;

import bank7.data.DataSource;

import java.io.IOException;


public class TestData {
    
    public static void main(String[] args) {
        initializeCustomers();
        
        // run the customer report
        System.out.println();

        CustomerReport report = new CustomerReport();
        report.generateReport();
    }
    
    private static void initializeCustomers() {
        DataSource data = null;
        try {
            data = new DataSource("C:\\Users\\user\\Documents\\NetBeansProjects\\0011_Ejercicios\\data");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            data.loadData();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
