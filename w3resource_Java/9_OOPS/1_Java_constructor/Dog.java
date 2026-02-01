//Write a Java program to create a class called Dog with instance variables name and
// color. Implement a parameterized constructor that takes name and color as parameters
// and initializes the instance variables. Print the values of the variables.
public class Dog {
    // Private instance variables
    private String name;
    private String color;

    // Parameterized constructor
    public Dog(String name, String color) {
        // Initialize name with the provided parameter
        this.name = name;
        // Initialize color with the provided parameter
        this.color = color;
    }

    // Main method to test the Dog class
    public static void main(String[] args) {
        // Create a new Dog object using the parameterized constructor
        Dog myDog = new Dog("Bailey", "Black");
        // Print the values of the instance variables
        System.out.println("Dog's Name: " + myDog.name);
        System.out.println("Dog's Color: " + myDog.color);
    }
}