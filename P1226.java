import java.io.PrintWriter;
import java.util.Scanner;

public class P1226 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNext()) {
            char[] cs = cin.nextLine().toCharArray();
            cout.print(Character.toUpperCase(cs[0]));
            for (int i = 1; i < cs.length; i++) {
                if (Character.isLetter(cs[i]) && !Character.isLetter(cs[i - 1]))
                    cout.print(Character.toUpperCase(cs[i]));
                else
                    cout.print(cs[i]);
            }
            cout.println();
        }
        cin.close();
        cout.close();
    }
}
