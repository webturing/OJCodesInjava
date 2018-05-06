package books.wxdAlgorithmDesign;

public class AOJ2563MatrixSubMatrix {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                {0, -2, -7, 0},
                {9, 2, -6, 2},
                {-4, 1, -4, 1},
                {-1, 8, 0, 2}
        };
        System.out.println(maxSum2(a));
    }

    private static int maxSum2(int[][] a) {
        int sum = 0;
        int m = a.length, n = a[0].length;

        int[] b = new int[n];
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < n; k++) b[k] = 0;
            for (int j = i; j < m; j++) {
                for (int k = 0; k < n; k++) b[k] += a[j][k];
                int max = maxSumLinear(b);
                if (max > sum) sum = max;
            }
        }

        return sum;
    }

    static int maxSumLinear(int[] a) {
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

}
