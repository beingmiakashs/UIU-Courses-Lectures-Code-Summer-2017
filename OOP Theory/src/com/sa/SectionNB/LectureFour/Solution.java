package com.sa.SectionNB.LectureFour;

/**
 * Created by akashs on 6/7/17.
 */
public class Solution {

    static void fun(int a){
        a+=10;
        System.out.println("Modified: "+a);
    }

    public static void main(String[] args) {
//        int a = 10;
//        int b;
//        System.out.println("Before modification: "+a);
//        fun(a);
//        b=a;
//        b= b + 10;
//        System.out.println("After modification: "+a);
//        System.out.println("After modification: "+b);

        Student st1 = new Student("Anik");
        Student st2 = new Student("Naim");
        System.out.println("Before modification");
        st1.print();
        st2.print();
        st2 = st1;
        st2.name="Noman";
        System.out.println("After Modification");
        st1.print();
        st2.print();

    }
}

class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }

    void print(){
        System.out.println(name);
    }
}