package books.ahaAlgorithm.books.excise;

import java.util.Scanner;
import java.util.TreeSet;

public class P1581AhaBuyBook {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        TreeSet<Integer> sets = new TreeSet<Integer>();
        for (int i = 0; i < n; i++)
            sets.add(cin.nextInt());
        System.out.println(sets.size());
        boolean first = true;
        for (Integer ele : sets) {
            if (first) {
                first = false;
            } else {
                System.out.print(" ");
            }
            System.out.print(ele);
        }
        System.out.println();

        cin.close();
    }
}
