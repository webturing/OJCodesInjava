import java.io.PrintWriter;
import java.util.Scanner;

public class P1087 {

    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNext())
            cout.println(cin.nextLine().replaceAll("\\s+", ""));

        cin.close();
        cout.close();
    }
}
