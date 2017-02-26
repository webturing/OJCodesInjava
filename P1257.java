import java.io.PrintWriter;
import java.util.Scanner;

public class P1257 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        String a = cin.next(), b = cin.next();
        int x = Integer.parseInt(a.substring(a.length() - 1));
        int y = Integer.parseInt(b.substring(b.length() - 1));
        int z = cin.nextInt();
        if ((x + y) % 10 == z)
            cout.println("YES");
        else
            cout.println("NO");
        cin.close();
        cout.close();
    }


}
