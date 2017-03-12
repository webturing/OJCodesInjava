import java.io.PrintWriter;
import java.util.Scanner;

public class P1078 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if (n == 0) break;
            int tot = 0;
            while (n > 1) {
                if (n % 3 == 0)
                    n /= 3;
                else n = (n + 2) / 3;
                ++tot;
            }
            cout.println(tot);
        }
        cout.close();
        cin.close();
    }


}
