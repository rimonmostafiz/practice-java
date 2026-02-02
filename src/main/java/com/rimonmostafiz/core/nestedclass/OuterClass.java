package com.rimonmostafiz.core.nestedclass;

/**
 * @author rimonmostafiz
 */
public class OuterClass {

    public int x = 1;
    private int y = 2;
    public static int PUBLIC_COIN_FACE = 2;
    private static int PRIVATE_DICE_FACE = 6;

    static class StaticNestedClass {
        void accessRulesTest() {
            System.out.println(PUBLIC_COIN_FACE);
            System.out.println(PRIVATE_DICE_FACE);
            OuterClass oc = new OuterClass();
            System.out.println(oc.x);
            System.out.println(oc.y);
        }
    }

    class InnerClass {
        void accessRulesTest() {
            System.out.println(PUBLIC_COIN_FACE);
            System.out.println(PRIVATE_DICE_FACE);
            System.out.println(x);
            System.out.println(y);
        }
    }
}
