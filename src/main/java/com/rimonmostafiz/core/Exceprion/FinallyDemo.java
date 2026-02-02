package com.rimonmostafiz.core.Exceprion;

/**
 * Created by Rimon Mostafiz on 3/16/2016.
 */
public class FinallyDemo {
    static void A() {
        try{
            System.out.println("Inside A");
            throw new RuntimeException();
        } finally {
            System.out.println("Finally Form A");
        }
    }

    static void B() {
        try{
            System.out.println("Inside B");
            return;
        } finally {
            System.out.println("Finally Form B");
        }
    }

    static void C() {
        try{
            System.out.println("Inside C");
        } finally {
            System.out.println("Finally Form C");
        }
    }

    public static void main(String[] args) {
        try{
            A();
        } catch (Exception e) {
            System.out.println("Caught By : " + e);
        } finally {
            System.out.println("This will always Run");
        }
        B();
        C();
    }
}
