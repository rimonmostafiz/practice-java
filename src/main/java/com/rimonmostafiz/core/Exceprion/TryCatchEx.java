package com.rimonmostafiz.core.Exceprion;

import java.util.Random;

/**
 * Created by Rimon Mostafiz on 3/15/2016.
 */
public class TryCatchEx {

    /*public static void main(String[] args) {
        TryCatchEx d = new TryCatchEx();
        d.solve(42, 0);
    }

    void solve(int x, int y) {
        int p = x / y;
    }*/

    /*public static void main(String[] args) {
        try{
            int a = 42 / 0;
            System.out.println("Not Print");
        } catch (ArithmeticException e) {
            System.out.println("Dev by 0");
        }
        System.out.println("After Try");
    }*/

    public static void main(String[] args) {
        Random r = new Random();
        boolean var = true;
        int a = -1, b = -1, res = -1;
        while (var) {
            try {
                a = r.nextInt();
                b = r.nextInt();
                res = 123456 / (a / b);
                System.out.println(a + " , " + b + " , " + res);
            } catch (ArithmeticException ae) {
                System.out.println("this is cool");
                var = false;
                System.out.println(a);
                System.out.println(b);
                System.out.println(res);
            }

        }
    }
}
