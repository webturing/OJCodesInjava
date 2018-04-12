package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1320 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static int f(int x) {
        if (x == 0 || x == 1) return 1;
        return f(x - 1) + 2 * (x - 1);
    }

    public static void main(String[] args) {
        for (int n = cin.nextInt(); n-- > 0; ) {
            cout.println(f(cin.nextInt()));
        }
        cin.close();
        cout.close();
    }
}
