package com.sa.SectionNB.LectureNineteen;

import java.io.*;

/**
 * Created by akashs on 8/21/17.
 */
public class ObjectIOSolution {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("ObjectFile");
            ObjectOutputStream obOut = new ObjectOutputStream(fout);

            Player player1 = new Player("Shakib", 9.8);
            obOut.writeObject(player1);
            obOut.close();
            fout.close();

            FileInputStream fin = new FileInputStream("ObjectFile");
            ObjectInputStream obIn = new ObjectInputStream(fin);
            Player tm = (Player) obIn.readObject();
            System.out.println(tm.name+" "+tm.rating);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class Player implements Serializable{
    public String name;
    public double rating;

    public Player(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }
}