package pat.basic;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1008 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = cin.nextInt(), k = cin.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = cin.nextInt();
        StringBuffer buffer = new StringBuffer();
        for (int i = n - k; i < 2 * n - k; i++) {
            buffer.append(" " + a[(i % n + n) % n]);

        }
        cout.println(buffer.substring(1));
        cin.close();
        cout.close();
    }
}
