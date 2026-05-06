interface PremiumUser{

}
class User implements PremiumUser{
    String name;
    User(String name){
        this.name = name;
    }
}
class Service{
    void provideService(Object obj){
        if(obj instanceof PremiumUser){
            System.out.println("Premium feature enabled");
        } else{
            System.out.println("Basic feature only");
        }
    }
}
public class VehicalPass {
    public static void  main(String[] args){
        User u = new User("Fazal");
        Service s = new Service();
        s.provideService(u);

    }
}