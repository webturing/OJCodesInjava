import java.io.PrintWriter;
import java.util.Scanner;

public class P1026 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int a = cin.nextInt(), n = cin.nextInt();
        long s = 0, t = a;
        for (int i = 0; i < n; i++) {
            s += t;
            t = 10 * t + a;
        }
        cout.println(s);

        cin.close();
        cout.close();
    }
}
