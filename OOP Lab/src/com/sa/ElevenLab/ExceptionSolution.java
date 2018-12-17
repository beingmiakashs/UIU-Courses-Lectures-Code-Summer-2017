package com.sa.ElevenLab;

import java.util.Scanner;

/**
 * Created by akashs on 8/20/17.
 */
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
public class ExceptionSolution {
    public static void checkNum(int num) throws MyException{
        if(num%2==1){
            throw new MyException("Hello Exception");
        }
        System.out.println("Function execution completed");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            checkNum(scanner.nextInt());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        while(true) {
            int a = scanner.nextInt();
            if(a==-1) break;
            int b = scanner.nextInt();

            try {
                int result = a / b;
                System.out.println("Result: "+result);
            }
            catch (IndexOutOfBoundsException ex){
                System.out.println("Invalid Input: "+ex.getMessage());
            }
            catch (ArithmeticException ex){
                System.out.println("Invalid Input: "+ex.getMessage());
            }
            catch (Exception ex){
                System.out.println("Exception occured");
            }
            finally {
                System.out.println("Execution completed");
            }
        }
    }
}





