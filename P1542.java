import java.io.PrintWriter;
import java.util.Scanner;

public class P1542 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    static {
    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int k = cin.nextInt();
            double tot = 200, cur = n;
            boolean find = false;
            for (int i = 0; i < 20; i++) {

                if (cur >= tot) {
                    find = true;
                    cout.println(i + 1);
                    break;
                }
                tot *= 1 + k / 100.;
                cur += n;
            }
            if (!find) cout.println("Impossible");
        }
        cin.close();
        cout.close();
    }
}
