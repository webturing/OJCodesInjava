import java.io.PrintWriter;
import java.util.Scanner;

public class P1052 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int m = cin.nextInt();
        String n = cin.next();
        boolean find = false;
        for (int i = 0; i < 20; i++) {
            // System.out.println(">>>>>>>>>>>>>>" + n + "<<<<<<<<<<<<<");
            if (sys(n)) {
                cout.println("STEP=" + i);
                find = true;
                break;
            }
            n = foo(n, m);
        }
        if (!find)
            cout.println("Impossible");
        cout.close();
        cin.close();
    }

    private static String foo(String n, int m) {
        int a = Integer.parseInt(n, m);
        int b = Integer.parseInt(new StringBuffer(n).reverse().toString(), m);
        return Integer.toString(a + b, m);

    }

    private static boolean sys(String s) {
        return s.equals(new StringBuffer(s).reverse().toString());
    }


}