package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1029 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        int n = cin.nextInt();
        int[][] a = new int[n][n];
        int tot = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                a[i][j] = cin.nextInt();
                if (i == j || i + j == n - 1) tot += a[i][j];
            }
        cout.println(tot);
        cout.close();
        cin.close();
    }
}
