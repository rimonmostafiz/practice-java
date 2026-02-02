package com.rimonmostafiz.hackerrank.interviewkit.array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// Solution Idea: Prefix Sum
public class ArrayManipulation {

    static long arrayManipulation(int n, int[][] queries) {
        long[] array = new long[n + 1];
        for (int i = 0; i < queries.length; i++) {
            int idx = 0;
            int a = queries[i][idx++];
            int b = queries[i][idx++];
            int k = queries[i][idx++];

            array[a] = array[a] + k;
            if (b + 1 <= n) array[b + 1] = array[b + 1] - k;
        }
        long max = Long.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            array[i] = array[i] + array[i - 1];
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
