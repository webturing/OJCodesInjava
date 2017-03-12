import java.io.PrintWriter;
import java.util.Scanner;

public class P1238 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
    static int B[] = {100, 50, 10, 5, 2, 1};

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if (n == 0) break;
            int tot = 0;
            for (int i = 0; i < n; i++)
                tot += foo(cin.nextInt());
            cout.println(tot);
        }
        cout.close();
        cin.close();
    }

    private static int foo(int m) {
        int tot = 0;
        for (int b : B) {
            tot += m / b;
            m %= b;
        }
        return tot;
    }


}
