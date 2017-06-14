package com.sa.SectionNB.LectureThree;

/**
 * Created by akashs on 6/5/17.
 */
public class Box {
    double width;
    double height;
    double depth;

    Box(){
        System.out.println("Default constructor");
        width=1;
        height=1;
        depth=1;
    }

    Box(double w, double h, double d){
        System.out.println("Parameterized constructor");
        width = w;
        height = h;
        depth = d;
    }

    void init(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    double calVolume(){
        double vol = width*height*depth;
        return vol;
    }

    double calVolume(String name){
        double vol = width*height*depth;
        return vol;
    }

    int calVolume(boolean name){
        double vol = width*height*depth;
        return (int)vol;
    }
}






