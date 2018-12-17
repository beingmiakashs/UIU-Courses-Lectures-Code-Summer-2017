package com.sa.SectionNB.LectureEightteen;

import java.util.Comparator;

/**
 * Created by akashs on 8/16/17.
 */
public class GenericLecture {

    public static int getMax(int a, int b){
        if(a>b) return a;
        return b;
    }

    public static Double getMax(Double a, Double b){
        if(a>b) return a;
        return b;
    }

    public static <T extends Comparator<T>,m,n> T genMax(T a, T b){
        T tm;
        if(a.compare(a,b)>0){
            return a;
        }
        return b;
    }



    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 15;
        //Integer res = genMax(a,b);
        //System.out.println();

        GenClass<Double> genClass = new GenClass<Double>();
    }
}


class GenClass<T>{

    public void printArray(T[] a){
        for(T temp: a){
            System.out.println(temp);
        }
    }
}








