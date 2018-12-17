package com.sa.TenthLab;

import java.io.*;

/**
 * Created by akashs on 8/13/17.
 */
public class Solution {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("input");
            ObjectOutputStream obOut = new ObjectOutputStream(fout);

            Student student1 = new Student("Anik Islam Abhi", "011151247", 3.98);
            obOut.writeObject(student1);

            obOut.close();
            fout.close();

            FileInputStream fin = new FileInputStream("input");
            ObjectInputStream obIn = new ObjectInputStream(fin);

            Student studentOut = (Student) obIn.readObject();
            System.out.println(studentOut.name+" "+studentOut.id+" "+studentOut.cgpa);

            obIn.close();
            fin.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}















