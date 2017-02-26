import java.io.PrintWriter;
import java.util.Scanner;

public class P1123 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        int a = cin.nextInt();
        int b = cin.nextInt();
        cout.println(lcm(a, b));
        cin.close();
        cout.close();
    }
}
