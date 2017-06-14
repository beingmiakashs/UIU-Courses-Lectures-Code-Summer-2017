package com.sa.SectionNB.LectureSix;

import com.sa.SectionNB.LectureFive.*;

/**
 * Created by akashs on 6/14/17.
 */
public class Student extends Person {
    private String id;
    private double cgpa;
    public String name;

    public Student(){
        super("X","Y","Z");
    }

    public Student(String id, double cgpa) {
        //super(name, address, email);
        super("X","Y","Z");
        //super();
        this.id = id;
        this.cgpa = cgpa;
    }

    public void display(){
        System.out.println("Student class display:");
        System.out.println(id+" "+cgpa);
        System.out.println(super.name+" "+this.getEmail());
    }

}
