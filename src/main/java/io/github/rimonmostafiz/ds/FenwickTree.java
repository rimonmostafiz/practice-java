package io.github.rimonmostafiz.ds;

/**
 * @author Rimon Mostafiz
 */
public class FenwickTree {

    private final int N;
    private final long[] tree;

    public FenwickTree(int SIZE) {
        N = SIZE + 1;
        this.tree = new long[N];
    }

    public FenwickTree(long[] array) {
        N = array.length + 1;
        this.tree = new long[N];
        System.arraycopy(array, 0, this.tree, 1, array.length - 1);
        constructTree();
    }

    public long prefixSum(int i) {
        long sum = 0;
        while (i != 0) {
            sum += this.tree[i];
            i -= Integer.lowestOneBit(i);
        }
        return sum;
    }

    public void constructTree() {
        for (int i = 1; i < N; i++) {
            int parent = i + Integer.lowestOneBit(i);
            if (parent < N) {
                tree[parent] += tree[i];
            }
        }
    }
}
