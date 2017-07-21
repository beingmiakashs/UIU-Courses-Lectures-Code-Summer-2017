package com.sa.SectionNB.LectureNine;

/**
 * Created by akashs on 6/18/17.
 */
public abstract class Box {
    private double width;
    private double height;
    public double depth;
    public final double pi = 3.1416;

    public abstract double calArea();

    public Box(){
        width=1;
        height=1;
        depth=1;
    }

    public void display(){
        System.out.println(width+" "+height+" "+depth);
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}
