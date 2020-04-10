package pat.basic;


import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class P1004 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = cin.nextInt();
        Vector<Student> v = new Vector<Student>();
        for (int i = 0; i < n; i++) {
            v.add(new Student(cin.next(), cin.next(), cin.nextInt()));
        }
        Collections.sort(v, Collections.<Student>reverseOrder());
        cout.println(v.firstElement().name + " " + v.firstElement().id);
        cout.println(v.lastElement().name + " " + v.lastElement().id);
        cin.close();
        cout.close();
    }

    static class Student implements Comparable<Student> {
        String name;
        String id;
        int score;

        public Student(String name, String id, int score) {
            this.name = name;
            this.id = id;
            this.score = score;
        }

        @Override
        public int compareTo(Student that) {
            return this.score - that.score;
        }
    }
}
