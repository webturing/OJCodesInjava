package contests.mt2018;


import java.util.Scanner;

public class CWorldCup {
    final static int maxn = 20;
    static Scanner cin = new Scanner(System.in);
    static double[][] F = new double[maxn][maxn];
    static double[][] dp = new double[20][10];


    public static void main(String[] args) {
        for (int i = 1; i <= 16; i++) {
            for (int j = 1; j <= 16; j++) {
                F[i][j] = cin.nextDouble();
            }
        }

        for (int i = 1; i <= 16; i++) {
            if (i % 2 == 1) dp[i][1] = F[i][i + 1];
            else dp[i][1] = F[i][i - 1];
        }
        for (int i = 2; i <= 4; i++) {
            int sub = 1 << i;
            for (int j = 1; j <= 16; j++) {
                for (int k = 1; k <= 16; k++) {
                    if ((k - 1) / sub == (j - 1) / sub) {
                        if ((k - 1) / (sub / 2) != (j - 1) / (sub / 2)) {
                            dp[j][i] += dp[j][i - 1] * dp[k][i - 1] * F[j][k];
                        }
                    }
                }
            }
        }
        System.out.print(String.format("%.10f", dp[1][4]));
        for (int j = 2; j <= 16; j++) {
            System.out.print(String.format(" %.10f", dp[j][4]));
        }
        System.out.println();
    }
}

