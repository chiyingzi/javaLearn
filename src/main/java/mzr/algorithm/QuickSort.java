package mzr.algorithm;

/**
 * Created by mzr on 17-3-10.
 */
public class QuickSort {

    public static int partition(int[] array, int lo, int hi) {
        //固定的切分方式
        int key = array[lo];
        while (lo < hi) {
            while (array[hi] >= key && hi > lo) {//从后半部分向前扫描
                hi--;
            }
            array[lo] = array[hi];
            while (array[lo] <= key && hi > lo) {//从前半部分向后扫描
                lo++;
            }
            array[hi] = array[lo];
        }
        array[hi] = key;
        return hi;
    }

    public static void sort(int[] array, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int index = partition(array, lo, hi);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
        sort(array, lo, index - 1);
        sort(array, index + 1, hi);
    }

    public static void main(String[] args) {
        int array[] = {10, 2, 6, 3, 9, 7, 4, 5, 8};
        sort(array, 0, 8);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }


}