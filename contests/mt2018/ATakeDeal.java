package contests.mt2018;

import java.util.Scanner;

public class ATakeDeal {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            int[] a = new int[n + 1];
            int[] b = new int[n + 1];
            int originalPrice = 0;
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                a[i] = cin.nextInt() * 100;
                b[i] = cin.nextInt();
                originalPrice += a[i];
                if (b[i] == 0) {
                    sum += a[i];
                } else {
                    sum += a[i] * 4 / 5;//打折
                }
            }
            int min = sum;
            Node[] nodes = new Node[m + 1];
            for (int i = 1; i <= m; i++) {
                nodes[i] = new Node(cin.nextInt(), cin.nextInt());
                if (nodes[i].x <= originalPrice) {
                    min = Math.min(min, originalPrice - nodes[i].y);
                }
            }
            String string = Integer.toString(min);
            System.out.println(string.substring(0, string.length() - 2) + "." + string.substring(string.length() - 2));
        }
    }

    static class Node {
        int x, y;

        public Node(int x, int y) {
            super();
            this.x = x * 100;
            this.y = y * 100;
        }

    }
}