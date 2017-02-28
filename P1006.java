import java.io.PrintWriter;
import java.util.Scanner;

public class P1006 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNextLine()) cout.println(check(cin.nextLine()) ? "Y" : "N");
        cout.close();
        cin.close();
    }

    private static boolean check(String ip) {
        String ss[] = ip.trim().split("\\W+");
        for (String s : ss)
            if (!check2(s))
                return false;
        return true;
    }

    private static boolean check2(String s) {
        int n;
        try {
            n = Integer.parseInt(s);
            if (n > 255 || n < 0)
                return false;
        } catch (Exception e) {
            return false;
        }
        return n <= 255 && n >= 0;
    }


}
