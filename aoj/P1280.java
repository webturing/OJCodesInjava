package aoj;

import java.util.Scanner;

public class P1280 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        if (n % 2 == 0)
            System.out.println("yes");
        else
            System.out.println("no");
        cin.close();
    }
}
