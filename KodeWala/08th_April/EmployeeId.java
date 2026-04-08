

class Employee {
    String name;
    String employeeId;

    static int counter =0;


    {
        counter++;
        employeeId = "EMP" + counter;

    }

    public Employee(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name + " | Employee ID: " + employeeId);
    }
}

public class EmployeeId {

    public static void main(String[] args) {
        Employee employee1 = new Employee("MD FAZAL");
        Employee employee2 = new Employee("Rohit");

        employee1.display();
        employee2.display();
    }
}