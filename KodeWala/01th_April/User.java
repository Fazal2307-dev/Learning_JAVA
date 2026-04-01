class User {

    int accountNo;
    int amount;
    String accountHolderName;

    public User(int _accountNo,int _amount,String _accountHolderName) {
        System.out.println("Calling User Details (int _accountNo,int _amount,String _accountHolderName)");
        this.accountNo = _accountNo;
        this.amount = _amount;
        this.accountHolderName = _accountHolderName;
    }
}

class BankDetails{
    public static void main(String[] args) {
        User  user1 = new User(7589464,12456,"Md Fazal");
        System.out.println("user1--accountNo--"+user1.accountNo);
        System.out.println("user1 --amount--"+user1.amount);
        System.out.println("user1 --accountHolderName--"+user1.accountHolderName);

        User user2 = new User(546976,2364,"MD Afzal");
        System.out.println("user2 --accountNo--"+user2.accountNo);
        System.out.println("user2 --amount--"+user2.amount);
        System.out.println("user2 --accountHolderName--"+user2.accountHolderName);

    }
}