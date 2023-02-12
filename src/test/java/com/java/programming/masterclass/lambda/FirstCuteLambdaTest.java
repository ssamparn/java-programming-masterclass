package com.java.programming.masterclass.lambda;

import org.junit.jupiter.api.Test;

public class FirstCuteLambdaTest {

    @Test
    public void first_cute_lambda_test() {
        FirstCuteLambda runnable = new FirstCuteLambda();

        // Runnable way to start a thread
        Thread thread1 = new Thread(runnable);
        thread1.start();

        // Annonymous class way to start a thread
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2 Executed !!");
            }
        });
        thread2.start();

        // Lambda way to start a thread
        Thread thread3 = new Thread (() -> System.out.println("Thread 3 Executed !!!"));
        thread3.start();
    }
}
