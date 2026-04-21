class LoginService{
    public void doLogin(String mobile,int otp) {
        System.out.println("LoginService.doLogin(String mobile,int otp)");
    }
    public void doLogin(String mobile,int otp,String aadhar) {
        System.out.println("LoginService.doLogin(String mobile,int otp,String aadhar)");
    }
    public void doLogin(String mobile,String password) {
        System.out.println("LoginService.doLogin(String mobile,String password)");
    }public void doLogin(String mobile,String captcha,int no) {
        System.out.println("LoginService.doLogin(String mobile,String captcha,int no)");
    }
}


public class UserLogin{

    public static void main(String[] args) {
        LoginService login = new LoginService();
        login.doLogin("987845611", "jshgdfkjas");
    }
}
