package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1287 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) cout.println(f(cin.nextInt()));
        cout.close();
        cin.close();
    }

    private static int f(int n) {
        if (n == 1) return 0;
        if (n % 2 == 0)
            return f(n / 2) + 1;
        return f(3 * n + 1) + 1;
    }


}