package myJava.basic.arithmetic.sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeSort {
    int[] arr;
    MergeSort(int[] arr){
        this.arr = arr;
    }

    /**
     * 归并排序
     * 是分治法的一种典型应用，且各层可以分开进行
     * 时间复杂度为：O(nlogn)
     *
     * @param arr
     * @param result
     * @param start
     * @param end
     */
    static void merge_sort_recursive(int[] arr, int[] result, int start, int end) {
        if (start >= end){
            return;
        }
        int len = end - start, mid = (len >> 1) + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        merge_sort_recursive(arr, result, start1, end1);
        merge_sort_recursive(arr, result, start2, end2);
        int k = start;
        while (start1 <= end1 && start2 <= end2){
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        }
        while (start1 <= end1){
            result[k++] = arr[start1++];
        }
        while (start2 <= end2){
            result[k++] = arr[start2++];
        }
        for (k = start; k <= end; k++){
            arr[k] = result[k];
        }
    }
    public static void merge_sort(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        merge_sort_recursive(arr, result, 0, len - 1);
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        merge_sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
