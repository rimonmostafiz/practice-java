package com.rimonmostafiz.core.datastructure.linkedlist.simple;

/**
 * Created by Rimon Mostafiz on 4/17/2016.
 */
public class LinkedList {

    Node head;

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.head = new Node(1);
        llist.head.next = new Node(2);
        llist.head.next.next = new Node(3);

        LinkedList lList = new LinkedList();

        lList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        lList.head.next = second;
        second.next = third;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

}
