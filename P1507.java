import java.io.PrintWriter;
import java.util.Scanner;

public class P1507 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNext()) {
            int cmp = foo(cin.nextInt()) - foo(cin.nextInt());
            if (cmp == 0)
                cout.println("=");
            else if (cmp > 0)
                cout.println(">");
            else
                cout.println("<");
        }

        cout.close();
        cin.close();
    }

    private static int foo(int n) {
        int tot = 0;
        while (n % 2 == 0) {
            n /= 2;
            tot++;
        }
        return tot;
    }
}
