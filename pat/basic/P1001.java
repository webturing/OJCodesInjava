package pat.basic;


import java.io.PrintWriter;
import java.util.Scanner;

public class P1001 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = cin.nextInt(), step = 0;
        while (n > 1) {
            if ((n & 1) != 0) {
                n = 3 * n + 1;
            } else {
                n >>= 1;
                ++step;
            }
        }
        cout.println(step);
        cin.close();
        cout.close();
    }
}
