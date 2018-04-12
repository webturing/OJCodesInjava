package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1296 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            double tot = 0;
            for (int i = 1; i <= n; i += 2)
                if (i % 4 == 1)
                    tot += 1. / i;
                else
                    tot -= 1. / i;
            cout.println(String.format("%.6f", tot * 4));
        }

        cout.close();
        cin.close();
    }
}
