package aoj;

import java.io.PrintWriter;
import java.util.Scanner;

public class P2045 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int a[] = {cin.nextInt(), cin.nextInt(), cin.nextInt(), cin.nextInt(), cin.nextInt()};
            if (a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 0)
                break;
            if (a[0] - a[1] == a[1] - a[2]) {
                int next = (a[2] - a[1]) + a[4];
                for (int i = 0; i < 5; i++, next += a[2] - a[1])
                    System.out.print(next + " ");
                System.out.println();
            } else {
                int next = a[4] * a[2] / a[1];
                for (int i = 0; i < 5; i++, next *= a[2] / a[1])
                    System.out.print(next + " ");
                System.out.println();
            }
        }
        cout.close();
        cin.close();
    }
}
