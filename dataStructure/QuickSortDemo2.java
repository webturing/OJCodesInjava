package dataStructure;

import java.util.Arrays;

public class QuickSortDemo2 {
    public static void main(String[] args) {
        int[] arr = randInts(20);
        new QuickSortDemo2().quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] randInts(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 100);
        return arr;
    }

    private void quickSort(int[] ints) {
        quickSort(ints, 0, ints.length - 1);
    }

    private void quickSort(int[] arr, int s, int e) {
        if (s >= e)
            return;
        int p = partition(arr, s, e);
        quickSort(arr, s, p - 1);
        quickSort(arr, p + 1, e);
    }

    int partition(int[] arr, int low, int high) {

        int l = low;
        int h = high;
        int povit = arr[low];

        while (l < h) {
            while (l < h && arr[h] >= povit)
                h--;
            if (l < h) {
                swap(arr, l, h);
                l++;
            }

            while (l < h && arr[l] <= povit)
                l++;

            if (l < h) {
                swap(arr, l, h);
                h--;
            }
        }
        return l;
    }

    private void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
