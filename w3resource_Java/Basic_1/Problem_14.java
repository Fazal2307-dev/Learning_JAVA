//Write a Java program to check whether Java is installed
// on your computer.
public class Problem_14{
    public static void main(String[] args) {
        System.out.println("\nJava Version :"+System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
    }
}