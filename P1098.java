import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1098 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static long factorial(int n) {
        if (n <= 1)
            return 1L;
        return factorial(n - 1) * n;
    }

    public static void main(String[] args) {
        int n = cin.nextInt();
        char cs[] = cin.next().toCharArray();
        Arrays.sort(cs);
        long tot = factorial(n);
        char cur = cs[0];
        int s = 0;
        for (char c : cs) {
            if (c == cur) {
                ++s;
            } else {
                tot /= factorial(s);
                s = 1;
                cur = c;
            }
        }
        cout.println(tot / factorial(s));
        cout.close();
        cin.close();
    }


}
