import java.io.PrintWriter;
import java.util.Scanner;

public class P1108 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static {
	}
	static final char[] RANK = "EEEEEEDCBAA".toCharArray();

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			if (n < 0 || n > 100)
				cout.println("Score is error!");
			else
				cout.println(RANK[n / 10]);
		}

		cin.close();
		cout.close();
	}
}
