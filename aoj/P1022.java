package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1022 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
    static long fib[] = new long[40 + 1];

    static {
        fib[1] = fib[2] = 1;
        for (int i = 3; i < fib.length; i++) fib[i] = fib[i - 1] + fib[i - 2];

    }

    public static void main(String[] args) {
        int N = cin.nextInt();
        for (int i = 1; i <= N; i++)
            cout.print(fib[i] + " ");
        cout.println();
        cin.close();
        cout.close();
    }
}
