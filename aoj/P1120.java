package aoj;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class P1120 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        Vector<MyDate> v = new Vector<MyDate>();
        while (cin.hasNext()) v.add(new MyDate(cin.next()));
        Collections.sort(v);
        for (MyDate date : v)
            cout.println(date);
        cout.close();
        cin.close();
    }

    static class MyDate implements Comparable<MyDate> {
        int y, m, d;

        MyDate(String s) {
            String ss[] = s.split("/");
            y = Integer.parseInt(ss[2]);
            m = Integer.parseInt(ss[0]);
            d = Integer.parseInt(ss[1]);
        }

        @Override
        public int compareTo(MyDate that) {
            if (this.y != that.y) return this.y - that.y;
            if (this.m != that.m) return this.m - that.m;
            return this.d - that.d;
        }

        @Override
        public String toString() {
            return String.format("%2d/%2d/%4d", m, d, y);
        }
    }


}
