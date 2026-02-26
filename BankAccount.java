public abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    
    protected abstract void deposit(double amt);
    protected abstract void withdraw(double amt);
    protected abstract double calcInterest();
}