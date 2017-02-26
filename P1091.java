import java.io.PrintWriter;
import java.util.Scanner;

public class P1091 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        cout.println(foo(cin.next()));
        cin.close();
        cout.close();
    }

    private static String foo(String s) {
        String rs = new StringBuffer(s).reverse().toString();
        return rs.equals(s) ? "Y" : "N";
    }
}
