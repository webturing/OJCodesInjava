import java.util.Scanner;

public class PCheckStringType {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println(checkType(cin.next(), cin.next()));
        cin.close();
    }

    private static int checkType(String a, String b) {
        if(a.length()!=b.length())
            return 1;
        if(a.equals(b))
            return 2;
        if(a.equalsIgnoreCase(b))
            return 3;
        if(a.equalsIgnoreCase(new StringBuffer(b).reverse().toString()))
            return 4;
        return 5;
    }
}