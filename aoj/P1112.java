package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1112 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        for (int n = cin.nextInt(); n-- > 0; ) {
            int a[] = new int[9];
            for (int i = 0; i < a.length; i++) a[i] = cin.nextInt();
            for (int i = a.length - 1; i >= 0; i--)
                if (a[i] < a[0]) {
                    cout.print(a[i] + " ");
                }
            cout.print(a[0]);
            for (int i = 0; i < a.length; i++)
                if (a[i] > a[0]) {
                    cout.print(" " + a[i]);
                }
            cout.println();

        }
        cin.close();
        cout.close();
    }
}
