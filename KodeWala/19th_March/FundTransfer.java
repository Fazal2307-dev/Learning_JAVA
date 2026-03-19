public class FundTransfer{
    public static void transfer(String fromAccount,String toAccount,double amount){
        if( amount > 0){
            System.out.println("Transfered INR"+amount+"from"+fromAccount+"to"+toAccount);
        } else{
            System.out.println("Invalid transfer amount.");
        }
    }
    public static void main(String args[]){
        FundTransfer fundTransfer = new FundTransfer();
        fundTransfer.transfer("123456","879456",5000.00);
    }
}