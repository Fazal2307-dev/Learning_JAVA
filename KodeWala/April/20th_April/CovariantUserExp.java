class User{
  User login(){
        System.out.println("User login....");
        return this;
    }
}
class Client extends User{
    @Override
    Client login(){
        System.out.println("Client login....");
        return this;
    }
}
class CovariantUserExp{
    public static void main(String[] args){
        Client c1 = new Client();
        c1.login();
    }
}