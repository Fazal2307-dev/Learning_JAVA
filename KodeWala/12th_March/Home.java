//write a prgramme to print Home details
class House{
    public static void main(String args[]){
        System.out.println("You are entering main Gate");
        Gate1.main();

    }
}

class Gate1{
    public static void main(){
        System.out.println("This is Gate1");
        Gate2.main();
    }
}
class Gate2{
    public static void main(){
        System.out.println("This is gate2");
    }
}