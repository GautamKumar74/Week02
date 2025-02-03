package hierarchicalinheritance.bankaccounttypes;

class FixedDepositAccount extends BankAccount {
    private int maturityPeriod; // in months

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    public void displayFixedDepositDetails() {
        displayAccountDetails();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}
