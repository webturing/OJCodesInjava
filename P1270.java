import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class P1270 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        while (cin.hasNext()) {
            int m = cin.nextInt();
            while (m-- > 0) {
                TreeSet<Rectangle> set = new TreeSet<Rectangle>();
                for (int size = cin.nextInt(); size-- > 0; )
                    set.add(new Rectangle(cin.nextInt(), cin.nextInt(), cin.nextInt()));
                for (Rectangle rectangle : set)
                    cout.println(rectangle);
            }
        }

        cout.close();
        cin.close();
    }

    static class Rectangle implements Comparable<Rectangle> {
        int number;
        int length;
        int width;

        Rectangle(int number, int a, int b) {
            this.number = number;
            if (a < b) {
                int t = a;
                a = b;
                b = t;
            }
            this.length = a;
            this.width = b;
        }


        @Override
        public int compareTo(Rectangle that) {
            if (this.number != that.number)
                return this.number - that.number;
            if (this.length != that.length)
                return this.length - that.length;
            return this.width - that.width;
        }

        @Override
        public String toString() {
            return String.format("%d %d %d", this.number, this.length, this.width);
        }
    }
}
