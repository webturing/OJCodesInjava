package aoj;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P2466 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int arr[] = {cin.nextInt(), cin.nextInt(), cin.nextInt()};
        Arrays.sort(arr);
        System.out.println(String.format("%d %d %d", arr[2], arr[1], arr[0]));
        cout.close();
        cin.close();
    }
}
