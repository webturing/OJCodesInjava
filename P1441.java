import java.io.PrintWriter;
import java.util.Scanner;

public class P1441 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNextLine()) {
            String key = cin.nextLine().toLowerCase();
            String text = cin.nextLine().toLowerCase();
            cout.println((text.length() - text.replaceAll(key, "").length()) / key.length());
        }

        cout.close();
        cin.close();
    }
}
