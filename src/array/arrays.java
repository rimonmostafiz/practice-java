package array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author rimon mostafiz (ferary.rimon@gmail.com)
 */
public class arrays {
    public void go() {
        //declaring and initializing array
        int[] myArray;
        myArray = new int[10];

        String[] myString;
        myString = new String[10];

        //literals
        int[] myArray2 = new int[]{1, 2, 3, 4, 5};
        int[] myArray3 = {5, 4, 3, 2, 1};

        String[] myString1 = {"One", "Two", "Three"};

        //length of the array
        int lenMyString1 = myString1.length;
        int lenMyArray3 = myArray3.length;

        //initializing
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        for (int i = 0; i < myString.length; i++) {
            myString[i] = "String no " + i;
        }

        //accessing array
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        for (int theInt : myArray3) {
            System.out.println(theInt);
        }
        for (String string : myString1) {
            System.out.println(string);
        }

        //copy array
        int[] myInt = new int[15];
        for (int i = 0; i < myInt.length; i++) {
            myInt[i] = (int) (Math.random() * 100);
        }
        int[] copyMyInt = new int[20];
        copyMyInt = Arrays.copyOf(myInt, myInt.length);
        System.out.println(java.util.Arrays.toString(copyMyInt));

        //copy in range
        copyMyInt = Arrays.copyOfRange(myInt, 5, myInt.length);
        System.out.println(java.util.Arrays.toString(copyMyInt));

        //faster copy
        int[] fastCopy = new int[20];
        System.arraycopy(myInt, 0, fastCopy, 0, myInt.length);
        System.out.println("fast copy " + java.util.Arrays.toString(fastCopy));

        //insert element into array
        insertIntoArray(myArray, 6, 25);
        insertIntoArray(myArray, 9, 36);
        insertIntoArray(myArray, 4, 17);
        System.out.println("After Adding: ");
        System.out.println(java.util.Arrays.toString(myArray));

        //deleting element form array
        removeFormArray(copyMyInt, 2);
        removeFormArray(copyMyInt, 9);
        removeFormArray(copyMyInt, 7);
        System.out.println("After Removing: ");
        for (int in : copyMyInt) {
            System.out.println(in);
        }

        //sorting
        Arrays.sort(myInt);
        System.out.println(Arrays.toString(myInt));

        //descending order sorting using comparator
        Integer[] Int;
        Int = new Integer[copyMyInt.length];
        for (int i = 0; i < copyMyInt.length; i++) {
            Int[i] = copyMyInt[i];
        }
        Arrays.sort(Int, new IntComparator());
        System.out.println(Arrays.toString(Int));

    }

    public void insertIntoArray(int[] array, int idx, int val) {
        for (int i = array.length - 1; i > idx; i--) {
            array[i] = array[i - 1];
        }
        array[idx] = val;
    }

    public void removeFormArray(int[] array, int idx) {
        for (int i = idx; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    public class IntComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    }
}
