package Task1;

public class JointAccountTest {
    public static void main(String[] args) {
        BankAccount jointAccount = new BankAccount();
        AccountHolder userA = new AccountHolder(jointAccount, "User A", 45000);
        AccountHolder userB = new AccountHolder(jointAccount, "User B", 20000);

        userA.start();
        userB.start();
    }
}

