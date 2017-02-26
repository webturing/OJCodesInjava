import java.io.PrintWriter;
import java.util.Scanner;

public class P1570 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        for (int n = cin.nextInt(); n-- > 0; )
            cout.println(cin.next());
        cin.close();
        cout.close();
    }
}
