import java.io.PrintWriter;
import java.util.Scanner;

public class P1276 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static {
	}
	static final char[] RANK = "EEEEEEDCBAA".toCharArray();

	public static void main(String[] args) {
		float f = cin.nextFloat();
		cout.println(String.format("%.3f", 5 * (f - 32) / 9));

		cin.close();
		cout.close();
	}
}
