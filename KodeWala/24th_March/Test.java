class Test{
    static int comute(){
        int x =1;
        try{
            return x;
        } finally {
            x =2;
        }
    }
    public static void main(String args[]){
        System.out.println(comute());
    }
}
