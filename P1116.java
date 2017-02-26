import java.io.PrintWriter;
import java.util.Scanner;

public class P1116 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int tot = 0;
        for (int i = 7, N = cin.nextInt(); i <= N; i++) {
            if (i % 7 == 0 || Integer.toString(i).contains("7"))
                ++tot;
        }
        cout.println(tot);
        cin.close();
        cout.close();
    }
}
