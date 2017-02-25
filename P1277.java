import java.io.PrintWriter;
import java.util.Scanner;

public class P1277 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static {
	}

	public static void main(String[] args) {
		int n = cin.nextInt();
		cout.println(1L * n * (n + 1) / 2);
		cin.close();
		cout.close();
	}
}
