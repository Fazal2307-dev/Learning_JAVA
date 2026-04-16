class Animal{
    void eat(){
        System.out.println("Animal are eating :");
    }
}

class Dog extends Animal{
    void barking(){
        System.out.println("Dogs are barking:");
    }
}
class Puppy extends Dog{
    void weep(){
        System.out.println("Puppy is weeping:");
    }
}
public class MultiLevel{
    public static void main(String[] args){
        Puppy puppy = new Puppy();
        puppy.barking();
        puppy.weep();
        puppy.eat();
    }
}