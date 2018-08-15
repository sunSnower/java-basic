package myJava.basic.arithmetic.sort;

import java.util.Arrays;

/**
 * 堆通常被看成一棵树的数组对象
 * 解决调度程序的一种数据结构
 * 逻辑定义：
 *          n个元素序列{K1, K2, K3, ... , Kn}
 *          当且满足下列关系
 *          Ki<=K2i && Ki<=K2i+1
 *          或
 *          Ki>=K2i && Ki>=K2i+1
 *          (i = 1, 2, 3, 4, ..., n/2)
 * 性质：
 *      堆总是一颗完全树
 */
public class HeapSort {
    int[] arr;
    HeapSort(int[] arr){
        this.arr = arr;
    }

    /**
     * 创建最大堆
     *
     * @param index
     * @param len
     */
    public void maxHeapify(int index, int len){
        int li = (index << 1) + 1;
        int ri = li + 1;
        int cMax = li;
        if(li > len){
            return;
        }
        if(ri <= len && arr[li] < arr[ri]){
            cMax = ri;
        }
        if(arr[index] < arr[cMax]){
            swap(index, cMax);
            maxHeapify(cMax, len);
        }
    }
    public void swap(int li, int ri){
        int temp = arr[li];
        arr[li] = arr[ri];
        arr[ri] = temp;
    }

    /**
     * 堆排序
     * 时间复杂度：O(nlogn)
     */
    public void sort(){
        int len = arr.length - 1;
        int index = (len-1) >> 1;
        for(int i = index; i >= 0; i--){
            maxHeapify(i, len);
        }

        for(int i = len; i >= 0; i--){
            swap(i, 0);
            maxHeapify(0, i-1);
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        HeapSort heap = new HeapSort(arr);
        heap.sort();
        System.out.println(Arrays.toString(arr));
    }
}
