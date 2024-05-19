package com.java.lambdaExpression;

public class MainClass {

    public static void main(String[] args) {

        Runnable r = () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("MyTask thread : " + Thread.currentThread().getName());
        };

        Thread t = new Thread(r);
        t.start();
        System.out.println("MainClass thread : " + Thread.currentThread().getName());

    }

}
