package io.github.rimonmostafiz.misc;

/**
 * @author Rimon Mostafiz
 */
public class Problem3 {
    public static void main(String[] args) {
        int A[] = new int[]{2, 1, 3};
        int S = 2;
        int count = solution(A, S);
        System.out.println("The number of continuous fragments : " + count);
    }

    public static int solution(int[] A, int S) {
        int count = 0;
        int len = A.length;

        for (int i = 0; i < len; i++) {
            int[] dp = new int[len];
            dp[i] = A[i];
            if (A[i] == S) {
                count++;
            }
            for (int j = i + 1; j < len; j++) {
                int sum = dp[j - 1] + A[j];
                dp[j] = sum;
                if ((double) sum / (j - i + 1) == S) {
                    count++;
                }
            }
        }
        return count;
    }
}
