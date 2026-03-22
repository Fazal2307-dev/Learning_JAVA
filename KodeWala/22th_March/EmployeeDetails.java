//write a programme to use the instance and static variable and display the details.
//instance variable can be employee detailslike name,age,and department.use company code
//as a static variable display the details in console
class EmployeeDetails{
    static int companyCode = 23421;
    String name ;
    int age ;
    String department;
    EmployeeDetails(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Company Code: " + companyCode);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Creating employee objects
        EmployeeDetails emp1 = new EmployeeDetails("Alice", 28, "HR");
        EmployeeDetails emp2 = new EmployeeDetails("Bob", 32, "Finance");
        EmployeeDetails emp3 = new EmployeeDetails("Charlie", 25, "IT");

        // Displaying details of each employee
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }

}