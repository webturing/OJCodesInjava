import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class P1317 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            HashMap<Integer, TreeSet<Integer>> mp = new HashMap<Integer, TreeSet<Integer>>();
            for (int i = 1; i <= n; i++) {
                mp.put(i, new TreeSet<Integer>());
                mp.get(i).add(i);
            }
            for (int i = 0; i < m; i++) {
                int x = cin.nextInt();
                int y = cin.nextInt();
                TreeSet<Integer> union = new TreeSet<Integer>();
                union.addAll(mp.get(x));
                union.addAll(mp.get(y));
                for (int j = 1; j <= n; j++)
                    if (mp.get(j).contains(x) || mp.get(j).contains(y))
                        mp.put(j, union);
            }
            HashSet<TreeSet<Integer>> sets = new HashSet<TreeSet<Integer>>();
            sets.addAll(mp.values());
            cout.println(sets.size());

        }
        cout.close();
        cin.close();
    }

}
