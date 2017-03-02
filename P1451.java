import java.io.PrintWriter;
import java.util.Scanner;

public class P1451 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNextInt()) {
            cout.println(f(cin.nextInt()) ? "yes" : "no");
        }

        cout.close();
        cin.close();
    }

    private static boolean f(int n) {

        return n % g(n) == 0;
    }

    private static int g(int n) {
        return n < 10 ? n : g(n / 10) + n % 10;
    }


}
