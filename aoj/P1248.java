package aoj;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P1248 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int m = cin.nextInt();
            if (m == 0)
                break;
            Map<String, Integer> mp = new HashMap<String, Integer>();
            for (int i = 0; i < m; i++) {
                String cur = cin.next();
                if (mp.containsKey(cur))
                    mp.put(cur, mp.get(cur) + 1);
                else
                    mp.put(cur, 1);
            }
            int max = Collections.max(mp.values());
            for (String s : mp.keySet()) {
                if (mp.get(s) == max) {
                    cout.println(s);
                    break;
                }
            }

        }
        cout.close();
        cin.close();
    }

}
