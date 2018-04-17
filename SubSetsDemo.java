import java.util.Arrays;

public class SubSetsDemo {
    static int n = 3;
    static int a[] = new int[n];
    static boolean visited[] = new boolean[n];

    public static void main(String[] args) {
        dfs(0);
    }

    private static void dfs(int k) {
        if (k == n) {
            System.out.println(Arrays.toString(a));
            return;
        }
        visited[k] = true;
        a[k] = 1;
        dfs(k + 1);
        visited[k] = false;
        a[k] = 0;
        dfs(k + 1);

    }
}
