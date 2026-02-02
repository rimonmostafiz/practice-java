package com.rimonmostafiz.core.datastructure.container;

/**
 * Created by seal on 1/5/2016.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Java default arrayList container.
 * Demonstrate some operation on this container
 */
public class ListContainer {

    public void basicOperation() {
        // Create an arrayList instance of Integer
        ArrayList<Integer> listOfInteger = new ArrayList<Integer>();
        // we can also use List interface to operate arrayList
        List<Integer> list = listOfInteger; // it also done by [List<Integer> list = new ArrayList<>();]

        // adding some value. It only take Integer object as it is a generic class.
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.toString());
        // size of the list
        System.out.println(list.size());

        // insert into specific index
        list.set(0, 11); // replace 1 with 11.
//        System.out.println(list.toString());

        // sort array
        Collections.sort(list);
        // descending order sort
        Collections.reverse(list);
        // another way
        Collections.sort(list, Collections.<Integer>reverseOrder());
        System.out.println(list.toString());
    }

    public void complexOperation() {
        // creating a list of list Integer
        List<List<Integer>> lists = new ArrayList<List<Integer>>();

        // adding 10 arrayList instance in lists object

        for (int i = 0; i < 10; i++) {
            lists.add(new ArrayList<Integer>());
        }

        // size of the lists
        System.out.println(lists.size());

        // inserting value into a specific index List.
        lists.get(0).add(1);
        lists.get(0).add(2);
        lists.get(0).add(3);

        System.out.println(lists.get(0).size()); // size = 3;

        System.out.println(">>>>>>>>>>>>>>>>");
        // iterate over specific index
        // here comes the Autoboxing. In the loop list of index return Integer object but in converted to primitive int.
        for (int i : lists.get(0)) {
            System.out.println(i);
        }




    }

    public static void main(String[] args) {
        new ListContainer().basicOperation();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
        new ListContainer().complexOperation();
    }

}
