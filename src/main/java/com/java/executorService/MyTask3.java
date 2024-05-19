package com.java.executorService;

public class MyTask3 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("MyTask3 thread : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
