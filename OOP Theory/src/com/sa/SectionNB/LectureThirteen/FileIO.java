package com.sa.SectionNB.LectureThirteen;

import java.io.*;

/**
 * Created by akashs on 7/31/17.
 */
public class FileIO {
    public static void main(String[] args) throws Exception {
//        FileInputStream fin = new FileInputStream("input.txt");
//        FileOutputStream fout = new FileOutputStream("output.txt");

        FileReader fin = new FileReader("input.txt");
        FileWriter fout = new FileWriter("output.txt");

        BufferedReader bin = new BufferedReader(fin);
        BufferedWriter bout = new BufferedWriter(fout);

//        while(true){
//            int data = fin.read();
//            if(data == -1) break;
//            fout.write(data);
//        }

        int sum = 0;
        int total=1;
        while(true){
            String s = bin.readLine();
            if(s==null) break;
            String[] sp = s.split(" ");
            for(String tm: sp){
                int num = Integer.parseInt(tm);
                sum+=num;
            }
            total = sp.length;
        }

        bout.write("Sum : "+sum);
        bout.write("Average: "+(sum/total));

        fin.close();
        fout.close();
    }
}





