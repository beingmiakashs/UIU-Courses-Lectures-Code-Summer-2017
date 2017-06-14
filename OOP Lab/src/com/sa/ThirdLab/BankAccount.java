package com.sa.ThirdLab;

/**
 * Created by akashs on 6/11/17.
 */
public class BankAccount {
    private String accountNo;
    private String accountName;
    private double balance;

    public String getAccountNo() {
        return accountNo;
    }

    public BankAccount(String accountNo, String accountName, double balance) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
    }

    public void deposit(double depAmount){
        balance += depAmount;
        System.out.println("Successfully deposit "+depAmount);
    }

    public void withdraw(double widAmount){
        if(balance>widAmount){
            balance-=widAmount;
            System.out.println("Successfully withdraw "+widAmount);
        }
        else {
            System.out.println("You do not have enough balance.");
        }
    }

    public void display(){
        System.out.println(accountNo+" "+accountName+" "+balance);
    }

}











