package aoj;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class P1186 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
    static HashMap<String, String> map = new HashMap<String, String>();

    static {
        map.put("0", "0000");
        map.put("1", "0001");
        map.put("2", "0010");
        map.put("3", "0011");
        map.put("4", "0100");
        map.put("5", "0101");
        map.put("6", "0110");
        map.put("7", "0111");
        map.put("8", "1000");
        map.put("9", "1001");
        map.put("A", "1010");
        map.put("B", "1011");
        map.put("C", "1100");
        map.put("D", "1101");
        map.put("E", "1110");
        map.put("F", "1111");


    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            for (char c : cin.next().toCharArray())
                cout.print(map.get(Character.toString(c)));
            cout.println();
        }
        cout.close();
        cin.close();
    }


}
