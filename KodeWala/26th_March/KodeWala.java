class KodeWala{

    public static void main(String[] args){
        KodeWala kodewala = new KodeWala();
        String userInputStr = args[0];
        int userInputInt = Integer.parseInt(userInputStr);
        kodewala.newBatch(userInputInt);
    }

    public void newBatch(int amount){
        if(amount == 7000){
            System.out.println("you paid only for class :");
        } else if(amount >7000 && amount <27000) {
         System.out.println("you paid for classes and book :");
        } else if(amount == 27000){
            System.out.println("You paid whole fees :");
        }else{
           System.out.println("You havn't paid any amount") ;
        }
    }
}