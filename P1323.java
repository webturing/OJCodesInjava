import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1323 {
    static class Person implements Comparable<Person> {
        String name;
        int year, month, day;

        @Override
        public int compareTo(Person that) {
            Person pa = this, pb = that;
            if (pa.year != pb.year) return pa.year - pb.year;
            if (pa.month != pb.month) return pa.month - pb.month;
            return pa.day - pb.day;
        }
    }

    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        Person[] persons = new Person[cin.nextInt()];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
            persons[i].name = cin.next();
            persons[i].year = cin.nextInt();
            persons[i].month = cin.nextInt();
            persons[i].day = cin.nextInt();
        }
        Arrays.sort(persons);
        for (Person person : persons)
            cout.println(person.name);
        cout.close();
        cin.close();
    }


}