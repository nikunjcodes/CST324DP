import java.util.*;
public class Employee {
    public String name;
    public String position;
    public int salary;
    public List<Employee> subordinates = new ArrayList<Employee>();
    public Employee(String name, String position, int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public String toString(){
        return "Employee : [ Name : " + name + ", Position : " + position + ", Salary : " + salary + " ]";
    }
    public void add(Employee employee){
        subordinates.add(employee);
    }
    public List<Employee> getSubordinates(){
        return subordinates;
    }
    public void displaySubordinates(){
        Employee node = this;
        System.out.println(node.toString());
        for(Employee headEmployee : node.getSubordinates()){
            if(headEmployee.getSubordinates().size() == 0){
                System.out.println(headEmployee);
            }
            System.out.println(headEmployee);
            for(Employee employee : headEmployee.getSubordinates()){
                System.out.println(employee);
            }
        }
        }
    }

    

