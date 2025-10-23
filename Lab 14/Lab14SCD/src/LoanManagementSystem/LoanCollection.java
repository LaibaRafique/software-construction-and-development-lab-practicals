package LoanManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Abstract Data Type for managing a collection of loans
public class LoanCollection<T> {
    private List<T> loans;

    public LoanCollection() {
        loans = new ArrayList<>();
    }

    public void addLoan(T loan) {
        loans.add(loan);
    }

    public List<T> getLoans() {
        return loans;
    }

    public double calculateTotalLoanAmount() throws UnsupportedOperationException {
        double total = 0.0;

        for (T loan : loans) {
            if (loan instanceof MutableLoan<?>) {
                total += Double.parseDouble(((MutableLoan<?>) loan).getLoanAmount().toString());
            } else if (loan instanceof ImmutableLoan<?>) {
                total += Double.parseDouble(((ImmutableLoan<?>) loan).getLoanAmount().toString());
            } else {
                throw new UnsupportedOperationException("Unsupported loan type for total calculation.");
            }
        }

        return total;
    }
}
