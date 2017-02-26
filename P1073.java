import java.io.PrintWriter;
import java.util.Scanner;

public class P1073 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        int n = cin.nextInt();
        int tot = 0;
        for (int one = 1; one <= n; one++)
            for (int two = 1; two <= n / 2; ++two)
                for (int five = 1; five <= n / 5; ++five) {
                    if (one + two * 2 + five * 5 == n)
                        ++tot;
                }
        cout.println(tot);

        cin.close();
        cout.close();
    }
}
