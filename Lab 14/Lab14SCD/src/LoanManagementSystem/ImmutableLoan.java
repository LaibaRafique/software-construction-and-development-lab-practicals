package LoanManagementSystem;

//Immutable Loan Class
public final class ImmutableLoan<T> {
 private final T loanAmount;
 private final String borrowerName;

 public ImmutableLoan(T loanAmount, String borrowerName) {
     this.loanAmount = loanAmount;
     this.borrowerName = borrowerName;
 }

 public T getLoanAmount() {
     return loanAmount;
 }

 public String getBorrowerName() {
     return borrowerName;
 }

 @Override
 public String toString() {
     return "ImmutableLoan [Loan Amount: " + loanAmount + ", Borrower: " + borrowerName + "]";
 }
}

