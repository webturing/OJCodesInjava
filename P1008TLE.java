import java.io.PrintWriter;
import java.util.Scanner;

public class P1008TLE {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    static int pow(int k, int n) {
        return n == 0 ? 1 : pow(k, n - 1) * k;
    }

    public static void main(String[] args) {
        int n = cin.nextInt();
        int k = cin.nextInt();
        int tot = 0;
        int start = pow(k, n - 1), end = start * k - 1;
        for (int m = start; m <= end; m++) {
            if (!Integer.toString(m, k).contains("00")) ++tot;
        }
        cout.println(tot);
        cout.close();
        cin.close();
    }


}
