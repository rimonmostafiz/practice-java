package com.rimonmostafiz.core.Exceprion;

/**
 * Created by Rimon Mostafiz on 3/16/2016.
 */
public class ThrowsExp {
    static void f() throws NullPointerException{
        System.out.println("Inside f");
        throw new NullPointerException();
        //System.out.println("UnExecute");
    }

    public static void main(String[] args) {
        System.out.println("Starting Form Here");
        try {
            f();
        } catch (NullPointerException e) {
            System.out.println("Caught by " + e);
        }
    }
}
