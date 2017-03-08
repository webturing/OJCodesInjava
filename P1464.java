import java.io.PrintWriter;
import java.util.Scanner;

public class P1464 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        for (int n = cin.nextInt(), i = 1; i <= n; i++) {
            String b = new StringBuffer(Long.toBinaryString(cin.nextLong())).reverse().toString();
            int pos =b.indexOf('1') ;
            cout.println(String.format("Case #%d: %d", i, 1<<pos));
        }
        cout.close();
        cin.close();
    }
}
