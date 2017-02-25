import java.util.Arrays;
import java.util.Scanner;

public class P1019 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] a = new int[4];
		for (int i = 0; i < a.length; i++) {
			a[i] = cin.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3]);
		cin.close();
	}
}
