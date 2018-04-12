package aoj;

import java.util.Arrays;
import java.util.Scanner;

public class P1283 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] a = {cin.nextInt(), cin.nextInt(), cin.nextInt()};
        Arrays.sort(a);
        if (a[0] + a[1] <= a[2])
            System.out.println("not a triangle");
        else if (a[0] * a[0] + a[1] * a[1] == a[2] * a[2])
            System.out.println("yes");
        else
            System.out.println("no");
        cin.close();
    }
}
