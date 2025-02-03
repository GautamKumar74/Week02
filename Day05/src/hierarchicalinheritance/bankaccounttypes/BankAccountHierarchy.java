package hierarchicalinheritance.bankaccounttypes;

public class BankAccountHierarchy {
    public static void main(String[] args) {
        // Create objects for each account type
        SavingsAccount savings = new SavingsAccount("SAV12345", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CHK12345", 2000.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD12345", 10000.0, 12);

        // Display account details and types for each object
        System.out.println("Savings Account Details:");
        savings.displayAccountType();
        savings.displaySavingsDetails();
        System.out.println();

        System.out.println("Checking Account Details:");
        checking.displayAccountType();
        checking.displayCheckingDetails();
        System.out.println();

        System.out.println("Fixed Deposit Account Details:");
        fixedDeposit.displayAccountType();
        fixedDeposit.displayFixedDepositDetails();
    }
}
