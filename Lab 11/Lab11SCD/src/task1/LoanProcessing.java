package task1;

//Bank class using Stack ADT for processing loan takers
import java.util.Stack;

class LoanProcessing implements Bank {
     private Stack<Loan> loans = new Stack<>();

 public void pushLoan(Loan loan) {
     loans.push(loan);
 }

 public Loan popLoan() {
     return loans.isEmpty() ? null : loans.pop();
 }

 public Loan peekLoan() {
     return loans.isEmpty() ? null : loans.peek();
 }

 public boolean isEmpty() {
     return loans.isEmpty();
 }

 @Override
 public void performOperation() {
     System.out.println("Loan Processing Operation:");
     if (!loans.isEmpty()) {
         System.out.println("Processing Loan: " + loans.peek().getLoanTakerName() + 
                            " for amount: " + loans.peek().getLoanAmount() + " PKR");
     } else {
         System.out.println("No loans to process.");
     }
 }
}

