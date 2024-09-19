public class ChainDemo {
    public static void main(String[] args) {
        LoanApprover a = new Manager();
        LoanApprover b = new Director();
        LoanApprover c = new President();
        
        a.setNextApprover(b);
        b.setNextApprover(c);
        
        a.approveLoan(new Loan(5000000)); 
        a.approveLoan(new Loan(500000));   
        b.approveLoan(new Loan(5000000));
        b.approveLoan(new Loan(1020202020));
    }
}
