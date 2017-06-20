package com.sa.SectionNB.LectureSix;

/**
 * Created by akashs on 6/14/17.
 */
public class Person extends A {
    public String name;
    private String address;
    private String email;

    public void display(){
        System.out.println("Person class display:");
        System.out.println(name);
        System.out.println(address);
        System.out.println(email);
    }

    public Person() {
        System.out.println("Constructor Person");
    }

    public Person(String name, String address, String email) {
        System.out.println("Constructor Person");
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
