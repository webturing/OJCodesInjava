import java.io.PrintWriter;
import java.util.Scanner;

public class P1802 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        int d = cin.nextByte();
        if (b == d)
            cout.println("INF");
        else
            cout.println((b - d) / (a - c));

        cout.close();
        cin.close();
    }
}
