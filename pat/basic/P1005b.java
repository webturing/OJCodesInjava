package pat.basic;

import java.io.PrintWriter;
import java.util.*;

public class P1005b {

    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        TreeSet<Integer> V = new TreeSet<Integer>(Collections.reverseOrder());
        int n = cin.nextInt();
        for (int i = 0; i < n; i++) V.add(cin.nextInt());
        TreeMap<Integer, Set<Integer>> G = new TreeMap<Integer, Set<Integer>>();
        for (Integer v : V) {
            n = v;
            G.put(v, new TreeSet<Integer>());
            while (n > 1) {
                if ((n & 1) == 1) {
                    n = 3 * n + 1;
                } else {
                    n = n >> 1;
                }
                if (V.contains(n)) G.get(v).add(n);
            }
        }
        cout.println(G);
        TreeMap<Integer, Integer> D = new TreeMap<Integer, Integer>();
        for (Integer v : V) {
            for (Integer t : G.get(v)) {
                D.put(t, 1);
            }
        }
        cout.println(D);
        int j = 0;
        for (Integer v : V) {
            if (!D.containsKey(v)) {
                if (j++ > 0) cout.print(" ");
                cout.print(v);
            }

        }
        cin.close();
        cout.close();
    }


}
