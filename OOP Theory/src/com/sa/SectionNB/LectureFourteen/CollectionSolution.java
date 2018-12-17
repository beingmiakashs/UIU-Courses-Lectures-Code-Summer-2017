package com.sa.SectionNB.LectureFourteen;

import java.util.*;

/**
 * Created by akashs on 8/5/17.
 */
public class CollectionSolution {
    public static void main(String[] args) {
        //List<Integer> linkedList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(15);
        linkedList.add(10);
        linkedList.add(3);

//        Collections.binarySearch(linkedList, "hello");

        for(int i=0;i<linkedList.size();i++){
            Integer tm = linkedList.get(i);
            System.out.println(tm);
        }

        Collections.sort(linkedList);

        for(Integer tm: linkedList){
            System.out.println(tm);
        }

        HashMap<String, Double> map = new HashMap<>();
        map.put("anik", 3.86);
        map.put("naim", 3.55);
        map.put("ashis", 3.95);

        System.out.println(map.get("naim"));

        Stack<String> st = new Stack<>();
        st.push("hello");
        st.push("world");

        System.out.println(st.pop());

        Queue<String> queue = new LinkedList<>();
        queue.add("hello");
        queue.add("world");
        System.out.println(queue.peek());

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Swapnil", 3.85));
        students.add(new Student("Amee", 3.95));
        students.add(new Student("Safat", 3.75));

        Comparator<Student> cm = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.cgpa - o2.cgpa);
            }
        };


        Collections.sort(students, cm);
        for(Student tm : students){
            System.out.println(tm);
        }

    }
}

class Student implements Comparable<Student>{

    public String name;
    public Double cgpa;

    public Student(String name, Double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    @Override
    public int compareTo(Student anotherStudent) {
        if(this.cgpa>anotherStudent.cgpa){
            return 1;
        }
        else if(this.cgpa < anotherStudent.cgpa){
            return -1;
        }
        return 0;
    }
}









