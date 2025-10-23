package task1;

//Bank class using List ADT for account management
import java.util.ArrayList;
import java.util.List;

class AccountManagement implements Bank {
     private List<Account> accounts = new ArrayList<>();

 public void addAccount(Account account) {
     accounts.add(account);
 }

 public void removeAccount(Account account) {
     accounts.remove(account);
 }

 public Account accessAccount(int index) {
     if (index < 0 || index >= accounts.size()) {
         return null; 
     }
     return accounts.get(index);
 }

 @Override
 public void performOperation() {
     System.out.println("Account Management Operation:");
     for (Account account : accounts) {
         System.out.println("Account Holder: " + account.getAccountHolderName() + 
                            ", Account Number: " + account.getAccountNumber() + 
                            ", Balance: " + account.getBalance() + " PKR");
     }
 }
}

