package task1;

//Account Class to represent bank accounts (List ADT)
class Account {
     private String accountNumber;
     private String accountHolderName;
     private double balance; 

 public Account(String accountNumber, String accountHolderName, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolderName = accountHolderName;
     this.balance = balance;
 }

 public String getAccountNumber() {
     return accountNumber;
 }

 public String getAccountHolderName() {
     return accountHolderName;
 }

 public double getBalance() {
     return balance;
 }

 public void deposit(double amount) {
     balance += amount;
 }

 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
     } else {
         System.out.println("Insufficient balance to withdraw.");
     }
 }
}

