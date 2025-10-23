package Task1;

class AccountHolder extends Thread {
    private BankAccount account;
    private String name;
    private int amountToWithdraw;

    public AccountHolder(BankAccount account, String name, int amountToWithdraw) {
        this.account = account;
        this.name = name;
        this.amountToWithdraw = amountToWithdraw;
    }

    public void run() {
        account.withdraw(name, amountToWithdraw);
    }
}

