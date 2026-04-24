//9.Write a Java program to create a base class BankAccount with methods
// deposit() and withdraw(). Create two subclasses SavingsAccount and
// CheckingAccount. Override the withdraw() method in each subclass to impose
// different withdrawal limits and fees.
class BankAccount{
    void deposite(){
        System.out.println("BankAccount.deposite()");
    }
    void withdraw(){
        System.out.println("BankAccount.withdraw()");
    }
}
class SavingsAccount extends BankAccount{
    @Override
    void deposite(){
        System.out.println("SavingAccount.deposite(you are using savingAccount for deposite)");
    }
    @Override
    void withdraw(){
        System.out.println("SavingAccount.withdraw(you are using SavingAccount for withdraw)");
    }
}
class CheckingAccount extends BankAccount{
    @Override
    void deposite(){
        System.out.println("CheckingAccount.deposite(you are using checkingAccount for deposite)");
    }
    @Override
    void withdraw(){
        System.out.println("CheckingAccount.withdraw(you are using checkingAccount for withdraw)");
    }
}
public class BankAccount_Saving_Checking {
    public static void main(String[] args){
    BankAccount b1 = new SavingsAccount();
    b1.deposite();
    b1.withdraw();
    System.out.println(".....................");
    BankAccount b2 = new CheckingAccount();
    b2.withdraw();
    b2.deposite();
    }
}