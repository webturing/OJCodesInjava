package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1501 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        while (cin.hasNext()) {
            int a = cin.nextInt();
            int p = cin.nextInt();
            int m = cin.nextInt();
            if (a == 0 && p == 0 && m == 0) break;
            cout.println(pow(a, p, m));
        }
        cout.close();
        cin.close();
    }

    private static int pow(int a, int p, int m) {
        a %= m;
        if (a == 1 || p == 0) return 1;
        if (a == 0 || p == 1) return a;
        if (p % 2 == 0) return pow(a * a % m, p >> 1, m);
        return a * pow(a * a % m, p >> 1, m) % m;
    }
}
