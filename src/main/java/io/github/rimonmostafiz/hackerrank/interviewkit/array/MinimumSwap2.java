package com.rimonmostafiz.hackerrank.interviewkit.array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.*;

public class MinimumSwap2 {
    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        HashMap<Integer, Integer> positionMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            positionMap.put(arr[i], i);
        }
        int swapCount = 0;
        for (int i = 0; i < arr.length; i++) {
            // what should be be in i?
            // let say that is x
            int x = i + 1;

            // is x at arr[i]?
            if (arr[i] != x) {
                // where is x?
                int posOfx = positionMap.get(x);
                System.out.printf("%d %d\n", x, posOfx);

                if (posOfx != i) {
                    // swap(i, posOfx)
                    int afterSwapUpdate = arr[i];
                    int updateWith = posOfx;

                    int temp = arr[i];
                    arr[i] = arr[posOfx];
                    arr[posOfx] = temp;

                    // update what just updated!!
                    positionMap.put(afterSwapUpdate, updateWith);
                    positionMap.put(x, i);

                    swapCount++;
                }
            }
        }
        return swapCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
