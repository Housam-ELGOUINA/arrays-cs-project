package samplearrays;

import java.util.Arrays;

public class BankAccount {

    String name;
    double currentBalance;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    Double[] transactions   =  new Double[1000] ;

    public BankAccount(String name, int startingBalance){
        this.name = name;
        this.currentBalance = startingBalance  ;

    }

    public void deposit(double amount){
        if (amount <= 0) {
            return;
        }
        this.currentBalance += amount ;
        this.transactions  = Arrays.copyOf(this.transactions  , this.transactions.length +1);
        this.transactions[this.transactions.length -1] =  amount ;

    }

    public void withdraw(double amount){
        if (amount > this.currentBalance) {
            System.out.println("there are insufiscient funds in the bank account !");
        }
        this.currentBalance -= amount ;

        this.transactions = Arrays.copyOf(this.transactions , this.transactions.length +1) ;
        this.transactions[this.transactions.length -1] =  -amount ;


    }



    public void displayTransactions(){
        for (int  i = 0 ;  i < this.transactions.length ;i++ ){
            if (this.transactions[i] >= 0) {
                System.out.println("Deposit  : " + this.transactions[i]) ;
            } else {
                System.out.println("Withdrawal  : " + Math.abs(this.transactions[i])) ;
            }
        }


    }

    public void displayBalance(){
        System.out.println("Current Balance: " + this.currentBalance ) ;

    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
