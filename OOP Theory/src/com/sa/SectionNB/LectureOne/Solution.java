package com.sa.SectionNB.LectureOne;

import java.util.Scanner;

/**
 * Created by akashs on 5/29/17.
 */
public class Solution {

    public static void main(String[] agr){

        int a;
        double d;
        float f;
        char ch;
        boolean b;

        a=10;

        if(a%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd Number");
        }

        int[] ar = new int[5];
        int[][] ar2 = new int[5][10];
        int[][] ad2 = new int[5][];

        ad2[0] = new int[3];
        ad2[1] = new int[2];
        ad2[2] = new int[5];


        for(int i=0;i<5;i++){
            ar[i] = 10+i;
        }
        for(int i=0;i<5;i++){
            System.out.println(ar[i]);
        }
        System.out.println("For each loop print");
        for(int num : ar){
            System.out.println(num);
        }
        System.out.println(ar.length);

        System.out.println("A = "+a);

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        d = sc.nextDouble();

        String s;
        s = sc.next();
        System.out.println(a);
        System.out.println(d);
        System.out.println(s);



    }


}
