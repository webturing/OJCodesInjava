import java.io.PrintWriter;
import java.util.Scanner;

public class P1074 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        for (int n = cin.nextInt(); n-- > 0; ) {
            int h1 = cin.nextInt();
            int m1 = cin.nextInt();
            int s1 = cin.nextInt();
            int h2 = cin.nextInt();
            int m2 = cin.nextInt();
            int s2 = cin.nextInt();
            int sc = 0;
            int s = (s1 + s2 + sc) % 60;
            sc = (s1 + s2 + sc) / 60;
            int m = (m1 + m2 + sc) % 60;
            sc = (m1 + m2 + sc) / 60;
            int h = (h1 + h2 + sc);
            cout.println(String.format("%d %d %d", h, m, s));
        }
        cout.close();
        cin.close();
    }

}
