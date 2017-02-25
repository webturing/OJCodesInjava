import java.io.PrintWriter;
import java.util.Scanner;

public class P1273 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static {
	}

	public static void main(String[] args) {
		int a = cin.nextInt(), b = cin.nextInt();
		cout.println(String.format("%d %d", b, a));
		cin.close();
		cout.close();
	}
}
