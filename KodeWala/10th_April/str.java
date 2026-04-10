class Str{
    public static void main(String[] args){
        String s1 = "Fazal";//scp
        String s2 = s1.concat(" Anjum");
        System.out.println(s2);
        String s3 = "Fazal Anjum";
        System.out.println(s2 == s3);
        String t = "Faz";
        String s = t+"al";//heap
        System.out.println(s);
        System.out.println(s1 == s);
    }
}