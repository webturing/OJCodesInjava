package nyist.part4dataStructure;

import java.util.Scanner;


public class AOJ2023SegmentTree {
    static int[] a;
    static SegTree[] tree;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n, m;
            n = scanner.nextInt();
            m = scanner.nextInt();
            a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = scanner.nextInt();
            }
            tree = new SegTree[4 * n];
            build(1, 1, n);
            while (m-- > 0) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                int sum = query(1, l, r);
                System.out.println(sum);
            }
        }
    }

    private static int query(int root, int left, int right) {
        if (left <= tree[root].left && right >= tree[root].right) {
            return tree[root].val;
        }
        int mid = (tree[root].left + tree[root].right) >> 1;
        if (right <= mid) {
            return query(root << 1, left, right);
        }
        if (mid < left) {
            return query(root << 1 | 1, left, right);
        }
        return query(root << 1, left, mid) + query(root << 1 | 1, mid + 1, right);
    }

    private static void build(int root, int left, int right) {
        tree[root] = new SegTree();
        tree[root].left = left;
        tree[root].right = right;
        if (left == right) {
            tree[root].val = a[left];//建立叶节点元素，后面要更新这个节点元素
            return;
        }
        int mid = (left + right) >> 1;
        build(root << 1, left, mid);
        build(root << 1 | 1, mid + 1, right);
        tree[root].val = tree[root << 1].val + tree[root << 1 | 1].val;
    }

    static class SegTree {
        int left, right, val;
    }
}