import java.io.PrintWriter;
import java.util.Scanner;

public class P1292 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int a = cin.nextInt(), b = cin.nextInt(), c = cin.nextInt();
            boolean find = false;
            for (int n = 10; n <= 100; n++) {
                if (n % 3 == a && n % 5 == b & n % 7 == c) {
                    cout.println(n);
                    find = true;
                    break;
                }
            }
            if (!find)
                cout.println("No answer");
        }
        cout.println();
        cout.close();
        cin.close();
    }


}
