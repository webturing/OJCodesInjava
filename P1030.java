import java.util.Arrays;
import java.util.Scanner;

public class P1030 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        boolean[] prime = new boolean[cin.nextInt() + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= prime.length; i++)
            if (prime[i])
                for (int j = i * i; j < prime.length; j += i)
                    prime[j] = false;
        for (int i = 1; i < prime.length; i++)
            if (prime[i])
                System.out.print(i + " ");
        cin.close();
    }
}
