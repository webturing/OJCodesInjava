package aoj;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by ZHAO Jing on 7/28/2017.
 * Sample Input
 * <p/>
 * 7
 * 45 13 12 16 9 5 22
 * 3 3 0 2 1 0
 * Sample Output
 * <p/>
 * 136
 */
public class P1378 {
    static int size, Q[], m[];
    static PriorityQueue<Integer> pq;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        size = cin.nextInt();
        Q = new int[size];
        m = new int[size + 1];
        for (int i = 0; i < Q.length; i++)
            Q[i] = cin.nextInt();
        int s = 0;
        for (int i = 2; i < m.length; i++) {
            m[i] = cin.nextInt();
            s += (i - 1)*m[i];
        }
        if (s < size-1)
            System.out.println("No solution!");
        else {
            pq = new PriorityQueue<Integer>();
            for (int q : Q) pq.add(q);
            System.out.println(greedy(pq, m));
        }

    }

    private static int greedy(PriorityQueue<Integer> pq, int[] m) {


        for (int i = pq.size(); i < m.length; i++)
            if (m[i] > 0) {
                int tot = 0;
                for (Integer p : pq)
                    tot += p;
                return tot;
            }
        int min = 100000;
        for (int i = 2; i < m.length; i++) {
            if (m[i] > 0 && pq.size() > m[i]) {
                PriorityQueue<Integer> temp = new PriorityQueue<Integer>();
                temp.addAll(pq);
                int dx = 0;
                for (int j = 0; j < m[i]; j++)
                    dx += temp.poll();
                temp.add(dx);
                m[i]--;
                dx += greedy(temp, m);
                if (dx < min) min = dx;
                m[i]++;
            }
        }
        return min;
    }
}
