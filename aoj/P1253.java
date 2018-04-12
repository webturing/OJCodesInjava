package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1253 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNext()) {
            int from = cin.nextInt();
            int to = cin.nextInt();
            int tot = foo(from, to);
            cout.println(String.format("%d %d %d", from, to, tot));
        }
        cout.close();
        cin.close();
    }

    private static int foo(int from, int to) {
        if (from > to) {
            int temp = from;
            from = to;
            to = temp;
        }
        int max = 0;
        for (int n = from; n <= to; ++n) {
            int cur = f(n);
            if (cur > max) max = cur;
        }

        return max;
    }

    private static int f(int n) {
        int step = 1;
        while (n > 1) {
            if (n % 2 == 0)
                n /= 2;
            else n = 3 * n + 1;
            ++step;
        }


        return step;
    }
}
