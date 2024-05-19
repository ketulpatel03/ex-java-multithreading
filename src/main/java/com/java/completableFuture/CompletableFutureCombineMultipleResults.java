package com.java.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureCombineMultipleResults {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // task 1
        CompletableFuture<String> t1 = CompletableFuture.supplyAsync(() -> {
            String str = "user details";
            try {
                Thread.sleep(5000);
                System.out.println("task1 thread : " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return str.toLowerCase();
        }).exceptionally((e) -> "default user");

        // task 2
        CompletableFuture<String> t2 = CompletableFuture.supplyAsync(() -> {
            String str = "order details";
            try {
                Thread.sleep(2000);
                System.out.println("task2 thread : " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return str.toLowerCase();
        }).exceptionally((e) -> "default order");

        // task 3
        CompletableFuture<String> t3 = CompletableFuture.supplyAsync(() -> {
            String str = "payment details";
            try {
                Thread.sleep(8000);
                System.out.println("task3 thread : " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return str.toLowerCase();
        }).exceptionally((e) -> "default payment");

        // combine results of all the tasks
        CompletableFuture<String> stringCompletableFuture = t1
                                                            .thenCombine(t2, (r1, r2) -> r1 + " || " + r2)
                                                            .thenCombine(t3, (r, r3) -> r + " || " + r3);

        String finalString = stringCompletableFuture.get();
        System.out.println(finalString);
    }

}
