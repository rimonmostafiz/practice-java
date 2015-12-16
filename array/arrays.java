import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by rimon on 12/17/15.
 */
public class arrays {
    public void go() {
        //Declearing and Initilizing array
        int[] myArray;
        myArray = new int[10];

        String[] myString;
        myString = new String[10];

        //Literals
        int[] myArrray2 = new int[]{1, 2, 3, 4, 5};
        int[] myArray3 = {5, 4, 3, 2, 1};

        String[] myString1 = {"One", "Two", "Three"};

        //lenght of the Array
        int lenMyString1 = myString1.length;
        int lenMyArray3 = myArray3.length;

        //Initializing
        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        for(int i = 0; i < myString.length; i++) {
            myString[i] = "String no " + i;
        }

        //accessing array
        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        for(int theInt : myArray3) {
            System.out.println(theInt);
        }
        for(String string : myString1) {
            System.out.println(string);
        }

        //copy array
        int[] myint = new int[15];
        for(int i = 0; i < myint.length; i++) {
            myint[i] = (int)(Math.random() * 100);
        }
        int[] copymyint = new int[20];
        copymyint = Arrays.copyOf(myint, myint.length);
        System.out.println(java.util.Arrays.toString(copymyint));

        //copy in range
        copymyint = Arrays.copyOfRange(myint, 5, myint.length);
        System.out.println(java.util.Arrays.toString(copymyint));

        //insert element into array
        insertIntoArray(myArray, 6, 25);
        insertIntoArray(myArray, 9, 36);
        insertIntoArray(myArray, 4, 17);
        System.out.println("After Adding: ");
        System.out.println(java.util.Arrays.toString(myArray));

        //deleting element form array
        removeFormArray(copymyint, 2);
        removeFormArray(copymyint, 9);
        removeFormArray(copymyint, 7);
        System.out.println("After Removing: ");
        for(int in : copymyint) {
            System.out.println(in);
        }

        //sorting
        Arrays.sort(myint);
        System.out.println(Arrays.toString(myint));

        //decending order sorting using comparator
        Integer[] Int;
        Int = new Integer[copymyint.length];
        for (int i = 0; i < copymyint.length; i++) {
            Int[i] = copymyint[i];
        }
        Arrays.sort(Int, new IntComperator());
        System.out.println(Arrays.toString(Int));

    }

    public void insertIntoArray(int[] array, int idx, int val) {
        for(int i = array.length - 1; i > idx; i--) {
            array[i] = array[i-1];
        }
        array[idx] = val;
    }

    public void removeFormArray(int[] array, int idx) {
        for(int i = idx; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    public class IntComperator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    }
}
