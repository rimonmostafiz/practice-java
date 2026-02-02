package com.rimonmostafiz.multithreading;

/**
 * Created by Rimon Mostafiz on 3/17/2016.
 */
public class NewThreadAgain extends Thread {

    NewThreadAgain() {
        super("demo");
        System.out.println("Thread Name : " + this);
        start();
    }

    public void run() {
        try{
            for(int i = 15; i > 10; i--) {
                System.out.println("Demo : " + i);
                Thread.sleep(2000);
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of Demo!!");
    }
}
