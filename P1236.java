import java.io.PrintWriter;
import java.util.Scanner;

public class P1236 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int a[] = new int[cin.nextInt()];
            for (int i = 0; i < a.length; i++)
                a[i] = cin.nextInt();
            cout.println(lcm(a));
        }
        cin.close();
        cout.close();
    }

    private static int lcm(int[] a) {
        int ret = 1;
        for (int i : a)
            ret = lcm(ret, i);
        return ret;
    }


}
