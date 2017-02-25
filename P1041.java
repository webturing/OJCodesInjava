import java.io.PrintWriter;
import java.util.Scanner;

public class P1041 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static {
	}

	public static void main(String[] args) {
		int n = cin.nextInt();
		double tot = 0;
		for (int i = 1; i <= n; i++)
			tot += 1. / i;
		cout.println(String.format("%.6f", tot));
		cin.close();
		cout.close();
	}
}
