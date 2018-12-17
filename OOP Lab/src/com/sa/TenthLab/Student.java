package com.sa.TenthLab;

import java.io.Serializable;

/**
 * Created by akashs on 8/13/17.
 */
public class Student implements Serializable{
    public String name;
    public String id;
    public Double cgpa;

    public Student(String name, String id, Double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
}
