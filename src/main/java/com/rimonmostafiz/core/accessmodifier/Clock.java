package com.rimonmostafiz.core.accessmodifier;

/**
 * @author rimonmostafiz
 */
public class Clock {
    /*
    * If a method or variable is marked as private,
    * then only code inside the same class can access the variable, or call the method.
    * Code inside subclasses cannot access the variable or method, nor can code from any external class.
    * */

    /*
    * Classes cannot be marked with the private access modifier.
    * Marking a class with the private access modifier would mean that no other class could access it,
    * which means that you could not really use the class at all.
    * Therefor the private access modifier is not allowed for classes.
    * */

    private long time = 0;

    /*accessor method*/
    public long getVar() {
        return this.time;
    }

    public void setVar(long var) {
        this.time = var;
    }

    /*
    * If a constructor in a class is assigned the private Java access modifier,
    * that means that the constructor cannot be called from anywhere outside the class.
    * A private constructor can still get called from other constructors,
    * or from static methods in the same class.
    * */

    private Clock(long time) {
        this.time = time;
    }

    public Clock(long time, long timeOffset) {
        this(time);
        this.time = timeOffset;
    }

    public static Clock newClock() {
        return new Clock(System.currentTimeMillis());
    }

    /*
    * The default Java access modifier is declared by not writing any access modifier at all.
    * Code inside the class itself as well as code inside classes in the same package as this class,
    * can access the class, field, constructor or method which the default access modifier is assigned to.
    * Therefore, the default access modifier is also sometimes referred to as the package access modifier.
    * Subclasses cannot access methods and member variables (fields) in the superclass,
    * if they these methods and fields are marked with the default access modifier,
    * unless the subclass is located in the same package as the superclass.
    * */

    /*
    * protected access modifier is same as the default or package access modifier, with the addition that
    * it subclass can access protected method and member variables of the superclass.
    * this is true even if the subclass is not located in the same package as the superclass.
    * */


    /*
    *  Java class takes precedence over any access modifiers assigned to fields,
    *  constructors and methods of that class.
    *  If the class is marked with the default access modifier,
    *  then no other class outside the same Java package can access that class,
    *  including its constructors, fields and methods.
    *  It doesn't help that you declare these fields public, or even public static.
    *  Classes can only have the default (package) and public access modifier assigned to them.
    * */

    /*
    * cannot use the private and protected access modifiers in interfaces.
    * Fields and methods in interfaces are implicitly declared public if you leave out an access modifier,
    * so you cannot use the default access modifier either (no access modifier).
    * the methods in the subclass cannot have less accessible access modifiers assigned to them than they had in the superclass.
    * */
}
