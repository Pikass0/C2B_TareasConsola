package bank7.domain;

import java.util.ArrayList;


public class Bank {
  private static ArrayList<Customer> customers;

  static {
    customers = new ArrayList<>();
  }

  private Bank() {
    // this constructor should never be called
  }

  public static void addCustomer(String f, String l) {
    customers.add(new Customer(f, l));
  }
  public static void addCustomer(Customer customer) {
    customers.add(customer);
  }
  
  public static int getNumOfCustomers() {
    return customers.size();
  }
  public static Customer getCustomer(int customer_index) {
    return customers.get(customer_index);
  }
  
  
  public static void info(){
      System.out.println("____BANK____");
      
      
      
      
  }
  
  
  
}
