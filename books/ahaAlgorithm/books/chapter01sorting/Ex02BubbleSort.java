package books.ahaAlgorithm.books.chapter01sorting;

import java.util.Arrays;

public class Ex02BubbleSort {
    public static void main(String[] args) {
        int[] a = {12, 35, 99, 18, 76};
        Ex02BubbleSort.sort(a);
        System.out.println(Arrays.toString(a));

    }

    //冒泡排序
    private static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }

    }
}
