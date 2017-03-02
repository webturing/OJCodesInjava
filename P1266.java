import java.io.PrintWriter;
import java.util.Scanner;

public class P1266 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            int c = cin.nextInt();
            if (a == -1 && b == -1 && c == -1)
                break;
            foo(new int[]{a, b, c});
        }
        cout.close();
        cin.close();
    }

    private static void foo(int[] ints) {
        for (int i : ints) {
            if (i <= 168) {
                cout.println("CRASH " + i);
                return;
            }
        }
        cout.println("NO CRASH");

    }


}
