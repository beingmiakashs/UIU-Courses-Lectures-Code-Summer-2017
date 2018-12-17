package com.sa.SectionNB.LectureFourteen;

import java.util.Scanner;

/**
 * Created by akashs on 8/2/17.
 */
public class ExceptionTutorial {
    public static void main(String[] args) {
        int[] ar = new int[3];
        Scanner scanner = new Scanner(System.in);
//        ar[4] = 54;
        while(true) {
            int n=0;
            try{
                n = scanner.nextInt();
                if(n==-1) break;
                ar[1] = scanner.nextInt();
                ar[n] = ar[1];
                ar[0] = n;
                try {
                    System.out.println(ar[0] / ar[1]);
                }
                catch (ArrayIndexOutOfBoundsException ex){

                }
                finally {
                    System.out.println("Finally one");
                }
                System.out.println("Execution complete");
            }
            catch (ArithmeticException ex){
                System.out.println("You enter an invalid input, try again"+ex.getMessage());
            }
            catch (ArrayIndexOutOfBoundsException ex){
                ar[2] = n;
                System.out.println("You enter an invalid index");
                ar[0] = n;
                System.out.println(ar[0] / ar[1]);
            }
            catch (Exception ex){
                System.out.println("Exception occured");
            }
            finally {
                System.out.println("Finally two");
            }


            System.out.println("Loop execution");

        }

        int n = scanner.nextInt();
        try {
            check(n);
        } catch (InvalidValueException e) {
            System.out.println(e.num);
        }
        finally {
            System.out.println("Invalid finally");
        }



    }

    public static void check(int num) throws InvalidValueException{
        if(num<=0){
            throw new InvalidValueException("Negative value", num);
        }
        int a = num+1;
        int res = a/num;
    }
}


class InvalidValueException extends Exception{
    int num;
    public InvalidValueException(String message, int num) {
        super(message);
        this.num = num;
    }
}













