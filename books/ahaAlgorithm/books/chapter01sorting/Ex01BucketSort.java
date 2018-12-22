package books.ahaAlgorithm.books.chapter01sorting;

import java.util.Arrays;

public class Ex01BucketSort {
    public static void main(String[] args) {
        int[] a = {5, 3, 5, 2, 8};
        Ex01BucketSort.sort(a);
        System.out.println(Arrays.toString(a));

    }

    //桶排序
    private static void sort(int[] a) {
        int[] b = new int[11];
        for (int i : a) b[i]++;
        for (int i = 0, k = 0; i < b.length; i++) {
            if (b[i] > 0) {
                for (int j = 0; j < b[i]; j++) a[k++] = i;
            }
        }

    }
}
