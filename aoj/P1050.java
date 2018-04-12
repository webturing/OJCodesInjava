package aoj;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

public class P1050 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static Vector<Integer> a = new Vector<Integer>();

    static {
        a.add(2);
    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            while (a.size() < n)
                a.add(a.get(a.size() - 1) + 2);
            boolean first = true;
            for (int i = 0; i < n / m; i++) {
                int s = 0;
                for (int j = 0; j < m; j++)
                    s += a.get(i * m + j);
                if (first) {
                    first = false;
                } else {
                    cout.print(" ");
                }
                cout.print(s / m);
            }
            if (n % m != 0) {
                int s = 0;
                for (int i = n / m * m; i < n; i++)
                    s += a.get(i);
                cout.print(" " + (s / (n % m)));
            }
            cout.println();

        }
        cout.close();
        cin.close();
    }
}
