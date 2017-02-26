import java.io.PrintWriter;
import java.util.Scanner;

public class P1573 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        for (int N = cin.nextInt(); N-- > 0; cout.println(foo(cin.next()))) ;
        cin.close();
        cout.close();
    }

    private static int foo(String s) {
        if (s.length() % 2 != 0 || s.length() <= 1)
            return s.length();
        String rs = new StringBuffer(s).reverse().toString();
        if (!rs.equals(s))
            return s.length();
        return foo(s.substring(0, s.length() / 2));
    }
}
