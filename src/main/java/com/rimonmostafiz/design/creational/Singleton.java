package com.rimonmostafiz.design.creational;

/**
 * Created by Rimon Mostafiz on 3/30/2016.
 */
public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
