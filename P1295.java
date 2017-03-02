import java.io.PrintWriter;
import java.util.Scanner;

public class P1295 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNextInt()) foo(cin.nextInt());

        cout.close();
        cin.close();
    }

    private static void foo(int n) {
        double tot = 0;
        for (int i = 1; i <= n; i++)
            tot += 1.0 / i;
        cout.println(String.format("%.3f", tot));
    }


}
