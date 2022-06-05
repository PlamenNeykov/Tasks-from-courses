package DefinigClassesL03;

public class BankAccount {

//    •	Id: int (Starts from 1 and increments for every new account)
//•	Balance: double
//•	Interest rate: double (Shared for all accounts. Default value: 0.02)

    private int id;
    private static int countID = 1;
    private double balance;
    private static double interestRate = 0.02;

    public BankAccount() {
        this.id = countID;
        countID++;
    }

    public int getId() {
        return id;
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterest(int years) {
        return interestRate * years * this.balance;
    }

    public void deposit(double amount){
        this.balance +=amount;
    }

}
