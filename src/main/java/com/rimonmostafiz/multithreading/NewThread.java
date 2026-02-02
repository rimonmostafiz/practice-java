package com.rimonmostafiz.multithreading;

/**
 * Created by Rimon Mostafiz on 3/17/2016.
 */
public class NewThread implements Runnable {

    Thread t;

    NewThread() {
        t = new Thread(this, "Child");
        System.out.println(t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println("Child: " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Child Thread Stopped!!");
    }
}
