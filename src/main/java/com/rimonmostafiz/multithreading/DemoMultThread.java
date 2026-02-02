package com.rimonmostafiz.multithreading;

import java.util.Iterator;

/**
 * Created by Rimon Mostafiz on 3/17/2016.
 */
public class DemoMultThread implements Runnable {
    String name;
    Thread t;
    int time;

    public void setTime(int time) {
        this.time = time;
    }

    DemoMultThread(String name, int time) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println(t);
        setTime(time);
        t.start();
    }



    @Override
    public void run() {
        try{
            for(int i = 1; i <=5; i++) {
                System.out.println(name + " : " + i);
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("the end of " + name);
    }
}
