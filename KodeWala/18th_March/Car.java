//write a programme about car
class Car{
    String brand;
    int speed;
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.speed = 120;
        System.out.println("Car Name is:"+myCar.brand);
        System.out.println("Car speed is:"+myCar.speed);
    }
}