import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class P1134b {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            Calendar date = Calendar.getInstance();
            date.set(cin.nextInt(), cin.nextInt() - 1, cin.nextInt());
            date.add(Calendar.DATE, 10000);
            cout.println(new SimpleDateFormat("yyyy-M-d").format(date.getTimeInMillis()));
        }
        cout.close();
        cin.close();
    }
}
