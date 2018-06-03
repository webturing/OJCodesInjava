package contests.mt2018;

import java.util.Scanner;

public class BColar {
    static final int maxn = 10100;
    static int[] a = new int[maxn];
    static int[] b = new int[maxn];
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            int k = cin.nextInt();
            for (int i = 0; i < k; i++) {
                a[i] = cin.nextInt();
                b[i] = cin.nextInt();
            }

            int index = 0;
            double p = 1.0 * m / n;
            double ans = p * a[1] + (1.0 - p) * b[1];
            for (int i = 0; i < k; i++) {
                double cur = p * a[i] + (1.0 - p) * b[i];
                if (cur >= ans) {
                    ans = cur;
                    index = i;
                }
            }

            for (int i = 0; i < k; i++) {
                if (i == index) {
                    System.out.print(String.format("%d%c", n, i == k ? '\n' : ' '));
                } else {
                    System.out.printf(String.format("%d%c", 0, i == k ? '\n' : ' '));
                }
            }
        }
    }
}
