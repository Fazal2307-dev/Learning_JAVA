//8.Write a Java program to create a base class Shape with methods draw() and
// calculateArea(). Create three subclasses: Circle, Square, and Triangle. Override the
// draw() method in each subclass to draw the respective shape, and override the
// calculateArea() method to calculate and return the area of each shape.
class Shape{
    void draw(){
        System.out.println("Shape.draw()");
    }
    void calculateArea(){
        System.out.println("Shape.calculateArea()");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Circle.draw()");
    }
    @Override
    void calculateArea(){
        System.out.println("Circle.calculateArea()");
    }
}
class Square extends Shape{
    @Override
    void draw(){
        System.out.println("Square.draw()");
    }
    @Override
    void calculateArea(){
        System.out.println("Square.calculateArea()");
    }
}
class Triangle extends Shape{
    @Override
    void draw(){
        System.out.println("Triangle.draw()");
    }
    @Override
    void calculateArea(){
        System.out.println("Triangle.calculateArea()");
    }
}
public class Shap_Circle_Square_Triangle {
    public static void main(String[] args){
        Shape s1 = new Circle();
        s1.draw();
        s1.calculateArea();
        System.out.println("................");
        Shape s2 = new Square();
        s2.draw();
        s2.calculateArea();
        System.out.println("..................");
        Shape s3 = new Triangle();
        s3.draw();
        s3.calculateArea();
    }
}