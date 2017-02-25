import java.io.PrintWriter;
import java.util.Scanner;

public class P1040 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static {
	}

	public static void main(String[] args) {
		int n = cin.nextInt();
		if (n % 2 == 1)
			++n;
		cout.println(n / 2 * n / 2);
		cin.close();
		cout.close();
	}
}
