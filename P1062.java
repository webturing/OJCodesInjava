import java.io.PrintWriter;
import java.util.Scanner;

public class P1062 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static int f(int n) {
        if (n == 1)
            return 1;
        return 2 * (f(n - 1) + 1);
    }

    public static void main(String[] args) {
        while (cin.hasNext())
            cout.println(f(cin.nextInt()));
        cin.close();
        cout.close();
    }
}
