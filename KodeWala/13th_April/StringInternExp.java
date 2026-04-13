public class StringInternExp{
    public static void main(String[] args){
        String s1 = "KodeWala Academy";
        String s2 = new String("KodeWala Academy");
        System.out.println(s1 == s2);//false
        String s3 = s2.intern();
        System.out.println(s3 == s1);
    }
}