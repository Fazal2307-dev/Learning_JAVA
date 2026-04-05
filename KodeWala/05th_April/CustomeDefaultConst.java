class Student {
    String name;
    int age;

    // Custom Default Constructor
    Student() {
        name = "Unknown";
        age = -1;
    }
}

public class CustomeDefaultConst {
    public static void main(String[] args) {
        Student s1 = new Student(); // Tumhara custom default constructor call hoga
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}
