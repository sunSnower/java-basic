package myJava.basic.arithmetic.sort;

import java.util.Arrays;

public class QuickSort {
    int[] arr;
    QuickSort(int[] arr){
        this.arr = arr;
    }

    synchronized public void swap(int li, int ri){
        int tempValue = arr[li];
        arr[li] = arr[ri];
        arr[ri] = tempValue;
    }

    /**
     * 时间复杂度：
     * 最好情况下为O(nlogn)
     * 最坏情况下为O(n^2)
     *
     * @param head
     * @param tail
     */
    public void sort(int head, int tail){
        if(arr==null || arr.length<=0 || head>=tail){
            return;
        }
        int tempHead = head;
        int tempTail = tail;
        int pivot = arr[(head+tail)/2];
        while(tempHead <= tempTail){
            while(arr[tempHead] < pivot){
                ++tempHead;
            }
            while(arr[tempTail] > pivot){
                --tempTail;
            }
            if(tempHead < tempTail){
                swap(tempHead, tempTail);
                ++tempHead;
                --tempTail;
            }
            if(tempHead == tempTail){
                ++tempHead;
            }
        }

        sort(head, tempTail);
        sort(tempHead, tail);
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        QuickSort quickSort = new QuickSort(arr);
        quickSort.sort(0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
