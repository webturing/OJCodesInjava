import java.io.PrintWriter;
import java.util.Scanner;

public class P1225 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        for (int n = Integer.parseInt(cin.nextLine()); n-- > 0; )
            cout.println(cin.nextLine().matches("(_|[a-zA-Z])(_|[a-zA-Z]|[0-9])*") ? "yes" : "no");
        
        cout.close();
        cin.close();
    }


}
