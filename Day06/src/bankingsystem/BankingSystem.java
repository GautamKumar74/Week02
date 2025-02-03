package bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {
        // List to store accounts
        List<BankAccount> accounts = new ArrayList<>();

        // Adding accounts to the list
        accounts.add(new SavingsAccount("S101", "Alice", 5000, 4.5));
        accounts.add(new CurrentAccount("C202", "Bob", 10000, 2000));

        // Process accounts
        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.applyForLoan(20000);
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
            }

            System.out.println("---------------------------");
        }

        // Demonstrating transactions
        BankAccount savings = new SavingsAccount("S303", "Charlie", 3000, 3.5);
        savings.deposit(2000);
        savings.withdraw(4000);
        savings.displayDetails();
    }
}

