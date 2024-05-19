package com.java.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {

    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(2);

        Runnable r1 = new MyTask1();
        es.submit(r1);

        Runnable r2 = new MyTask2();
        es.submit(r2);

        Runnable r3 = new MyTask3();
        es.submit(r3);

        es.shutdown();
    }

}
