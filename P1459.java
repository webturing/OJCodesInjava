import java.io.PrintWriter;
import java.util.Scanner;

public class P1459 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int head = cin.nextInt(), leg = cin.nextInt();
            for (int hair = 0; hair <= head; hair++) {
                int chick = head - hair;
                if (4 * hair + 2 * chick == leg) {
                    cout.println(hair + " " + chick);
                    break;
                }
            }
        }
        cin.close();
        cout.close();
    }
}
