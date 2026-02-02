package com.rimonmostafiz.ds;

/**
 * @author rimonmostafiz
 */
public class Node<T> {
    Node<T> left;
    Node<T> right;
    T Value;

    public Node() {
        this.left = null;
        this.right = null;
    }

    public Node(Node<T> left, Node<T> right, T value) {
        this.left = left;
        this.right = right;
        Value = value;
    }


}
