package Data_Hiding;

import javax.swing.*;

class Bank_AccountTest {
    private String accountholdername;
    private int accountnumber;
    private double balance;

    // Getter Method
    public String getAccountholdername() {
        return accountholdername;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    //Constructor
    public Bank_AccountTest(String name, int accno, double balance){
        this.accountholdername = name;
        this.accountnumber = accno;
        this.balance = balance;
    }

    //Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount);
        } else
            System.out.println("Invalid deposit amount.");
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Successfullly : " + amount);
        } else
            System.out.println("Insufficient balance.");
    }
}

public class Bank_Account{
    public static void main(String[] args){
        Bank_AccountTest b = new  Bank_AccountTest("Rohit Sahu", 754237, 4000);
        System.out.println("Account Holder : "+b.getAccountholdername());
        System.out.println("Account number : "+b.getAccountnumber());
        b.deposit(2000);
        b.withdraw(600);
        System.out.println("Current Balance : "+b.getBalance());

    }



}
