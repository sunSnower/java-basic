package arithmetic.test;

public class TopK {
    int[] arr;
    TopK(int[] arr){
        this.arr = arr;
    }

    public void swap(int li, int ri){
        int temp = arr[li];
        arr[li] = arr[ri];
        arr[ri] = temp;
    }
    public void maxHeapify(int index, int len){
        int li = (index << 1) + 1;
        int ri = li + 1;
        if(li > len){
            return;
        }
        int cMax = li;
        if(ri <= len && arr[ri] > arr[li]){
            cMax = ri;
        }
        if(arr[index] < arr[cMax]){
            swap(index, cMax);
            maxHeapify(cMax, len);
        }
    }

    public int getTheMinOfK(int k){
        int len = arr.length - 1;
        int index = len >> 1;
        for(int i = index; i >= 0; i--){
            maxHeapify(i, len);
        }

        for(int i = 0; i < k; i++){
            maxHeapify(0, len-i);
            swap(0, len-i);
        }

        return arr[len-k+1];
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        TopK topK = new TopK(arr);
        System.out.println(topK.getTheMinOfK(5));
    }
}
