package myJava.basic.arithmetic.sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeSort {
    int[] arr;
    MergeSort(int[] arr){
        this.arr = arr;
    }

    public void mergeSort(){
        
    }
    public void mergeArr(int[] fragement1, int[] fragement2, int[] merge){
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        if(fragement1==null || fragement1.length<1 || fragement1==null || fragement2.length<1){
            return;
        }
        while(index1<fragement1.length && index2<fragement2.length){
            while(fragement1[index1] <= fragement2[index2]){
                merge[index3++] = fragement1[index1++];
            }
            while(fragement2[index2] < fragement1[index1]){
                merge[index3++] = fragement2[index2++];
            }
        }
    }

    public static void main(String[] args){
        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));
    }
}
