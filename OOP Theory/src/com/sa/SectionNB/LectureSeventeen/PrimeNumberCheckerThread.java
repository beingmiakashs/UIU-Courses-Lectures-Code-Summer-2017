package com.sa.SectionNB.LectureSeventeen;

/**
 * Created by akashs on 8/7/17.
 */
public class PrimeNumberCheckerThread extends Thread {
    private int start;
    private int end;

    Counter counter;

    public PrimeNumberCheckerThread(String name, int start, int end, Counter counter) {
        super(name);
        this.start = start;
        this.end = end;
        this.counter = counter;
    }

    @Override
    public synchronized void run() {
        System.out.println(this.getName()+" is executing");
        for(int num=start;num<end;num++){
            if(isPrime(num)){
//                System.out.println(num);
                synchronized (counter) {
                    counter.total = counter.total + 1;
                }
            }
        }
    }

    public boolean isPrime(int num){
        if(num==2) return true;
        if(num==1) return false;
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
