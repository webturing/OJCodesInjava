import java.io.PrintWriter;
import java.util.Scanner;

public class P1315 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        for (int n = cin.nextInt(); n-- > 0; ) {
            char cs[] = cin.next().toCharArray();

            char cur = cs[0];
            int tot = 1;
            for (int i = 1; i < cs.length; i++) {
                if (cs[i] == cur) ++tot;
                else {
                    cout.print(tot + "" + cur);
                    tot = 1;
                    cur = cs[i];
                }
            }
            cout.println(tot + "" + cur);

        }
        cin.close();
        cout.close();
    }
}
