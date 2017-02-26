import java.io.PrintWriter;
import java.util.Scanner;

public class P1036 {

    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        double h = 100, tot = -100;

        for (int n = cin.nextInt(); n-- > 0; ) {
            tot += 2 * h;
            h /= 2;

        }
        cout.println(String.format("%.4f",tot));

        cin.close();
        cout.close();
    }
}
