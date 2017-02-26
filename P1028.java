import java.io.PrintWriter;
import java.util.Scanner;

public class P1028 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static int f(int x) {
        if (x == 1) return 10;
        return f(x - 1) + 2;
    }

    public static void main(String[] args) {
        cout.println(f(cin.nextInt()));
        cin.close();
        cout.close();
    }
}
