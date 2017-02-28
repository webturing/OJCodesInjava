import java.io.PrintWriter;
import java.util.Scanner;

public class P1316 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        for (int n = cin.nextInt(); n-- > 0; ) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            cout.println((a + b) * (a + b + 1) / 2 + a + 1);
        }
        cout.close();
        cin.close();
    }

}
