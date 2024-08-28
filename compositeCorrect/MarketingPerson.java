public class MarketingPerson implements Employee {
    public String name;
    public String position;
    public int salary;
    public MarketingPerson(String name, String position, int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public int getSalary(){
        return salary;
    }
    public void add(Employee employee){
        System.out.println("Cannot add to a Marketing Person");
    }
    public void remove(Employee employee){
        System.out.println("Cannot remove from a Marketing Person");
    }
    public Employee getChild(int i){
        return null;
    }
    public void displayTeam(){
        System.out.println("Name = " + getName());
        System.out.println("Position = " + getPosition());
        System.out.println("Salary = " + getSalary());
    }
    public void showEmployeeDetails(){
        System.out.println("Name = " + getName());
        System.out.println("Position = " + getPosition());
        System.out.println("Salary = " + getSalary());
    }
    
}
