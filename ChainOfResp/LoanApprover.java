public abstract class LoanApprover {
    private LoanApprover nextApprover;

    public LoanApprover getNextApprover() {
        return nextApprover;
    }

    public void setNextApprover(LoanApprover nextApprover) {
        this.nextApprover = nextApprover;
    }
    public abstract void approveLoan(Loan loan);

}
