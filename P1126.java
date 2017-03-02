import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1126 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            String s = cin.next();
            char cs[] = s.toCharArray();
            Arrays.sort(cs);
            char max = cs[cs.length - 1];
            cout.println(s.replaceAll(Character.toString(max), max + "(max)"));
        }
        cout.close();
        cin.close();
    }
}
