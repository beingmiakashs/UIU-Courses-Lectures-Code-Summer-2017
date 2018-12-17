package com.sa.SectionNB.LectureEleven;

/**
 * Created by akashs on 7/24/17.
 */

class OuterClass{
    private int outerNum;

    public OuterClass(int outerNum) {
        this.outerNum = outerNum;
    }

    public void outerDisplay(){

        InnerClass inner = new InnerClass(20);
        System.out.println("Outer Display: inner value="+inner.innerNum);
    }

    static class InnerClass{
        private int innerNum;

        public InnerClass(int innerNum) {
            this.innerNum = innerNum;
        }
        public void innerDisplay(){
            System.out.println("Inner Display: outer value=");
        }
    }

}

abstract class Shape{
    public double width;
    public double height;
    public double depth;

    public Shape(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public abstract double calArea();
}

public class Solution {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(10);
        OuterClass.InnerClass inner = new OuterClass.InnerClass(15);
        outer.outerDisplay();

        Shape shape = new Shape(15,18,20) {
            double temp;
            @Override
            public double calArea() {
                return width*height;
            }
        };
    }
}














