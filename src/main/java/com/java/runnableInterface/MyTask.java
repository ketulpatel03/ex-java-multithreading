package com.java.runnableInterface;

public class MyTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("MyTask thread : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
