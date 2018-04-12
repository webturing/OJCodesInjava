package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1181 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
    static int fib[] = new int[21];

    static {
        fib[1] = fib[2] = 1;
        for (int i = 3; i < fib.length; i++)
            fib[i] = fib[i - 1] + fib[i - 2];
    }

    public static void main(String[] args) {
        for (int m = cin.nextInt(); m-- > 0; ) cout.println(fib[cin.nextInt()]);
        cin.close();
        cout.close();
    }
}
