package com.sa.SectionNB.LectureSix;

/**
 * Created by akashs on 6/14/17.
 */
public class Person {
    public String name;
    private String address;
    private String email;

    public void display(){
        System.out.println("person class display:");
        System.out.println(name+" "+this.getEmail());
    }

    public Person() {
    }

    public Person(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
