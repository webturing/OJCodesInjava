package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1043 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        double tot = 1;
        int m = cin.nextInt();
        for (int i = 2; i <= m; i++)
            tot -= 1. / i / i;
        cout.println(String.format("%.6f", tot));
        cin.close();
        cout.close();
    }
}
