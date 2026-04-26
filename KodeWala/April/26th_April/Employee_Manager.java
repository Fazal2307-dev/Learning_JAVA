//4.Write a Java program to create a class Employee with a method called calculateSalary().
// Create two subclasses Manager and Programmer. In each subclass, override the
// calculateSalary() method to calculate and return the salary based on their specific roles.
class Employee{
    void calculateSalary(){
        System.out.println("Employee.calculateSalary()");
    }
}
class Manager extends Employee{
    @Override
    void calculateSalary(){
        System.out.println("Manager.calculateSalary()");
    }
}
class Programmer extends Employee{
    @Override
    void calculateSalary(){
        System.out.println("Programmer.calculateSalary()");
    }
}
public class Employee_Manager {
    public static void main(String[] args){
        Employee e1 = new Manager();
        e1.calculateSalary();
        System.out.println(".............");
        Employee e2 = new Programmer();
        e2.calculateSalary();
    }
}