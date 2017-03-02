import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P1075 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNextInt()) {
            foo(cin.nextInt());
        }

        cout.close();
        cin.close();
    }

    private static void foo(int n) {
        Map<Integer, Integer> mp = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int cur = cin.nextInt();
            if (mp.containsKey(cur))
                mp.put(cur, mp.get(cur) + 1);
            else
                mp.put(cur, 1);
        }
        Iterator<Integer> it = mp.keySet().iterator();
        int max = it.next();
        for (Integer cur : mp.keySet())
            if (mp.get(cur) > mp.get(max)) max = cur;
        cout.println(max);
        cout.println(mp.get(max));
    }


}
