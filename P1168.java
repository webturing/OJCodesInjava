import java.io.PrintWriter;
import java.util.Scanner;

public class P1168 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        int d = cin.nextByte();
        cout.println((a + c) + " " + (b + d));

        cout.close();
        cin.close();
    }
}
