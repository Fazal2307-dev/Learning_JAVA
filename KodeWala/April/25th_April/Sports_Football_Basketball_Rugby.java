//5.Write a Java program to create a base class Sports with a method called play(). Create
//three subclasses: Football, Basketball, and Rugby. Override the play() method in each
//subclass to play a specific statement for each sport.
class Sports{
    void play(){
        System.out.println("Sports.play()");
    }
}
class Football extends Sports{
    @Override
    void play(){
        System.out.println("FootBall.play()");
    }
}
class BasketBall extends Sports{
    @Override
    void play(){
        System.out.println("BasketBall.play()");
    }
}
class Rugby extends Sports{
    @Override
    void play(){
        System.out.println("Rugby.play()");
    }
}
public class Sports_Football_Basketball_Rugby {
    public static void main(String[] args){
        Sports s1 = new Football();
        s1.play();
        System.out.println("...........");
        Sports s2 = new BasketBall();
        s2.play();
        System.out.println("...........");
        Sports s3 = new Rugby();
        s3.play();
    }
}