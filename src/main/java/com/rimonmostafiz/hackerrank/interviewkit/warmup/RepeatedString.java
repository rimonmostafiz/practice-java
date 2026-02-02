
package com.rimonmostafiz.hackerrank.interviewkit.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long count = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        long res = 0;
        long rem = 0;
        res = (long) (n / len) * count;
        rem = (n % len);
        for (int i = 0; i < rem; i++) {
            if (s.charAt(i) == 'a') {
                res++;
            }
        }

        return res;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
