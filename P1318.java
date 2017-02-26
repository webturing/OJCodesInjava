import java.io.PrintWriter;
import java.util.Scanner;

public class P1318 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        for (int N = cin.nextInt(); N-- > 0; ) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            int tot = 0;
            for (int i = 1; i <= n; i++)
                tot += i % m;
            cout.println(tot);
        }
        cin.close();
        cout.close();
    }
}
