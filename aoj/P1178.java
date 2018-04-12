package aoj;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1178 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        for (int n = cin.nextInt(); n-- > 0; ) {
            int A[] = new int[cin.nextInt()];
            for (int i = 0; i < A.length; i++)
                A[i] = cin.nextInt();
            Arrays.sort(A);
            cout.println(check(A) ? "yes" : "no");
        }
        cout.close();
        cin.close();
    }

    private static boolean check(int[] a) {
        int dif = a[0] - a[1];
        for (int i = 2; i < a.length; i++)
            if (a[i - 1] - a[i] != dif)
                return false;
        return true;
    }
}
