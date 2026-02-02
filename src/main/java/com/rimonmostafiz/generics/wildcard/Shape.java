package com.rimonmostafiz.generics.wildcard;

/**
 * Created by Rimon Mostafiz on 3/29/2016.
 */
abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
