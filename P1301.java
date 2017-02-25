
import java.io.PrintWriter;
import java.util.Scanner;

public class P1301 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static {
	}

	public static void main(String[] args) {
		for (; cin.hasNext(); cout.println((int) Math.pow(cin.nextInt(), 3)))
			;
		cin.close();
		cout.close();
	}
}
