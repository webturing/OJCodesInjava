package aoj;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class P1213 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
    static Vector<Integer> vector = new Vector<Integer>();

    static {
        vector.add(1);
    }


    static void find(Integer key) {

        for (int i = vector.get(vector.size() - 1) + 1; i <= key; i++)
            if (!Integer.toString(i).contains("0") && !vector.contains(i))
                vector.add(i);
        int index = Collections.binarySearch(vector, key);
        if (index >= 0)
            cout.println(index + 1);
        else
            cout.println("Unlucky");

    }


    public static void main(String[] args) {
        for (; cin.hasNext(); find(cin.nextInt())) ;

        cout.close();
        cin.close();
    }

}
