import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1093 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNextLine()){
            String ss[]=cin.nextLine().split("\\s+");
            Arrays.sort(ss, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int ia=Integer.parseInt(o1);
                    int ib=Integer.parseInt(o2);
                    return ib-ia;
                }
            });
            cout.println(ss[0]);
        }
        cout.close();
        cin.close();
    }


}
