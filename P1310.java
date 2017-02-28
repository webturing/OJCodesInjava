import java.io.PrintWriter;
import java.util.Scanner;

public class P1310 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = cin.nextInt();
        int m = (int) (Math.sqrt(n));
        int left = m * m, right = (m + 1) * (m + 1);
        if (n - left < right - n)
            cout.println(left);
        else
            cout.println(right);

        cout.close();
        cin.close();
    }


}
