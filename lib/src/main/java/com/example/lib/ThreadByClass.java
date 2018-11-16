package com.example.lib;

public class ThreadByClass extends Thread {
    @Override
    public void run() {
        //super.run();
        System.out.print(Thread.currentThread().getName());
    }
}


