class Messege{
public static void main(String args[]){
    int userInput = Integer.parseInt(args[0]);
    Messege messege = new Messege();
    messege.getMessege(userInput);
}
    public void getMessege( int n){
        for(int i =0;i<n;i++){
            System.out.println("you got messege :"+i);
        }
    }
}