package bankingsystem;

interface Loanable {
    void applyForLoan(double loanAmount);
    double calculateLoanEligibility();
}
