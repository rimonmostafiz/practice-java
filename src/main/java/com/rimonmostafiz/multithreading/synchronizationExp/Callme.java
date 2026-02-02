package com.rimonmostafiz.multithreading.synchronizationExp;

/**
 * Created by Rimon Mostafiz on 3/17/2016.
 */

// This program is not synchronized.
public class Callme {
    synchronized public void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }

}
