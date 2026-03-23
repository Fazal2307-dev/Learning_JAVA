// develop an application for creating voting card for user
// -min Age = 18
// -max Age = 100;
//accept input using command line
class VotingCard{
    public static void main(String args[]){
        String userAge =args[0];
        System.out.println("UserAge is:"+userAge);
        int voter = Integer.parseInt(userAge);
        int minAge = 18;
        int maxAge = 100;
        if(voter >minAge && voter<maxAge){
            System.out.println("Voter is valid");
        } else{
            System.out.println("Voter is not valid");

        }


    }
}