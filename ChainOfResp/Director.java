public class Director extends LoanApprover {
    @Override
    public void approveLoan(Loan loan) {
        if (loan.getAmount() <= 1000000) { 
            System.out.println("Loan approved by " + this.getClass().getName() +" of amount "+loan.getAmount());
        } else if (getNextApprover() != null) {
            getNextApprover().approveLoan(loan);
        } else {
            System.out.println("Loan not approved");
        }
    }
}