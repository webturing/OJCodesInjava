import java.io.PrintWriter;
import java.util.Scanner;

public class P1017 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        String str = cin.next();
        cout.println(str + new StringBuffer(str).reverse());
        cin.close();
        cout.close();
    }
}
