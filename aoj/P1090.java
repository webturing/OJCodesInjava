package aoj;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1090 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static boolean[] prime = new boolean[1000000 + 5];

    static {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= prime.length; i++)
            if (prime[i])
                for (int j = i * i; j < prime.length; j += i) prime[j] = false;
    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int tot = 0;
            for (int i = 3; i <= n / 2; i += 2) {
                if (prime[i] && prime[n - i])
                    ++tot;
            }
            cout.println(tot);
        }
        cin.close();
        cout.close();
    }
}
