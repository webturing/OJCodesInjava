import java.io.PrintWriter;
import java.util.Scanner;

public class P1502 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNextInt()) {
            foo(cin.nextInt(), cin.nextInt());
        }

        cout.close();
        cin.close();
    }

    private static void foo(int a, int n) {
        long sum = 0, t = a;
        for (int i = 1; i <= n; i++) {
            sum += t;
            t = t * 10 + a;
        }
        cout.println(sum);
    }


}
