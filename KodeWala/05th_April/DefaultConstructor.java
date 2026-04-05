class Student {
    String name;
    int age;

    // Default Constructor (no parameters)
    Student() {
        name = "Unknown";
        age = 0;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        // Object creation -> default constructor call hoga
        Student s1 = new Student();
        s1.display();
    }
}
