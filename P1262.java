import java.io.PrintWriter;
import java.util.Scanner;

public class P1262 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int ones = Long.toBinaryString(cin.nextLong()).replaceAll("0", "").length();
            if (ones % 2 == 0)
                cout.println("even");
            else
                cout.println("odd");
        }

        cout.close();
        cin.close();
    }
}
