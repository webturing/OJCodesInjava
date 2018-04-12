package aoj;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1174 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNextInt()) foo(cin.nextInt());

        cout.close();
        cin.close();
    }

    private static void foo(int size) {
        T a[] = new T[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = new T();
            a[i].start = cin.nextInt();
            a[i].end = cin.nextInt();

        }
        Arrays.sort(a);
        int tot = 0;
        int end = 0;
        for (T t : a)
            if (t.start >= end) {
                ++tot;
                end = t.end;
            }
        cout.println(tot);
    }

    static class T implements Comparable<T> {
        int start, end;

        @Override
        public int compareTo(T that) {
            return this.end - that.end;
        }
    }


}
