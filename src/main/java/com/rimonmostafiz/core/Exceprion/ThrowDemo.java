package com.rimonmostafiz.core.Exceprion;

/**
 * Created by Rimon Mostafiz on 3/15/2016.
 */
// Demonstrate throw.
class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
            //System.out.println("not print"); Error:(11, 13) java: unreachable statement
        } catch (NullPointerException e) {
            System.out.println("Caught inside demoproc.");
            throw e; // rethrow the exception
        }
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}