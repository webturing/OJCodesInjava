import java.io.PrintWriter;
import java.util.Scanner;

public class P1038 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        long n = cin.nextLong();
        while (true) {
            if (n == 1) break;
            if (n % 2 == 0) {
                cout.println(String.format("%d/2=%d", n, n / 2));
                n /= 2;
            } else {
                cout.println(String.format("%d*3+1=%d", n, 3 * n + 1));
                n = 3 * n + 1;
            }
        }

        cin.close();
        cout.close();
    }
}
