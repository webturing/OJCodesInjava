package aoj;

import java.util.Scanner;

public class P1313 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        for (int i = 7; i <= N; i++)
            if (i % 7 == 0 || Integer.toString(i).contains("7"))
                System.out.println(i);
        cin.close();
    }
}
