import java.io.PrintWriter;
import java.util.Scanner;

public class P1097 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        cout.println(new StringBuffer(cin.next()).reverse().toString());
        cin.close();
        cout.close();
    }
}
