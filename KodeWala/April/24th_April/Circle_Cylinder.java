//Write a Java program to create a base class Shape with methods draw() and
// calculateArea(). Create two subclasses Circle and Cylinder. Override the draw()
// method in each subclass to draw the respective shape. In addition, override the
// calculateArea() method in the Cylinder subclass to calculate and return the total
// surface area of the cylinder.
// Base class
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public double calculateArea() {
        System.out.println("Calculating area of shape");
        return 0;
    }
}

// Subclass Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Cylinder
class Cylinder extends Shape {
    double radius;
    double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Cylinder");
    }

    // Total Surface Area of Cylinder = 2πr(r + h)
    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

// Driver class
public class Circle_Cylinder{
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        System.out.println(s1.calculateArea());
        s1.draw();

        Shape s2 = new Cylinder(3, 7);
        System.out.println(s2.calculateArea());
        s2.draw();
    }
}