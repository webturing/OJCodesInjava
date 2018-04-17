import java.util.Arrays;

public class PermulationDemo {

    static int a[] = new int[]{1, 2, 3,};
    static int n = a.length;
    static boolean visited[] = new boolean[n];

    public static void main(String[] args) {
        dfs(0);
    }

    private static void dfs(int k) {
        if (k == n) {
            System.out.println(Arrays.toString(a));
            return;
        }
        for (int i = k; i < n; i++) {
            swap(a, k, i);
            dfs(k + 1);
            swap(a, k, i);
        }

    }

    private static void swap(int[] a, int k, int i) {
        int t = a[k];
        a[k] = a[i];
        a[i] = t;
    }
}
