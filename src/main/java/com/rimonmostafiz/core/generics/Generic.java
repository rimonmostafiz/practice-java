package com.rimonmostafiz.core.generics;

/**
 * @author rimonmostafiz
 */
public class Generic<T> {
    private T obj;

    public Generic() {}

    public Generic(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public String getTypeOfObj() {
        return this.obj.getClass().getName();
    }
}
