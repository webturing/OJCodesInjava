package aoj;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1153 {
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
        int a = 100, b = 200;
        int tot = 0;
        boolean first = true;
        for (int i = a; i <= b; i++)
            if (prime[i]) ++tot;
        cout.println(tot);
        for (int i = a; i <= b; i++)
            if (prime[i]) {
                if (first) {
                    first = false;
                } else {
                    cout.print(" ");
                }
                cout.print(i);
            }
        cin.close();
        cout.close();
    }
}
