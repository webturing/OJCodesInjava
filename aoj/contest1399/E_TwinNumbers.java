package aoj.contest1399;

import java.io.PrintWriter;
import java.util.Scanner;

public class E_TwinNumbers {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        for (int T = cin.nextInt(); T-- > 0; ) {
            int n = cin.nextInt(), m = cin.nextInt();
            if (f(n) == m && f(m) == n)
                cout.println("YES");
            else
                cout.println("NO");
        }
        cout.close();
        cin.close();
    }

    private static int f(int n) {
        int tot = 1, c;
        for (c = 2; c * c < n; c++)
            if (n % c == 0) tot += c + n / c;
        if (n % c == 0)
            tot += c;
        return tot;
    }


}