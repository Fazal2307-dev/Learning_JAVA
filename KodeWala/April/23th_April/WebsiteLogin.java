 class SignUP {
    public boolean doSignUP(String voterCard,String otp) {
        System.out.println("SignUP.doSignUp(String voterCard,String otp)");
        return true;
    }
    public boolean doSignUP(int phoneNo,String otp) {
        System.out.println("SignUP.doSignUp(int phoneNo,String otp)");
        return true;
    }
    public boolean doSignUP(String panCard) {
        System.out.println("SignUP.doSignUp(String panCard)");
        return true;
    }


}
public class WebsiteLogin {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SignUP sign = new SignUP();
        sign.doSignUP("54698796");
    }

}
