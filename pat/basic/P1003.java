package pat.basic;


import java.io.PrintWriter;
import java.util.Scanner;

public class P1003 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static boolean check(String s) {
        int a, b, c, p, t, x;
        a = b = c = p = t = x = 0;
        for (char ch : s.toCharArray()) {
            if (p == 0 && ch == 'A') ++a;
            else if (t == 0 && ch == 'A') ++b;
            else if (t == 1 && ch == 'A') ++c;
            else if (ch == 'P') ++p;
            else if (ch == 'T') ++t;
            else x++;
        }
        return check(a, b, c, p, t, x);
    }

    private static boolean check(int a, int b, int c, int p, int t, int x) {
        if (x != 0 || p != 1 || t != 1 || b < 1) return false;
        if (b == 1) return c == a;
        return check(a, b - 1, c - a, p, t, 0);
    }

    public static void main(String[] args) {
        int n = cin.nextInt();
        while (n-- > 0) {
            String s = cin.next();
            if (check(s)) {
                cout.println("YES");
            } else {
                cout.println("NO");
            }
        }
        cin.close();
        cout.close();
    }
}
