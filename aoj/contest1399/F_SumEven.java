package aoj.contest1399;

import java.util.Scanner;

public class F_SumEven {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m, n, a, sum, k;
        while (cin.hasNext()) {
            n = cin.nextInt();
            m = cin.nextInt();
            a = 2;
            sum = 0;
            k = 0;
            while (n-- > 0) {
                sum = sum + a;
                a += 2;
                k++;
                if (k == m) {
                    sum = sum / k;
                    System.out.print(sum + " ");
                    sum = 0;
                    k = 0;
                }
            }
            if (k != 0) {
                sum = sum / k;
                System.out.println(sum);
            }
        }
        cin.close();
    }
}