package books.ahaAlgorithm.books.chapter01sorting;

import java.util.Arrays;

public class Ex03QuickSort {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 9, 7, 10, 8};
        Ex03QuickSort.sort(a);
        System.out.println(Arrays.toString(a));

    }

    //快速排序
    private static void sort(int[] a) {
        sort(a, 0, a.length - 1);

    }

    private static void sort(int[] a, int left, int right) {
        if (left < right) {
            int p = partition(a, left, right);
            sort(a, left, p - 1);
            sort(a, p + 1, right);
        }
    }

    private static int partition(int[] a, int left, int right) {
        int temp = a[left];
        int i = left, j = right;
        while (i < j) {
            while (a[j] >= temp && i < j) j--;
            while (a[i] <= temp && i < j) i++;
            if (i < j) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        a[left] = a[i];
        a[i] = temp;
        return i;
    }
}
