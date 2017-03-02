import java.io.PrintWriter;
import java.util.Scanner;

public class P1179 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        for (int n = cin.nextInt(); n-- > 0; ) {
            int a = cin.nextInt(), b = cin.nextInt(), c = cin.nextInt();
            if (a + b == c) cout.println(String.format("%d+%d=%d", a, b, c));
            else if (a - b == c) cout.println(String.format("%d-%d=%d", a, b, c));
            else if (b - a == c) cout.println(String.format("%d-%d=%d", b, a, c));
            else if (a * b == c) cout.println(String.format("%d*%d=%d", a, b, c));
            else if (a == c * b) cout.println(String.format("%d/%d=%d", a, b, c));
            else if (b == c * a) cout.println(String.format("%d/%d=%d", b, a, c));
            else cout.println("None");
        }
        cout.close();
        cin.close();
    }


}
