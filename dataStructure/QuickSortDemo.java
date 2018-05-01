package dataStructure;

import java.util.Arrays;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = randInts(100);
        new QuickSortDemo().quickSort(arr);
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

    private int partition(int[] arr, int s, int e) {
        int key = arr[s];
        int i = s;
        for (int j = i + 1; j <= e; j++) {
            if (arr[j] < key) {
                swap(arr, i + 1, j);
                i++;
            }
        }
        swap(arr, i, s);
        return i;
    }

    private void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
