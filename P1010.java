package acm.ahstu.cc;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1010 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static {
	}

	public static void main(String[] args) {
		int n = cin.nextInt();
		int a = n % 1000 / 100;
		int b = n % 100 / 10;
		int c = n % 10;
		if (n == a * a * a + b * b * b + c * c * c)
			cout.println(1);
		else
			cout.println(0);
		cin.close();
		cout.close();
	}
}
