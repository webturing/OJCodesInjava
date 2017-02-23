import java.util.Scanner;

public class Main {
	static boolean isPrime(int n){
		if(n==2)return true;
		if(n<2||n%2==0)return false;
		for(int c=3;c*c<=n;c+=2)
			if(n%c==0)
				return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(int m=cin.nextInt();m-->0;){
			int tot=0;
			for(int n=cin.nextInt();n-->0;)
				if(isPrime(cin.nextInt()))
					++tot;
			System.out.println(tot);
		}
		cin.close();
	}
}
