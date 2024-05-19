package com.java.runnableInterface;

public class MainClass {

    public static void main(String[] args) {
        Runnable r = new MyTask();
        Thread t = new Thread(r);

        System.out.println("MainClass thread : " + Thread.currentThread().getName());

        t.start();
    }

}
