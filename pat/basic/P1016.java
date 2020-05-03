package pat.basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class P1016 {
    static Scanner cin = new Scanner(new BufferedInputStream(System.in));
    static PrintWriter cout = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        long a = cin.nextLong();
        long da = cin.nextLong();
        long b = cin.nextLong();
        long db = cin.nextLong();
        long x = 0L, y = 0L;
        while (a > 0) {
            long d = a % 10;
            if (d == da) {
                x = x * 10 + da;
            }
            a /= 10;
        }
        while (b > 0) {
            long d = b % 10;
            if (d == db) {
                y = y * 10 + db;
            }
            b /= 10;
        }
        cout.println(x + y);
        cin.close();
        cout.close();
    }
}
