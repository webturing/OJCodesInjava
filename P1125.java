import java.io.PrintWriter;
import java.util.Scanner;

public class P1125 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
    static long Q[][] = new long[21][21];

    static long cnr(int n, int r) {
        if (Q[n][r] != 0)
            return Q[n][r];
        if (r == 0 || n == r)
            return Q[n][r] = 1;
        return Q[n][r] = cnr(n - 1, r - 1) + cnr(n - 1, r);
    }


    public static void main(String[] args) {
        for (; cin.hasNext(); foo(cin.nextInt())) ;

        cout.close();
        cin.close();
    }

    private static void foo(int n) {
        for (int i = 0; i < n; i++) {
            cout.print(cnr(i, 0));
            for (int j = 1; j <= i; j++)
                cout.print(" " + cnr(i, j));
            cout.println();
        }
        cout.println();
    }


}
