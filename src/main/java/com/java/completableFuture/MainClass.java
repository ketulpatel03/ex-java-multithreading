package com.java.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MainClass {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Void> t1 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("task1 thread : " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        CompletableFuture<String> t2 = CompletableFuture.supplyAsync(() -> {
            String str = null;
            try {
                Thread.sleep(2000);
                System.out.println("task2 thread : " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return str.toLowerCase();
        }).exceptionally((e) -> "default result");

        // for Task1
        t1.get();

        // for Task2
        String task2 = t2.get();
        System.out.println("Task2 output : " + task2);

    }

}
