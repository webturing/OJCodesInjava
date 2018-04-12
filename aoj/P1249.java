package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1249 {
    private static final int MOD = 1000;
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        while (cin.hasNext()) {
            int a = cin.nextInt(), b = cin.nextInt();
            if (a == 0 && b == 0) break;
            cout.println(pow(a, b));
        }
        cin.close();
        cout.close();
    }

    private static int pow(int a, int b) {
        a %= MOD;
        if (b == 0 || a == 1) return 1;
        if (a == 0 || b == 1)
            return a;
        if (b % 2 == 0)
            return pow(a * a % MOD, b >> 1);

        return (pow(a * a % MOD, b >> 1) * a) % MOD;
    }


}
