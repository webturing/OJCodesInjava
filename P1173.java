import java.io.PrintWriter;
import java.util.Scanner;

public class P1173 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        long n = cin.nextLong();
        int m = Long.toBinaryString(n).length();
        long left = (1L << (m - 1));
        long right = (1L << (m));
        if (n - left <= right - n)
            cout.println(left);
        else
            cout.println(right);
        cout.close();
        cin.close();
    }


}
