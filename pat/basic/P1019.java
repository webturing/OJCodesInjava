package pat.basic;

import java.util.Arrays;
import java.util.Scanner;

public class P1019 {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        int n = cin.nextInt();
        while (true) {
            int[] D = new int[]{n / 1000, n % 1000 / 100, n % 100 / 10, n % 10};
            Arrays.sort(D);
            if (D[0] == D[3]) {
                System.out.println(String.format("%04d - %04d = %04d", n, n, 0));
                break;
            }
            int min = D[0] * 1000 + D[1] * 100 + D[2] * 10 + D[3];
            int max = D[3] * 1000 + D[2] * 100 + D[1] * 10 + D[0];
            System.out.println(String.format("%04d - %04d = %04d", max, min, n = max - min));
            if (n == 6174) {
                break;
            }

        }

    }
}
