package com.sa.SectionNB.LectureFive;

/**
 * Created by akashs on 6/10/17.
 */
public class Person {
    private String name;
    public String id;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
//        super.finalize();
        System.out.println("I am dying "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
