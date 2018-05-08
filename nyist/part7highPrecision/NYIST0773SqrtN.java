package nyist.part7highPrecision;

import java.util.Scanner;

public class NYIST0773SqrtN {
    public static void main(String[] args) {
        for (Scanner cin = new Scanner(System.in); cin.hasNext(); ) {
            int n = cin.nextInt();
            double p = cin.nextDouble();
            if (n == 0 && p == 0)
                break;
            double x = Math.pow(p, 1.0 / n);
            System.out.print((int) (x + 0.5) + "\n");

        }
    }
}