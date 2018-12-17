package com.sa.SectionNB.LectureSeventeen;

/**
 * Created by akashs on 8/7/17.
 */
public class ThreadLecture {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        thread.setPriority(7);
        thread.setName("Main Class Thread");
        System.out.println(thread);

        Counter counter = new Counter();
        counter.total = 0;

        PrimeNumberCheckerThread thread1 = new PrimeNumberCheckerThread("First OddThread", 1, 1000, counter);
        PrimeNumberCheckerThread thread2 = new PrimeNumberCheckerThread("Second OddThread", 1001, 2000, counter);
        thread1.start();
        thread2.start();

        MyThread myThread = new MyThread();
        myThread.thread.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
