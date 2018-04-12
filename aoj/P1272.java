package aoj;

import java.util.Scanner;

public class P1272 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println(Integer.parseInt(new StringBuilder(cin.next()).reverse().toString()));
        cin.close();
    }
}
