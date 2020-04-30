package pat.basic;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

public class P1010 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        Vector<Point> v = new Vector<>();
        while (cin.hasNext()) {
            int x = cin.nextInt();
            int y = cin.nextInt();

            Point p = x * y == 0 ? new Point(0, 0) : new Point(x * y, y - 1);
            if (v.size() > 0 && v.lastElement().y == 0) continue;
            v.add(p);
        }
        if (v.isEmpty()) {
            cout.println("0 0");
            return;
        }
        StringBuffer buffer = new StringBuffer();
        for (Point q : v) {
            buffer.append(" " + q.x + " " + q.y);
        }
        cout.println(buffer.substring(1));
        cin.close();
        cout.close();
    }

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return " " + x + " " + y;
        }
    }
}
