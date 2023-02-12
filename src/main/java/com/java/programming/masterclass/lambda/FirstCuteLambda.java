package com.java.programming.masterclass.lambda;

// There are 2 ways to create a thread
// 1. Implementing Runnable interface.
// 2. Extending Thread class.

public class FirstCuteLambda implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread 1 Executed !");
    }
}
