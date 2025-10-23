package task1;

//Main class to demonstrate the use of ADTs
public class BankOperationDemo {
     public static void main(String[] args) {
     // Account Management (List ADT)
     AccountManagement accountManagement = new AccountManagement();
     Account account1 = new Account("A001", "Laiba Rafiq", 15000.50); 
     Account account2 = new Account("A002", "Hamna Irfan", 23000.75); 
     accountManagement.addAccount(account1);
     accountManagement.addAccount(account2);
     accountManagement.performOperation();
     
     System.out.println("");
     // Loan Processing (Stack ADT)
     LoanProcessing loanProcessing = new LoanProcessing();
     Loan loan1 = new Loan("L001", "Ali Iqbal", 50000.00); 
     Loan loan2 = new Loan("L002", "Zain Ahmed", 70000.00); 
     loanProcessing.pushLoan(loan1);
     loanProcessing.pushLoan(loan2);
     loanProcessing.performOperation();

     System.out.println("");
     // Bill Payment (Queue ADT)
     BillPayment billPayment = new BillPayment();
     billPayment.addBillPayment("Electricity Bill - 1000 PKR");
     billPayment.addBillPayment("Water Bill - 500 PKR");
     billPayment.performOperation();
     
     System.out.println("");
     // Removing the bill and processing the next one
     billPayment.removeBillPayment();
     billPayment.performOperation();
 }
}

