package org.rimonmostafiz.generics;

/**
 * @author Rimon Mostafiz
 */
public class BoundedType<T extends Number> {
    private T obj;

    BoundedType() {}

    BoundedType(T obj) { this.obj = obj; }

    public Double reciprocal() {
        return 1 / this.obj.doubleValue();
    }

    public Double fractionPart() {
        return this.obj.doubleValue() - this.obj.intValue();
    }
}
