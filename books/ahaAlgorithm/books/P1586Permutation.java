package books.ahaAlgorithm.books;

import java.util.Arrays;
import java.util.Scanner;

public class P1586Permutation {

    static int a[];
    static boolean v[];
    static int n;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            a = new int[cin.nextInt()];
            n = a.length;
            v = new boolean[n];
            dfs(0);
        }

        cin.close();

    }

    private static void dfs(int k) {
        if (k == n) {
            System.out.println(Arrays.toString(a).replaceAll("\\D+", ""));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!v[i]) {
                v[i] = true;
                a[k] = i + 1;
                dfs(k + 1);
                v[i] = false;
            }

        }

    }

    private static void swap(int[] a, int k, int i) {
        int t = a[k];
        a[k] = a[i];
        a[i] = t;
    }
}
