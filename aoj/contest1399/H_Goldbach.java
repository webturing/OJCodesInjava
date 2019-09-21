package aoj.contest1399;

import java.util.Scanner;

public class H_Goldbach {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(), sum = 0;
        for (int i = n / 2; i >= 2; i--)
            if (prime(i) && prime(n - i)) sum++;
        System.out.println(sum);
        cin.close();
    }

    private static boolean prime(int n) {
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }
}