//callstack example
public class Problem_8{
    public void D(){
        System.out.println("In method D:");
    }
    public void C(){
        System.out.println("In method C:");
    }
    public void B(){
        C();
        System.out.println("In method B:");
    }
    public void A(){
        B();
        System.out.println("In method A:");
    }

    public  void main(String[] args){
        A();
        D();
    }
}