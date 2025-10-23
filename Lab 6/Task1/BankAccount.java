package Task1;

class BankAccount {
    private int balance = 50000;

    public synchronized void withdraw(String accountHolder, int amount) {
        if (balance >= amount) {
            System.out.println(accountHolder + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(accountHolder + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(accountHolder + " attempted to withdraw " + amount + ". Insufficient funds.");
        }
    }
}

