package com.sa.LectureOne;

/**
 * Created by akashs on 6/4/17.
 */
public class Main {

    static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

        boolean flag = isEven(10);

        Box b = new Box();
        b.width = 10;
        b.height = 5;
        b.depth = 2;
//        b.init(10,5,2);

        Box b1 = new Box(5,20,10);
//        b1.width = 5;
//        b1.height = 20;
//        b1.depth = 10;
//        b1.init(5,20,10);

        double area = b.calArea();
        System.out.println(area);

        b1.calArea("Box 2");

        // int ar[100];
        int n=10;
        int[] ar = new int[n];
        ar[0]=15;
        ar[1]=20;
        for(int i=0;i<n;i++){
            ar[i]=i;
        }

        int[][] ar2 = new int[100][10];

    }
}







