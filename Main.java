import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // Savings Account Inputs

        System.out.println("Enter Savings Account initial balance: ");
        double balanceSavings = sc.nextDouble();
        SavingsAccount savingsAccount1 = new SavingsAccount(balanceSavings);
        System.out.println("Enter amount to deposit into Savings Account: ");
        double depositAmtSavings = sc.nextDouble();
        System.out.println("Enter amount to withdraw from Savings Account: ");
        double withdrawAmtSavings = sc.nextDouble();

        // Checkings Account Inputs
        
        System.out.println("Enter Checkings Account initial balance: ");
        double balanceCheckings = sc.nextDouble();
        CheckingsAccount checkingsAccount1 = new CheckingsAccount(balanceCheckings);
        System.out.println("Enter amount to deposit into Checkings Account: ");
        double depositAmtCheckings = sc.nextDouble();
        System.out.println("Enter amount to withdraw from Checkings Account: ");
        double withdrawAmtCheckings = sc.nextDouble();

        // Output

        System.out.println("--- Savings Account ---");
        System.out.println("Initial Balance: $" + balanceSavings);
        savingsAccount1.deposit(depositAmtSavings);
        System.out.println("Deposit successful. New Balance: $" + savingsAccount1.balance);
        savingsAccount1.withdraw(withdrawAmtSavings);
        System.out.println("Withdrawal successful. New Balance: $" + savingsAccount1.balance);
        System.out.println("Interest (5%) Applied: $" + savingsAccount1.balance*.05);
        savingsAccount1.calcInterest();
        System.out.println("Final Balance: $" + savingsAccount1.balance);

        System.out.println("--- Checkings Account ---");
        System.out.println("Initial Balance: $" + balanceCheckings);
        checkingsAccount1.deposit(depositAmtCheckings);
        System.out.println("Deposit successful. New Balance: $" + checkingsAccount1.balance);
        checkingsAccount1.withdraw(withdrawAmtCheckings);
        System.out.println("Withdrawal successful. New Balance: $" + checkingsAccount1.balance);
        System.out.println("Interest (1%) Applied: $" + checkingsAccount1.balance*.01);
        checkingsAccount1.calcInterest();
        System.out.println("Final Balance: $" + checkingsAccount1.balance);

    }
}