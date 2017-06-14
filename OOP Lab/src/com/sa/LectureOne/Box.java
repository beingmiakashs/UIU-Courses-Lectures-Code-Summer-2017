package com.sa.LectureOne;

/**
 * Created by akashs on 6/4/17.
 */
public class Box {
    double width;
    double height;
    double depth;

    Box(){
        width=1;
        height=1;
        depth=1;
    }

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    void init(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    double calArea(){
        double area = width*height*depth;
        return area;
    }

    void calArea(String name){
        double area = width*height*depth;
        System.out.println(name+" "+area);
    }

    void calArea(int name1){
        double area = width*height*depth;
        System.out.println(name1+" "+area);
    }
}








