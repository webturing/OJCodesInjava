import java.io.PrintWriter;
import java.util.Scanner;

public class P1558 {

    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        for (int T = cin.nextInt(); T-- > 0; ) {
            int M = cin.nextInt(), N = cin.nextInt();
            cout.println(String.format("%.2f%%", 100.0 * N / M));
        }

        cin.close();
        cout.close();
    }
}
