package aoj;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

public class P1164 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        Quee quee[]=new Quee[3];
        for(int i = 0; i<3; i++)
            quee[i]=new Quee();
        while (cin.hasNext()) {
            int index=cin.nextInt();
            String tel=cin.next();
            quee[index].enqueue(tel);
        }
        for(int i=9; i>=0; i--)
            cout.println(String.format("%s %s %s", quee[0].q.get(i), quee[1].q.get(i), quee[2].q.get(i)));
        cout.close();
        cin.close();
    }

    static class Quee {
        Vector<String> q = new Vector<String>();

        Quee() {
            for (int i = 0; i < 10; i++)
                q.add("0");
        }

        void enqueue(String s) {
            if (q.size() < 10)
                q.add(s);
            else {
                q.remove(0);
                q.add(s);
            }
        }

    }
}
