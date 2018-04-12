package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P2047 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNext())
            cout.println(ok(cin.nextInt()) ? 1 : 0);
        cout.close();
        cin.close();
    }

    private static boolean ok(int n) {
        if (n < 100 || n > 999) return false;
        int a = n / 100, b = n % 100 / 10, c = n % 10;
        return a * a * a + b * b * b + c * c * c == n;
    }
}
