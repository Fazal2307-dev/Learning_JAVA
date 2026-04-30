
interface UserBank{
    void logIn();
    void pay();
    void withdraw();
    void deposite();
    public static void eKYC() {
        System.out.println("UserBank.eKYC()");
    }
}

class SBI implements UserBank{

    @Override
    public void logIn() {
        System.out.println("SBI.logIn()");

    }

    @Override
    public void pay() {
        System.out.println("SBI.pay()");

    }

    @Override
    public void withdraw() {
        System.out.println("SBI.withdraw()");

    }

    @Override
    public void deposite() {
        System.out.println("SBI.deposite()");
    }
}


class HDFC implements UserBank{

    @Override
    public void logIn() {
        System.out.println("HDFC.logIn()");

    }

    @Override
    public void pay() {
        System.out.println("HDFC.pay()");

    }

    @Override
    public void withdraw() {
        System.out.println("HDFC.withdraw()");

    }

    @Override
    public void deposite() {
        System.out.println("HDFC.deposite()");
        UserBank.eKYC();
    }

}
public class BankSystem {

    public static void main(String[] args) {
        UserBank u1 = new SBI();
        u1.logIn();
        u1.deposite();
        u1.pay();
        u1.withdraw();

        UserBank h1 = new HDFC();
        h1.deposite();
        h1.logIn();
        h1.pay();
        h1.withdraw();


    }

}
