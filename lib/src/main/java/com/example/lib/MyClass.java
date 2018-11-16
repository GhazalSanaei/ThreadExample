package com.example.lib;

public class MyClass {
    public static void main(String[] args) {


        // ThreadByClass ThreadByClass = new ThreadByClass();
       // ThreadByClass.start();





        ThreadByInterface ThreadByInterface = new ThreadByInterface();
        Thread thread = new Thread(ThreadByInterface);
        thread.start();
    }
}




