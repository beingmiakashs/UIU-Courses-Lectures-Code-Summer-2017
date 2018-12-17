package com.sa.SectionNB.LectureSeventeen;

/**
 * Created by akashs on 8/7/17.
 */
public class MyThread implements Runnable {

    Thread thread;
    public MyThread() {
        thread = new Thread(this);
    }

    @Override
    public void run() {
        System.out.println("Impletemented Thread");
    }
}
