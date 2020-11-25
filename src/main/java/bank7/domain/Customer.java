package bank7.domain;

import java.util.ArrayList;

public class Customer {

  private String firstName;

  private String lastName;

  private ArrayList<Account> accounts;

  public Customer(String f, String l) {
    firstName = f;
    lastName = l;
    // initialize accounts array
    accounts = new ArrayList<>();

  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void addAccount(Account acct) {
    accounts.add(acct);
  }

  public int getNumOfAccounts() {
    return accounts.size();
  }

  public Account getAccount(int account_index) {
    return accounts.get(account_index);
  }
}
