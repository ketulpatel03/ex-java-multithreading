package com.java.executorService;

public class MyTask1 implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("MyTask1 thread : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
