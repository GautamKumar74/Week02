public class BankAccount {
    // Attributes of the BankAccount class
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize BankAccount objects
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money (only if sufficient balance exists)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("John Doe", "123456789", 1000.00);

        // Displaying the current balance
        account.displayBalance();

        // Depositing money
        account.deposit(500.00);
        account.displayBalance();

        // Withdrawing money
        account.withdraw(300.00);
        account.displayBalance();

        // Attempting to withdraw more than the balance
        account.withdraw(1500.00);
        account.displayBalance();
    }
}
