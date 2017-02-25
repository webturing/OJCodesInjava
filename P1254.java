import java.util.Scanner;

public class P1254 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for (int N = cin.nextInt(); N-- > 0;)
			System.out.println(Integer.parseInt(cin.next().substring(1)));
		cin.close();
	}
}
