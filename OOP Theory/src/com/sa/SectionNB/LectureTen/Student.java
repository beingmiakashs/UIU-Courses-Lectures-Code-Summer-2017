package com.sa.SectionNB.LectureTen;

/**
 * Created by akashs on 7/10/17.
 */
public class Student {
    public static String name;
    public int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Student tempStudent = (Student) obj;

        if(this.id == tempStudent.id){
            return true;
        }
        return false;
    }
}

class Application{
    public static void main(String[] args) {
        Student st1 = new Student("Anik", 12545);
        Student st2 = new Student("Swapnil", 45128);
        Student st3 = new Student("Abhi", 12545);
        Student.name = "Someone";
//        String s1 = "hello";
//        String s2 = s1;
//        String s3 = "hello";
//        s1.equals(s2);
        if(st1==st3){
            System.out.println("Two string equals");
        }
        if(st1.equals(st3)){
            System.out.println("Two string equals");
        }
    }
}
