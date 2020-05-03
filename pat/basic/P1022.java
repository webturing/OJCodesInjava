package pat.basic;

import java.util.Scanner;

public class P1022 {

    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        int a = cin.nextInt();
        int b = cin.nextInt();
        int d = cin.nextInt();
        System.out.println(Integer.toString(a + b, d));
        cin.close();
    }
}
