import java.util.*;

public class BankAccount {
    static String bankName = "ABC Bank";
    final int accountNumber;
    String accountHolderName;
    static int totalAccount = 0;
    static int counter = 1000;
	
    // Static list to store all BankAccount objects
    private static List<BankAccount> allAccounts = new ArrayList<>();
	
    // Constructor
    BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = counter++;
        totalAccount += 1;
        allAccounts.add(this); // Add the current object to the list
	}
	
    // Static method to get the total number of accounts
    static int getTotalAccounts() {
        return totalAccount;
	}
	
	// Static method to list all accounts with instanceof check
	static void listAllAccounts() {
		System.out.println("\nList of all bank accounts created:");
		for (Object obj : allAccounts) {
			if (obj instanceof BankAccount) {
				BankAccount account = (BankAccount) obj;
				System.out.println("Account Holder: " + account.accountHolderName + ", Account Number: " + account.accountNumber);
				} else {
				System.out.println("Unknown object found in the accounts list.");
			}
		}
	}
	
	
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        while (true) {
            System.out.println("Give your name for opening bank account name (or type 'exit' to finish):");
            String accountHolderName = sc.nextLine();
			
            if (accountHolderName.equalsIgnoreCase("exit")) {
                break;
			}
			
            new BankAccount(accountHolderName);
            System.out.println("Account created for " + accountHolderName);
            System.out.println("Total accounts created: " + BankAccount.getTotalAccounts());
		}
		
        // List all created accounts
        BankAccount.listAllAccounts();
        sc.close();
	}
}
