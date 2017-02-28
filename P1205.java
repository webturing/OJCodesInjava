import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1205 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        for (int n = cin.nextInt(); n-- > 0; ) {
            char[] cs = cin.next().toCharArray();
            Arrays.sort(cs);
            cout.println(String.format("%c %c %c", cs[0], cs[1], cs[2]));
        }
        cout.close();
        cin.close();
    }


}
