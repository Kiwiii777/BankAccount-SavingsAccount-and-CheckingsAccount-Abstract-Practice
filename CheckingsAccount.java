public class CheckingsAccount extends BankAccount {

    public CheckingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double depositAmt) {
        if (depositAmt <= 20000) balance += depositAmt;
        else System.out.println("Cannot deposit that much!");
    }

    @Override
    public void withdraw(double withdrawAmt) {
        if (withdrawAmt <= 900) {
            balance -= withdrawAmt;
        } else {
            System.out.println("You cannot withdraw that much!");
        }
    }

    @Override
    public double calcInterest() {
        balance*=1.01;
        return balance;
    }
}