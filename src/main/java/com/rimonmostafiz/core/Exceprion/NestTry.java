package com.rimonmostafiz.core.Exceprion;

import java.util.Random;

/**
 * Created by Rimon Mostafiz on 3/15/2016.
 */
public class NestTry {
    static void func(int a) {
        try {
            int b = 123 / a;
        } catch (ArithmeticException e) {
            System.out.println("Ex from func");
        }
    }

    public static void main(String[] args) {
        int b = 1;
        Random r = new Random();
        try {
            if (r.nextInt() < 0) NestTry.func(b - 1);
            else b = 123/(b-1);
        } catch (ArithmeticException e) {
            System.out.println("Ex form main");
        }
    }
}
