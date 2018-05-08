package nyist.part7highPrecision;

import java.util.Scanner;

public class NYIST0773SqrtN2 {
    public static void main(String[] args) {
        for (Scanner cin = new Scanner(System.in); cin.hasNext(); ) {
            int n = cin.nextInt();
            double p = cin.nextDouble();
            if (n == 0 && p == 0)
                break;
            long left = 1, right = (long) (1e9 * 2), mid = (right + left) / 2;
            while (left < right) {
                mid = (right + left) / 2;
                double k = Math.pow(mid, n);
                if (k > p) {
                    right = mid;
                } else if (k < p) {
                    left = mid;
                } else
                    break;
            }
            System.out.print(mid + "\n");

        }
    }
}