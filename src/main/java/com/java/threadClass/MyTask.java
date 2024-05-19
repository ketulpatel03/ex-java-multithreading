package com.java.threadClass;

public class MyTask extends Thread {

    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("MyTask thread : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
