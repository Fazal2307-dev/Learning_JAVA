interface BankUser{
    public abstract void logIn();
    public abstract void savingAcc();
    public abstract void currentAcc();
    public abstract void logOut();
}
class User implements BankUser{
    @Override
    public void logIn(){
        System.out.println("User.logIn()");
    }
    @Override
    public void savingAcc(){
        System.out.println("User.savingAcc()");
    }
    @Override
    public void currentAcc(){
        System.out.println("User.currentAcc()");
    }
    @Override
    public void logOut(){
        System.out.println("User.logOut()");
    }
}
public class BankSystem {
    public static void main(String[] args){
        BankUser id = new User();
        id.logIn();
        id.savingAcc();
        id.currentAcc();
        id.logOut();
    }
}