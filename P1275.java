import java.util.Scanner;

public class P1275 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a[] = new int[3];
		for (int i = 0; i < a.length; i++)
			a[i] = cin.nextInt();
		System.out.println(String.format("%.3f", (a[0] + a[1] + a[2]) / 3.0));
		cin.close();
	}
}
