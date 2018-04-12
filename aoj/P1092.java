package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1092 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        for (int T = cin.nextInt(); T-- > 0; ) cout.println(foo(cin.nextInt()));
        cin.close();
        cout.close();
    }

    private static int rev(int n) {
        int ret = 0;
        while (n > 0) {
            ret = ret * 10 + n % 10;
            n /= 10;
        }
        return ret;
    }

    private static int foo(int n) {
        for (int i = 0; i < 8; i++) {
            if (n == rev(n))
                return i;
            n = n + rev(n);
        }
        return 0;
    }
}
