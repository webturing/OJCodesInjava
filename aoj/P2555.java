import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
public class P2555 {

    static int a[];
    static int n;
    static boolean visited[];
    static List<String> ans=new Vector<String>();

    private static void dfs(int k) {
        if (k == n) {
            if (ok()) {
                ans.add(Arrays.toString(a).replaceAll("\\D+",""));
            }
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                a[k] = i;
                dfs(k + 1);
                visited[i] = false;
            }
        }

    }

    private static boolean ok() {
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(a[i] - a[j]) == (j - i))
                    return false;
            }


        return true;
    }


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        a = new int[n];
        visited = new boolean[n];
        dfs(0);
        System.out.println(ans.size());
        for(String s:ans)
            System.out.println(s);
    }
}
