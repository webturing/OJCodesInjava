package aoj;

import java.util.Scanner;

public class P1430 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            int q = cin.nextInt();
            int[] terrace = new int[n * m];
            for (int i = 0; i < n * m; i++) {
                terrace[i] = cin.nextInt();
            }
            for (int i = 0; i < q; i++) {
                int z = cin.nextInt();
                int count = 0;
                for (int j = 0; j < n * m; j++)
                    if (terrace[j] > z) {
                        count++;
                    }
                System.out.println(count);
            }

        }
    }
}