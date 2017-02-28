import java.io.PrintWriter;
import java.util.Scanner;

public class P1142 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext())
            cout.println(f(cin.nextInt(), cin.nextInt()));
        cout.close();
        cin.close();
    }

    static long Q[][] = new long[21][21];

    private static long f(int n, int r) {
        if (Q[n][r] != 0)
            return Q[n][r];
        if (r == 0 || r == n)
            return Q[n][r] = 1;
        return Q[n][r] = f(n - 1, r) + f(n - 1, r - 1);
    }

}
