package pat.basic;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1007 {

    final static int N = 100000 + 10;

    static boolean[] primer = new boolean[N];
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static {
        Arrays.fill(primer, true);
        primer[0] = primer[1] = false;
        for (int i = 2; i * i <= N; i++)
            if (primer[i])
                for (int j = i * i; j < N; j += i)
                    primer[j] = false;
    }

    public static void main(String[] args) {
        int n = cin.nextInt();
        int tot = 0;
        for (int i = 3; i + 2 <= n; i += 2) {
            if (primer[i] && primer[i + 2])
                ++tot;
        }
        cout.println(tot);
        cin.close();
        cout.close();
    }
}
