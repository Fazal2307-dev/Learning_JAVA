

class Payment{
    int amount;
    String uId;
    String note;
    String mobileNo;
    String bank;

    public Payment(int _amount,String _uId) {
        this.amount=_amount;
        this.uId = _uId;
    }
    public Payment(int _amount,String _uId,String _note) {
        this.amount=_amount;
        this.uId=_uId;
        this.note=_note;
    }
    public Payment(int _amount,String _uId,String _note,String _mobileNo,String _bank) {
        this.amount=_amount;
        this.uId=_uId;
        this.note=_note;
        this.mobileNo=_mobileNo;
        this.bank=_bank;
    }

}


public class Driver {

    public static void main(String[] args) {
        Payment pay1 = new Payment(1200,"set321@");
        System.out.println(pay1.amount);
        System.out.println(pay1.uId);
        Payment pay2 = new Payment(1200,"set321@","Do Work");
        System.out.println(pay2.amount);
        System.out.println(pay2.uId);
        System.out.println(pay2.note);

        Payment pay3 = new Payment(1200,"set321@","completed","98784566","SBI");
        System.out.println(pay3.amount);
        System.out.println(pay3.uId);
        System.out.println(pay3.note);
        System.out.println(pay3.mobileNo);
        System.out.println(pay3.bank);


    }

}
