public class President extends LoanApprover {
    @Override
    public void approveLoan(Loan loan) {
        if (loan.getAmount() <= 5000000) { 
            System.out.println("Loan approved by " + this.getClass().getName() + " of amount "+loan.getAmount());
        } else {
            System.out.println("Loan not approved");
        }
    }
}
