class Circle {
    double radius;
    String color;

    // Constructor 1 — both values
    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Constructor 2 — only radius, default color
    Circle(double radius) {
        this.radius = radius;
        this.color = "white";
    }

    // Constructor 3 — no values, all defaults
    Circle() {
        this.radius = 1.0;
        this.color = "white";
    }
}
 public class Circle{
    public static void main(String[] args){
        Circle c1 = new Circle(5.5, "red");
        Circle c2 = new Circle(3.0);
        Circle c3 = new Circle();
    }
 }
