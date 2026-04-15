
class AccountMgmt{
    String ifscCode = "SBIN0018552";
    public void funndTransfer() {
        System.out.println("AccountMgmt.fundTransfer()");
    }

}

class Account extends AccountMgmt{
    public void pay() {
        Account acc = new Account();
        System.out.println("your ifsc code is : "+acc.ifscCode);
        acc.funndTransfer();


    }
}

public class Driver  {

    public static void main(String[] args) {
        Account account = new Account();
        account.pay();

    }

}
