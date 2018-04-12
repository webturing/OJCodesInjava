package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1071 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        for (int n = cin.nextInt(); n-- > 0; ) cout.println(f(cin.nextInt()));

        cout.close();
        cin.close();
    }

    private static int f(int n) {
        if (n == 0)
            return 3;

        return 2 * (f(n - 1) - 1);
    }

}
