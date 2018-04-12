package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1544 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        long fib[] = new long[31];
        fib[1] = fib[2] = 1;
        for (int i = 3; i < fib.length; i++) fib[i] = fib[i - 1] + fib[i - 2];
        for (int i = 1; i < fib.length; i++) fib[i] += fib[i - 1];
        for (int T = cin.nextInt(); T-- > 0; ) cout.println(fib[cin.nextInt()]);
        cin.close();
        cout.close();
    }
}
