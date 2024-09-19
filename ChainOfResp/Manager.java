public class Manager extends LoanApprover {
    @Override
    public void approveLoan(Loan loan) {
        if (loan.getAmount() <= 500000) {
            System.out.println("Loan approved by " + this.getClass().getName() + "of amount "+loan.getAmount());
        } else if (getNextApprover() != null) {
            getNextApprover().approveLoan(loan);
        } else {
            System.out.println("Loan not approved");
        }
    }
}