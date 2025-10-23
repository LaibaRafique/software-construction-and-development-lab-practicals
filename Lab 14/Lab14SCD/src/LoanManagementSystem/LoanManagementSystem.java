package LoanManagementSystem;

public class LoanManagementSystem {
    public static void main(String[] args) {
        try {
            // Create loan collection
            LoanCollection<Object> loanCollection = new LoanCollection<>();

            // Create and add mutable loans
            MutableLoan<Integer> loan1 = new MutableLoan<>(5000, "Laiba");
            MutableLoan<Double> loan2 = new MutableLoan<>(7500.50, "Ali");
            loanCollection.addLoan(loan1);
            loanCollection.addLoan(loan2);

            // Create and add immutable loans
            ImmutableLoan<Integer> loan3 = new ImmutableLoan<>(10000, "Hamna");
            loanCollection.addLoan(loan3);

            // Display all loans
            System.out.println("Loans in the collection:");
            for (Object loan : loanCollection.getLoans()) {
                System.out.println(loan);
            }

            // Attempt to modify immutable loan (simulating exception)
            try {
                throw new ImmutableModificationException("Modification of immutable loan is not allowed!");
            } catch (ImmutableModificationException e) {
                System.out.println("\nException Caught: " + e.getMessage());
            }

            // Calculate and display the total loan amount
            double totalLoanAmount = loanCollection.calculateTotalLoanAmount();
            System.out.println("\nTotal Loan Amount: " + totalLoanAmount);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
