import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P1134 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        while (cin.hasNext()) {
            int y = cin.nextInt();
            int m = cin.nextInt();
            int d = cin.nextInt();
            Date date = new Date();
            date.setYear(y - 1900);
            date.setMonth(m - 1);
            date.setDate(d);
            long x = date.getTime();
            long yy = x + 10000L * 24 * 3600 * 1000;
            date.setTime(yy);
            DateFormat format = new SimpleDateFormat("yyyy-M-d");
            cout.println(format.format(date));
        }

        cout.close();
        cin.close();
    }
}
