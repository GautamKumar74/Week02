package bankingsystem;

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }

    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Savings account loan applied for amount: " + loanAmount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; // Eligibility is twice the balance
    }
}
