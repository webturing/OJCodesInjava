package books.ahaAlgorithm.books.excise;

import java.util.LinkedList;
import java.util.Scanner;

public class P1582DecodeQQNumber {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < n; i++)
            list.add(cin.nextInt());

        boolean first = true;
        while (!list.isEmpty()) {
            if (first) {
                first = false;
            } else {
                System.out.print(" ");
            }
            System.out.print(list.pollFirst());
            if (list.isEmpty())
                return;
            list.addLast(list.pollFirst());
        }
        System.out.println();
        cin.close();
    }
}
