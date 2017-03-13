import java.io.PrintWriter;
import java.util.Scanner;

public class P1260 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNext()) {
            String text = cin.nextLine();
            String key = cin.nextLine();
            int x = text.length();
            int y = text.replaceAll(key, "").length();
            int z = key.length();
            cout.println((x - y) / z);
        }

        cout.close();
        cin.close();
    }
}
