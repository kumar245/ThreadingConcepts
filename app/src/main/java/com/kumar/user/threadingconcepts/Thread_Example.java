package com.kumar.user.threadingconcepts;

/**
 * Created by User on 5/24/2017.
 */

public class Thread_Example extends Thread {
    boolean IsRunning=true;
    String name;
    public Thread_Example(String name){
        this.name=name;
        System.out.println(name);
    }

    @Override
    public void run() {
        int count =0;
        while (IsRunning){
            System.out.println(name + ":" + count);
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
