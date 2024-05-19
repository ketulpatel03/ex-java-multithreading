package com.java.threadClass;

public class MainClass {

    public static void main(String[] args) {

        MyTask t1 = new MyTask();
        Thread t = new Thread(t1);

        System.out.println("MainClass thread : " + Thread.currentThread().getName());

        t1.start();

    }

}
