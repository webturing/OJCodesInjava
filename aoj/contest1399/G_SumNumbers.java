package aoj.contest1399;

import java.util.Scanner;

public class G_SumNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n, m;
            n = in.nextInt();
            m = in.nextInt();
            System.out.println(fun(n, m));
        }
        in.close();
    }

    private static int fun(int n, int m) {
        int sum = 0;
        for (int i = n; i <= m; i++) {
            if ((i % 3 == 1) && (i % 5 == 3))
                sum += i;
        }
        return sum;
    }
}