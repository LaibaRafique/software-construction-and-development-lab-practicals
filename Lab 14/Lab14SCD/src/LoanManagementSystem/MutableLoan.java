package LoanManagementSystem;

//Mutable Loan Class
public class MutableLoan<T> {
 private T loanAmount;
 private String borrowerName;

 public MutableLoan(T loanAmount, String borrowerName) {
     this.loanAmount = loanAmount;
     this.borrowerName = borrowerName;
 }

 public T getLoanAmount() {
     return loanAmount;
 }

 public void setLoanAmount(T loanAmount) {
     this.loanAmount = loanAmount;
 }

 public String getBorrowerName() {
     return borrowerName;
 }

 public void setBorrowerName(String borrowerName) {
     this.borrowerName = borrowerName;
 }

 @Override
 public String toString() {
     return "MutableLoan [Loan Amount: " + loanAmount + ", Borrower: " + borrowerName + "]";
 }
}

