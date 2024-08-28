public interface Employee {
    public String getName();
    public String getPosition();
    public int getSalary();
    public void add(Employee employee);
    public void remove(Employee employee);  
    public Employee getChild(int i);
    public void displayTeam();
    public void showEmployeeDetails();
}
