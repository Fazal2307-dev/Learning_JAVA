class Student {
String name;
int age;
// No constructor defined here
}

public class AutoDefaultConst{
    public static void main(String[] args) {
        Student s1 = new Student(); // Java automatic default constructor call karega
        System.out.println("Name: " + s1.name); // null
        System.out.println("Age: " + s1.age);   // 0
    }
}
