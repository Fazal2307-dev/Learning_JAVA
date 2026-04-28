//1.Write a Java program to create an interface Shape with the getArea() method.
// Create three classes Rectangle, Circle, and Triangle that implement the Shape
// interface. Implement the getArea() method for each of the three classes.

interface Shape{
    public abstract double getArea();
}
class Rectangle implements Shape{

    private double length;
    private double width;
    Rectangle(double length,double width){
        this.length=length;
        this.width = width;
    }
    @Override
    public double getArea(){
        return length * width;
    }
}
class Circle implements Shape{
    private double radius;
    Circle(double radius){
        this.radius= radius;
    }
    @Override
    public double getArea(){
    return 3.14*radius*radius;
    }
}
class Triangle implements Shape{
    private double base;
    private double height;
    Triangle(double base,double height){
        this.base=base;
        this.height = height;
    }
    @Override
    public double getArea(){
        return 0.5*base*height;

    }
}
public class Shape_getArea {
    public static void  main(String[] args){
        Shape r1 = new Rectangle(12,5.0);
        System.out.println("Area of Rectangle :"+r1.getArea());
        Shape c1 = new Circle(5.0);
        System.out.println("Area of Circle :"+c1.getArea());
        Shape t1 = new Triangle(5,6);
        System.out.println("Area of Triangle :"+t1.getArea());
    }
}