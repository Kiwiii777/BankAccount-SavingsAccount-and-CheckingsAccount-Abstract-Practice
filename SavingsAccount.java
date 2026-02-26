public class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double depositAmt) {
        balance += depositAmt;
    }

    @Override
    public void withdraw(double withdrawAmt) {
        if (withdrawAmt <= balance - 200) {
            balance -= withdrawAmt;
        } else {
            System.out.println("You cannot withdraw that much!");
        }
    }

    @Override
    public double calcInterest() {
        balance*=1.05;
        return balance;
    }
}