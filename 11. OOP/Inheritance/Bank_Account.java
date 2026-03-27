package Inheritance;

//Parent Class
class Account{
    public int accountno;
    public String accountholder;
    public double balance;

    // Constructor
    public Account(int accountno, String accountholder, double balance){
        this.accountno = accountno;
        this.accountholder = accountholder;
        this.balance = balance;
    }

    //Deposit method
    void deposit(double amount){
        balance = amount+balance;
        System.out.println("Deposited "+amount);
    }

    //Withdraw method
    void withdraw(double amount){
        balance = balance-amount;
        System.out.println("Withdrawn "+amount);
    }

    //Display
    void display(){
        System.out.println("Account Number : "+accountno);
        System.out.println("Account Holder Name : "+accountholder);
        System.out.println("Current Balance : "+balance);
    }
}

//Derived Class
class SavingsAccount extends Account{
    public double interestrate;

    //Constructor
    public SavingsAccount(int accountno, String accountholder, double balance, double interestrate){
        super(accountno,accountholder,balance);
        this.interestrate = interestrate;
    }

    // add Interest
    void addInterest(){
        double interest = balance*interestrate/100;
        balance = balance+interest;
        System.out.println("Interest added : "+interest);
    }

}

public class Bank_Account {
    public static void main(String[] args){
        SavingsAccount s = new SavingsAccount(23465123, "Tanmay", 4000, 8);
        s.display();
        s.deposit(2000);
        s.withdraw(1500);
        s.display();

    }
}
