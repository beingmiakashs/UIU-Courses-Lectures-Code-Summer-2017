package com.sa.ThirdLab;

import java.util.Scanner;

/**
 * Created by akashs on 6/11/17.
 */
public class Solution {
    public static void main(String[] args) {
        BankAccount[] bankAccounts = new BankAccount[10];
        bankAccounts[0] = new BankAccount("011123","Abhi", 125);
        bankAccounts[1] = new BankAccount("011189","Ashis", 500);
        bankAccounts[2] = new BankAccount("011254","Swapnil", 700);

        Scanner sc = new Scanner(System.in);
        while(true) {

            String accountNo = sc.next();
            if(accountNo.equals("exit")){
                break;
            }

            for (int i = 0; i < 3; i++) {
                String temp = bankAccounts[i].getAccountNo();
                if (accountNo.equals(temp)) {
                    printMenu();
                    int ch = sc.nextInt();
                    if (ch == 1) {
                        System.out.println("Enter deposit amount: ");
                        double amount = sc.nextDouble();
                        bankAccounts[i].deposit(amount);
                    } else if (ch == 2) {
                        System.out.println("Enter withdraw amount: ");
                        double amount = sc.nextDouble();
                        bankAccounts[i].withdraw(amount);
                    }
                }
            }
        }
    }
    static void printMenu(){
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Display");
        System.out.println("Enter your choice: ");
    }
}









