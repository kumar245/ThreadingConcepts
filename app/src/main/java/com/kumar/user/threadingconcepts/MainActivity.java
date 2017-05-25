package com.kumar.user.threadingconcepts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static void main(String[] args) throws InterruptedException {
        Thread_Example thread_example1 = new Thread_Example("T1");
        thread_example1.start();
        Thread_Example thread_example2=new Thread_Example("T2");
        thread_example2.start();
        System.out.println("Thread is working");
        Thread.sleep(6000);
//        thread_example2.IsRunning=false;
//        thread_example1.IsRunning=false;

        myRunnable runnable= new myRunnable("runnable");
        Thread tr= new Thread(runnable);
        tr.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
