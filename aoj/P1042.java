package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1042 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static {
    }

    public static void main(String[] args) {
        int n = cin.nextInt();
        long tot = 1L;
        for (int i = 2; i <= n; i++)
            tot *= i;
        cout.println(tot);
        cin.close();
        cout.close();
    }
}
