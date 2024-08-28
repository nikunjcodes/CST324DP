import java.util.*;;
public class SalesManager implements Employee {
    public String name;
    public String position;
    public int salary;
    public List<Employee> employees;
    public SalesManager(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        employees = new ArrayList<Employee>();
    }
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public int getSalary() {
        return salary;
    }
    public void add(Employee employee) {
        employees.add(employee);
    }
    public void remove(Employee employee) {
        employees.remove(employee);
    }
    public Employee getChild(int i) {
        return employees.get(i);
    }
    public void displayTeam() {
        System.out.println("Name = " + getName());
        System.out.println("Position = " + getPosition());
        System.out.println("Salary = " + getSalary());
        System.out.println("Employees:");
        for (Employee employee : employees) {
            employee.displayTeam();
        }
    }
    public void showEmployeeDetails(){
        System.out.println("Name = " + getName());
        System.out.println("Position = " + getPosition());
        System.out.println("Salary = " + getSalary());
    }
    
}
