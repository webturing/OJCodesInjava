import java.io.PrintWriter;
import java.util.Scanner;

public class P1571 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static {
	}

	public static void main(String[] args) {
		for (int n = cin.nextInt(); n-- > 0;) {
			int m = cin.nextInt();
			cout.println(m * (m + 1) * (m + 2) / 6);
		}
		cin.close();
		cout.close();
	}
}
