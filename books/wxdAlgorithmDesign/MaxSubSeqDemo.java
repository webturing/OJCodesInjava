package books.wxdAlgorithmDesign;

import java.util.Arrays;

public class MaxSubSeqDemo {
    public static void main(String[] args) {
        int[] a = new int[]{-2, 11, -4, 13, -5, -2,};
        System.out.println(Arrays.toString(maxSumCube(a)));
        System.out.println(Arrays.toString(maxSumSquare(a)));
        System.out.println(maxSumNlogN(a));
        System.out.println(maxSumLinear(a));
    }

    private static int maxSumLinear(int[] a) {
        int n = a.length - 1;
        int sum = 0;
        int b = 0;
        for (int i = 0; i <= n; i++) {
            if (b > 0)
                b += a[i];
            else
                b = a[i];
            if (b > sum) sum = b;
        }
        return sum;
    }

    private static int maxSumNlogN(int[] a) {

        return maxSumNlogN(a, 0, a.length - 1);
    }

    private static int maxSumNlogN(int[] a, int left, int right) {
        if (left == right)
            return a[left] > 0 ? a[left] : 0;
        int center = (left + right) / 2;
        int leftSum = maxSumNlogN(a, left, center);
        int rightSum = maxSumNlogN(a, center + 1, right);
        int s1 = 0, lefts = 0;
        for (int i = center; i >= left; i--) {
            lefts += a[i];
            if (lefts > s1) s1 = lefts;
        }
        int s2 = 0, rights = 0;
        for (int i = center + 1; i <= right; i++) {
            rights += a[i];
            if (rights > s2) s2 = rights;
        }

        return Math.max(s1 + s2, Math.max(leftSum, rightSum));
    }

    private static int[] maxSumSquare(int[] a) {
        int n = a.length;
        int sum = a[0], besti = 0, bestj = 0;
        for (int i = 0; i < n; i++) {
            int thisSum = 0;
            for (int j = i; j < n; j++) {
                thisSum += a[j];

                if (thisSum > sum) {
                    sum = thisSum;
                    besti = i;
                    bestj = j;
                }
            }

        }
        return new int[]{sum, besti, bestj};
    }

    /**
     * 简单解法O(n^3)
     *
     * @param a
     * @return
     */
    private static int[] maxSumCube(int[] a) {
        int n = a.length;
        int sum = a[0];
        int besti = 0;
        int bestj = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int thisSum = 0;
                for (int k = i; k <= j; k++)
                    thisSum += a[k];

                if (thisSum > sum) {
                    sum = thisSum;
                    besti = i;
                    bestj = j;
                }
            }
        }
        return new int[]{sum, besti, bestj};
    }

}
