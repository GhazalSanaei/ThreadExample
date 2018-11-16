package com.example.lib;

public class ThreadByInterface implements Runnable {
    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName());
    }
}
