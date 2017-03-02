import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class P1289 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        while (cin.hasNext()) v.add(cin.nextInt());
        Collections.sort(v);
        int tot = 0;
        for (Integer i : v) tot += i;
        cout.println(String.format("%d %d %.3f", v.get(0), v.get(v.size() - 1), 1.0 * tot / v.size()));
        cout.close();
        cin.close();
    }
}
