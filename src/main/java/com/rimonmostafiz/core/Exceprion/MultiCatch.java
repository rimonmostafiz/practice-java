package com.rimonmostafiz.core.Exceprion;

/**
 * Created by Rimon Mostafiz on 3/16/2016.
 */
// Demonstrate the multi-catch feature.
class MultiCatch {
    public static void main(String args[]) {
        int a=10, b=0;
        int vals[] = { 1, 2, 3 };
        try {
            //comment any one of the line to catch the multiple exceptions by one catch
            int result = a / b; // generate an ArithmeticException
            vals[10] = 19; // generate an ArrayIndexOutOfBoundsException

            // This catch clause catches both exceptions.
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("After multi-catch.");
    }
}
