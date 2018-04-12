package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1135 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int vul = cin.nextInt(), d = cin.nextInt();
            int k = (vul + d - 1) / d;
            int m = 0;
            while (m * (m + 1) / 2 < k) ++m;
            cout.println(k + m - 1);
        }

        cout.close();
        cin.close();
    }
}
