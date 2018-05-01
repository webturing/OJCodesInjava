package dataStructure;

public class SubSetsDemo {
    static int n = 3;
    static int[] a = new int[n];

    static {
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
    }
    static boolean visited[] = new boolean[n];

    public static void main(String[] args) {
        dfs(0);
    }

    private static void dfs(int k) {
        if (k == n) {
            for (int i = 0; i < a.length; i++)
                if (visited[i])
                    System.out.print(a[i]);
            System.out.println();
            return;
        }
        visited[k] = false;
        dfs(k + 1);
        visited[k] = true;
        dfs(k + 1);

    }
}
