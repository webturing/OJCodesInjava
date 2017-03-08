import java.io.PrintWriter;
import java.util.Scanner;

public class P1234 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        for (int m = cin.nextInt(); m-- > 0 && cin.hasNext(); foo(cin.nextInt())) ;

        cout.close();
        cin.close();
    }

    private static void foo(int n) {
        char digits[] = Integer.toString(n).toCharArray();
        int max = 0;
        for (int i = 0; i < digits.length; i++) {
            int s = 0;
            for (int j = 0; j < digits.length; j++) {
                if (i == j)
                    continue;
                s = s * 10 + digits[j] - '0';
            }
            if (s > max) max = s;
        }
        cout.println(max);
    }

}
