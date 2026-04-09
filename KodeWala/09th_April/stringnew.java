class StringNew{
    public static void main(String[] args){
        String s1 = new String("kodewala");
        String s2 = new String("Kodewala");
        String s3 = "Kodewala";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
    }
}