import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] a=new int[10];
        for(int i=0;i<a.length;i++)a[i]=cin.nextInt();
        Arrays.sort(a);
        for(int i=a.length-1;i>=0;i--)
            System.out.print(a[i]+" ");
        cin.close();
    }
}
 