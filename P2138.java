import java.io.PrintWriter;
import java.util.Scanner;

public class P2138 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        String s = cin.nextLine();
        cout.println(String.format("%d %d %d %d",
                s.replaceAll("[^A-Z]", "").length(),
                s.replaceAll("[^a-z]", "").length(),
                s.replaceAll("[^0-9]", "").length(),
                s.replaceAll("\\S", "").length()));
        cout.close();
        cin.close();
    }
}
