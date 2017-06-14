package com.sa.SectionNB.LectureThree;

/**
 * Created by akashs on 6/5/17.
 */
public class Solution {
    public static void main(String[] args) {
        double a=15;
        Box b1 = new Box();
        double vol = b1.calVolume();
//        b1.width = 15;
//        b1.height = 5;
//        b1.depth = 2;
        b1.init(15,5,2);

        Box b2 = new Box(10,1,10);
//        b2.width = 10;
//        b2.height = 20;
//        b2.depth = 2;
        b2.init(10,20,2);


        System.out.println(vol);
        System.out.println(b2.calVolume());
    }
}



